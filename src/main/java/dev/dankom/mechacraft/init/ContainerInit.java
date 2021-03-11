package dev.dankom.mechacraft.init;

import dev.dankom.mechacraft.Mechacraft;
import dev.dankom.mechacraft.container.CokeOvenContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Mechacraft.MOD_ID);

    public static final RegistryObject<ContainerType<CokeOvenContainer>> COKE_OVEN = CONTAINERS
            .register("coke_oven", () -> IForgeContainerType.create(CokeOvenContainer::new));
}
