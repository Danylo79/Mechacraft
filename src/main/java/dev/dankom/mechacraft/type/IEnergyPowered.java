package dev.dankom.mechacraft.type;

import dev.dankom.mechacraft.blocks.blocks.ConnectorBlock;
import dev.dankom.mechacraft.blocks.blocks.GeneratorBlock;
import dev.dankom.mechacraft.blocks.blocks.WireBlock;
import dev.dankom.mechacraft.init.BlockInit;
import dev.dankom.mechacraft.util.BlockUtil;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public interface IEnergyPowered {
    default boolean isPowered(BlockPos pos) {
        if (!(this instanceof GeneratorBlock) && isNextToGenerator(pos)) {
            return isGeneratorPowered(pos);
        } else if (!(this instanceof WireBlock) && isNextToWire(pos)) {
            return isWirePowered(pos);
        } else if (!(this instanceof ConnectorBlock) && isNextToConnector(pos)) {
            return isConnectorPowered(pos);
        }
        return false;
    }

    default boolean isNextToConnector(BlockPos pos) {
        return BlockUtil.isBlockAdjacent(pos, BlockInit.WIRE_CONNECTOR.get());
    }

    default boolean isConnectorPowered(BlockPos pos) {
        BlockState connector = BlockUtil.getAdjacentBlock(pos, BlockInit.WIRE_CONNECTOR.get());
        if (connector != null) {
            return ((IEnergyPowered) connector.getBlock()).isPowered(BlockUtil.getAdjacentBlockPos(pos, BlockInit.WIRE_CONNECTOR.get()));
        }
        return false;
    }

    default boolean isNextToWire(BlockPos pos) {
        return BlockUtil.isBlockAdjacent(pos, BlockInit.WIRE.get());
    }

    default boolean isWirePowered(BlockPos pos) {
        BlockState connector = BlockUtil.getAdjacentBlock(pos, BlockInit.WIRE.get());
        if (connector != null) {
            return ((IEnergyPowered) connector.getBlock()).isPowered(BlockUtil.getAdjacentBlockPos(pos, BlockInit.WIRE.get()));
        }
        return false;
    }

    default boolean isNextToGenerator(BlockPos pos) {
        return BlockUtil.isBlockAdjacent(pos, BlockInit.GENERATOR.get());
    }

    default boolean isGeneratorPowered(BlockPos pos) {
        BlockState connector = BlockUtil.getAdjacentBlock(pos, BlockInit.GENERATOR.get());
        if (connector != null) {
            return ((IEnergyPowered) connector.getBlock()).isPowered(BlockUtil.getAdjacentBlockPos(pos, BlockInit.GENERATOR.get()));
        }
        return false;
    }
}
