package net.xpoxy.triballarie.block.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

//public class BonfireTribalBlockEntity extends BlockEntity implements NamedScreenHandlerFactory {
//    public BonfireTribalBlockEntity(BlockPos pos, BlockState state) {
//        super(pos, state);
//    }
//
//    @Override
//    public Text getDisplayName() {
//        return Text.translatable("container.triballarie.tribe");
//    }
//
//    @Nullable
//    @Override
//    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
//        return null;
//    }
//
////    public static class Type extends BlockEntityType<BonfireTribalBlockEntity> {
////        public static Type INSTANCE = new Type();
////
////        private Type(BlockEntityFactory<? extends BonfireTribalBlockEntity> factory, Set<Block> blocks, com.mojang.datafixers.types.Type<?> type) {
////            super(BonfireTribalBlockEntity::new, blocks, null);
////        }
////    }
//}
