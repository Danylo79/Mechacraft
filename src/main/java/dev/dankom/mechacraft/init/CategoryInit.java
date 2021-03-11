package dev.dankom.mechacraft.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CategoryInit {
    public static final ItemGroup ITEMS = new ItemGroup("mechacraft_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.COPPER_WIRE.get());
        }
    };

    public static final ItemGroup BLOCKS = new ItemGroup("mechacraft_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.COKE_OVEN_BLOCK.get());
        }
    };
}
