package dev.dankom.mechacraft.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class BlockUtil {
    public static boolean isBlockAdjacent(BlockPos block, Block adjacent) {
        Block above = null;
        try {
            above = Minecraft.getInstance().world.getBlockState(block.up()).getBlock();
        } catch (NullPointerException e) {}
        Block below = null;
        try {
            below = Minecraft.getInstance().world.getBlockState(block.down()).getBlock();
        } catch (NullPointerException e) {}

        Block east = null;
        try {
            east = Minecraft.getInstance().world.getBlockState(block.east()).getBlock();
        } catch (NullPointerException e) {}
        Block west = null;
        try {
            west = Minecraft.getInstance().world.getBlockState(block.west()).getBlock();
        } catch (NullPointerException e) {}
        Block north = null;
        try {
            north = Minecraft.getInstance().world.getBlockState(block.north()).getBlock();
        } catch (NullPointerException e) {}
        Block south = null;
        try {
            south = Minecraft.getInstance().world.getBlockState(block.south()).getBlock();
        } catch (NullPointerException e) {}


        return (above != null && above.matchesBlock(adjacent)) || (below != null && below.matchesBlock(adjacent)) || ((below != null && below.matchesBlock(adjacent))) || (east != null && east.matchesBlock(adjacent)) || (west != null && west.matchesBlock(adjacent)) || (north != null && north.matchesBlock(adjacent)) || (south != null && south.matchesBlock(adjacent));
    }

    public static BlockState getAdjacentBlock(BlockPos block, Block adjacent) {
        BlockState above = null;
        try {
            above = Minecraft.getInstance().world.getBlockState(block.up());
        } catch (NullPointerException e) {}
        BlockState below = null;
        try {
            below = Minecraft.getInstance().world.getBlockState(block.down());
        } catch (NullPointerException e) {}

        BlockState east = null;
        try {
            east = Minecraft.getInstance().world.getBlockState(block.east());
        } catch (NullPointerException e) {}
        BlockState west = null;
        try {
            west = Minecraft.getInstance().world.getBlockState(block.west());
        } catch (NullPointerException e) {}
        BlockState north = null;
        try {
            north = Minecraft.getInstance().world.getBlockState(block.north());
        } catch (NullPointerException e) {}
        BlockState south = null;
        try {
            south = Minecraft.getInstance().world.getBlockState(block.south());
        } catch (NullPointerException e) {}


        if (above != null && above.getBlock().matchesBlock(adjacent)) {
            return above;
        } else if (below != null && below.getBlock().matchesBlock(adjacent)) {
            return below;
        } else if (east != null && east.getBlock().matchesBlock(adjacent)) {
            return east;
        } else if (west != null && west.getBlock().matchesBlock(adjacent)) {
            return west;
        } else if (north != null && north.getBlock().matchesBlock(adjacent)) {
            return north;
        } else if (south != null && south.getBlock().matchesBlock(adjacent)) {
            return south;
        }
        return null;
    }

    public static BlockPos getAdjacentBlockPos(BlockPos block, Block adjacent) {
        Block above = null;
        try {
            above = Minecraft.getInstance().world.getBlockState(block.up()).getBlock();
        } catch (NullPointerException e) {}
        Block below = null;
        try {
            below = Minecraft.getInstance().world.getBlockState(block.down()).getBlock();
        } catch (NullPointerException e) {}

        Block east = null;
        try {
            east = Minecraft.getInstance().world.getBlockState(block.east()).getBlock();
        } catch (NullPointerException e) {}
        Block west = null;
        try {
            west = Minecraft.getInstance().world.getBlockState(block.west()).getBlock();
        } catch (NullPointerException e) {}
        Block north = null;
        try {
            north = Minecraft.getInstance().world.getBlockState(block.north()).getBlock();
        } catch (NullPointerException e) {}
        Block south = null;
        try {
            south = Minecraft.getInstance().world.getBlockState(block.south()).getBlock();
        } catch (NullPointerException e) {}


        if (above != null && above.matchesBlock(adjacent)) {
            return block.up();
        } else if (below != null && below.matchesBlock(adjacent)) {
            return block.down();
        } else if (east != null && east.matchesBlock(adjacent)) {
            return block.east();
        } else if (west != null && west.matchesBlock(adjacent)) {
            return block.west();
        } else if (north != null && north.matchesBlock(adjacent)) {
            return block.north();
        } else if (south != null && south.matchesBlock(adjacent)) {
            return block.south();
        }
        return null;
    }
}
