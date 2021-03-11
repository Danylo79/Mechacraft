package dev.dankom.mechacraft.init;

import dev.dankom.mechacraft.Mechacraft;
import dev.dankom.mechacraft.tileentity.CokeOvenTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
    public static final DeferredRegister<TileEntityType<?>> TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Mechacraft.MOD_ID);

    public static final RegistryObject<TileEntityType<CokeOvenTileEntity>> COKE_OVEN = TYPES
            .register("coke_oven", () -> TileEntityType.Builder
                    .create(CokeOvenTileEntity::new, BlockInit.COKE_OVEN.get()).build(null));
}
