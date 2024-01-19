package net.xpoxy.triballarie.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.Triballarie;

public class ModBlocks {
    public static final Block BONFIRE = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block BONFIRE_TRIBAL = new BonfireTribalBlock(FabricBlockSettings.create().strength(2.0f));

    public static void RegisterAll() {
        Registry.register(Registries.BLOCK, new Identifier(Triballarie.MOD_PREFIX, "bonfire"), BONFIRE);
        Registry.register(Registries.BLOCK, new Identifier(Triballarie.MOD_PREFIX, "bonfire_tribal"), BONFIRE_TRIBAL);
    }
}
