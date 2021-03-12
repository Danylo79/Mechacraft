package dev.dankom.mechacraft.init;

import dev.dankom.mechacraft.Mechacraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mechacraft.MOD_ID);

    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> GOLD_WIRE = ITEMS.register("gold_wire", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> POWER_CONVERTER = ITEMS.register("power_converter", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> SMALL_GEAR = ITEMS.register("small_gear", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> LARGE_GEAR = ITEMS.register("large_gear", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new Item(new Item.Properties().group(CategoryInit.ITEMS)));

    public static final RegistryObject<Item> COKE_OVEN_BLOCK = ITEMS.register("coke_oven", () -> new BlockItem(BlockInit.COKE_OVEN.get(), new Item.Properties().group(CategoryInit.BLOCKS)));
    public static final RegistryObject<Item> WIRE_CONNECTOR_BLOCK = ITEMS.register("wire_connector_block", () -> new BlockItem(BlockInit.WIRE_CONNECTOR.get(), new Item.Properties().group(CategoryInit.BLOCKS)));
    public static final RegistryObject<Item> WIRE_BLOCK = ITEMS.register("wire", () -> new BlockItem(BlockInit.WIRE.get(), new Item.Properties().group(CategoryInit.BLOCKS)));
    public static final RegistryObject<Item> GENERATOR = ITEMS.register("generator", () -> new BlockItem(BlockInit.GENERATOR.get(), new Item.Properties().group(CategoryInit.BLOCKS)));
}
