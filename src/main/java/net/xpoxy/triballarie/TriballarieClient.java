package net.xpoxy.triballarie;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.xpoxy.triballarie.entity.ModEntities;
import net.xpoxy.triballarie.entity.client.GoblinModel;
import net.xpoxy.triballarie.entity.client.GoblinRenderer;
import net.xpoxy.triballarie.entity.client.ModModelLayers;

public class TriballarieClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GOBLIN, GoblinRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GOBLIN, GoblinModel::getTexturedModelData);
    }
}
