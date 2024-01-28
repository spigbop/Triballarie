package net.xpoxy.triballarie;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.xpoxy.triballarie.block.TriballarieBlocks;
import net.xpoxy.triballarie.entity.TriballarieEntities;
import net.xpoxy.triballarie.entity.client.GoblinModel;
import net.xpoxy.triballarie.entity.client.GoblinRenderer;
import net.xpoxy.triballarie.entity.client.ModModelLayers;
import net.xpoxy.triballarie.screen.TribalScreen;
import net.xpoxy.triballarie.screen.TriballarieScreenHandlerTypes;

public class TriballarieClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TriballarieBlocks.BONFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TriballarieBlocks.BONFIRE_TRIBAL, RenderLayer.getCutout());

        EntityRendererRegistry.register(TriballarieEntities.GOBLIN, GoblinRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GOBLIN, GoblinModel::getTexturedModelData);
    }
}
