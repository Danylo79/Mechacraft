package dev.dankom.mechacraft.init;

import dev.dankom.mechacraft.Mechacraft;
import dev.dankom.mechacraft.blocks.blocks.CokeOvenBlock;
import dev.dankom.mechacraft.blocks.blocks.ConnectorBlock;
import dev.dankom.mechacraft.blocks.blocks.GeneratorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mechacraft.MOD_ID);

    public static final RegistryObject<Block> COKE_OVEN = BLOCKS.register("coke_oven", () -> new CokeOvenBlock(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> WIRE_CONNECTOR = BLOCKS.register("wire_connector", () -> new ConnectorBlock(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> WIRE = BLOCKS.register("wire", () -> new ConnectorBlock(Block.Properties.create(Material.IRON)));;
    public static final RegistryObject<Block> GENERATOR = BLOCKS.register("generator", () -> new GeneratorBlock(Block.Properties.create(Material.IRON)));;
}
