package dev.dankom.mechacraft;

import dev.dankom.mechacraft.init.BlockInit;
import dev.dankom.mechacraft.init.ContainerInit;
import dev.dankom.mechacraft.init.ItemInit;
import dev.dankom.mechacraft.init.TileEntityInit;
import dev.dankom.mechacraft.util.ClientEventBusSubscriber;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mechacraft.MOD_ID)
public class Mechacraft {
    private static Mechacraft instance;

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mechacraft";

    public Mechacraft() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        init(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ClientEventBusSubscriber());

        instance = this;
    }

    public void init(IEventBus bus) {
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        ContainerInit.CONTAINERS.register(bus);
        TileEntityInit.TYPES.register(bus);
    }

    public static Mechacraft getInstance() {
        return instance;
    }
}
