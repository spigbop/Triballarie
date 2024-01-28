package net.xpoxy.triballarie.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;

/**
 * Simple class to make block placing items that have a 2d item texture just like beds or campfires.
 */
public class PlaceBlockItem extends BlockItem {
    public PlaceBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    protected boolean place(ItemPlacementContext context, BlockState state) {
        return context.getWorld().setBlockState(context.getBlockPos(), state);
        //return context.getWorld().setBlockState(context.getBlockPos(), state, 26);
    }
}
