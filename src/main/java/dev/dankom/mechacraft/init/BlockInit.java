package dev.dankom.mechacraft.init;

import dev.dankom.mechacraft.Mechacraft;
import dev.dankom.mechacraft.blocks.CokeOvenBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mechacraft.MOD_ID);

    public static final RegistryObject<Block> COKE_OVEN = BLOCKS.register("coke_oven", () -> new CokeOvenBlock(Block.Properties.create(Material.ROCK)));
}
