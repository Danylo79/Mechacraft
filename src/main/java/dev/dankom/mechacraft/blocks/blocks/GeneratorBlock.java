package dev.dankom.mechacraft.blocks.blocks;

import dev.dankom.mechacraft.type.IEnergyPowered;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class GeneratorBlock extends Block implements IEnergyPowered {
    public GeneratorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isPowered(BlockPos pos) {
        return true;
    }
}
