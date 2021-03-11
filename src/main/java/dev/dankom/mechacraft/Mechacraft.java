package dev.dankom.mechacraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mechacraft.MOD_ID)
public class Mechacraft {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mechacraft";

    public Mechacraft() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
