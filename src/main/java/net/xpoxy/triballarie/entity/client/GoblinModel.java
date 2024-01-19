package net.xpoxy.triballarie.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.xpoxy.triballarie.entity.GoblinEntity;

public class GoblinModel<T extends GoblinEntity> extends SinglePartEntityModel<T> {
    private final ModelPart body;
    private final ModelPart head;

    public GoblinModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = body.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 18).cuboid(-4.0F, -9.0F, -2.0F, 8.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData leftleg = body.addChild("leftleg", ModelPartBuilder.create().uv(24, 19).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -3.0F, 0.0F));

        ModelPartData rightleg = body.addChild("rightleg", ModelPartBuilder.create().uv(24, 14).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.0F, 0.0F));

        ModelPartData rightarm = body.addChild("rightarm", ModelPartBuilder.create().uv(32, 13).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        ModelPartData leftarm = body.addChild("leftarm", ModelPartBuilder.create().uv(40, 13).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -8.0F, -3.0F, 10.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, 0.0F));

        ModelPartData snot = head.addChild("snot", ModelPartBuilder.create().uv(32, 10).cuboid(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 14).cuboid(0.75F, 2.0F, -0.75F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(0.75F, 3.0F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(6, 14).cuboid(-2.75F, 2.0F, -0.75F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(6, 16).cuboid(-1.75F, 3.0F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.75F, -3.0F));

        ModelPartData rightear = head.addChild("rightear", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, -8.0F, 0.0F));

        ModelPartData base_r1 = rightear.addChild("base_r1", ModelPartBuilder.create().uv(32, 0).cuboid(-7.0F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData leftear = head.addChild("leftear", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, -8.0F, 0.0F));

        ModelPartData earring2_r1 = leftear.addChild("earring2_r1", ModelPartBuilder.create().uv(28, 4).cuboid(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 5.0F, -0.5F, 0.0F, 0.3927F, 0.0F));

        ModelPartData earring1_r1 = leftear.addChild("earring1_r1", ModelPartBuilder.create().uv(28, 2).cuboid(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 4.0F, -0.5F, 0.0F, 0.3927F, 0.0F));

        ModelPartData earring0_r1 = leftear.addChild("earring0_r1", ModelPartBuilder.create().uv(28, 0).cuboid(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 3.0F, -0.5F, 0.0F, 0.3927F, 0.0F));

        ModelPartData earbase_r1 = leftear.addChild("earbase_r1", ModelPartBuilder.create().uv(32, 5).cuboid(0.0F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
        return TexturedModelData.of(modelData, 48, 32);
    }
    @Override
    public void setAngles(GoblinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return body;
    }
}
