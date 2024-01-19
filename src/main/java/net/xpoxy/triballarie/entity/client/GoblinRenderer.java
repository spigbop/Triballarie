package net.xpoxy.triballarie.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.Triballarie;
import net.xpoxy.triballarie.entity.GoblinEntity;

public class GoblinRenderer extends MobEntityRenderer<GoblinEntity, GoblinModel<GoblinEntity>> {
    private static final Identifier TEXTURE = new Identifier(Triballarie.MOD_PREFIX, "textures/entity/goblin_variant_0_promotion_1.png");

    public GoblinRenderer(EntityRendererFactory.Context context) {
        super(context, new GoblinModel<>(context.getPart(ModModelLayers.GOBLIN)), 0.7f);
    }

    @Override
    public Identifier getTexture(GoblinEntity var1) {
        return TEXTURE;
    }

    //@Override
    //public void render(GoblinEntity mobEntity, float f, float g, MatrixStack matrixStack,
    //		VertexConsumerProvider vertexConsumerProvider, int i) {
    //}
}
