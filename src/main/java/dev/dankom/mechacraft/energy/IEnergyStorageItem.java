package dev.dankom.mechacraft.energy;

import dev.dankom.mechacraft.util.ChatColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public abstract class IEnergyStorageItem extends Item {
    private int max;

    public IEnergyStorageItem(int max, Properties properties) {
        super(properties);
        this.max = max;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        update(this, stack, tooltip);
    }

    public int getEnergy(ItemStack stack) {
        CompoundNBT nbt = getNBT(stack);
        if (!nbt.contains("stored")) {
            nbt.putInt("stored", 0);
        }
        return nbt.getInt("stored");
    }

    public int getMax() {
        return max;
    }

    public static void update(IEnergyStorageItem storageItem, ItemStack stack, List<ITextComponent> tooltip) {
        int section = storageItem.getMax() / 3;
        int stored = storageItem.getEnergy(stack);
        String color = null;
        if (stored < section) {
            color = ChatColor.RED.code();
        } else if (stored > section && stored < section * 2) {
            color = ChatColor.YELLOW.code();
        } else if (stored > section * 2 && stored < section * 3) {
            color = ChatColor.GREEN.code();
        }
        tooltip.add(ChatColor.translateTextComponent("&7Storage " + color + stored + "&7/" + storageItem.getMax()));
    }

    public CompoundNBT getNBT(ItemStack stack) {
        return stack.getOrCreateTag();
    }
}
