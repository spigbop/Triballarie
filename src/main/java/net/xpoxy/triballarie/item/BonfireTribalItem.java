package net.xpoxy.triballarie.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;

public class BonfireTribalItem extends BlockItem {
    public BonfireTribalItem(Block block, Settings settings) {
        super(block, settings);
    }

    protected boolean place(ItemPlacementContext context, BlockState state) {
        return context.getWorld().setBlockState(context.getBlockPos(), state, 26);
    }
}
