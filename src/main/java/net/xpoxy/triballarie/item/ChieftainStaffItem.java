package net.xpoxy.triballarie.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.xpoxy.triballarie.block.ModBlocks;

public class ChieftainStaffItem extends Item {
    public ChieftainStaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World mcworld = context.getWorld();
        if(!mcworld.isClient()) {
            BlockPos usedpos = context.getBlockPos();
            if(mcworld.getBlockState(usedpos).getBlock() == Blocks.CAMPFIRE) {
                mcworld.breakBlock(usedpos, false);
                mcworld.setBlockState(usedpos, ModBlocks.BONFIRE_TRIBAL.getDefaultState());
                // Advancement
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.FAIL;
    }
}
