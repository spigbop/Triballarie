package net.xpoxy.triballarie.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.xpoxy.triballarie.Triballarie;

public class TriballarieBlocks {
    protected static final AbstractBlock.Settings BONFIRE_SHARED_SETTINGS = AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3f).luminance(state -> 15).nonOpaque();
    public static final Block BONFIRE = reg("bonfire", new Block(BONFIRE_SHARED_SETTINGS.burnable()));
    public static final Block BONFIRE_TRIBAL = reg("bonfire_tribal", new BonfireTribalBlock(BONFIRE_SHARED_SETTINGS.dropsLike(Blocks.CAMPFIRE)));

    protected static Block reg(String id, Block item) {
        Triballarie.LOGGER.info("Registering (block) - triballarie:" + id);
        return Registry.register(Registries.BLOCK, Triballarie.identify(id), item);
    }

    public static void finalise() {
        Triballarie.LOGGER.info("Registering all (blocks) triballarie:*");
    }
}
