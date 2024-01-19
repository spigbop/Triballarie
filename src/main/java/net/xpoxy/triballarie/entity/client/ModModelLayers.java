package net.xpoxy.triballarie.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.Triballarie;

public class ModModelLayers {
    public static final EntityModelLayer GOBLIN =
            new EntityModelLayer(new Identifier(Triballarie.MOD_PREFIX, "goblin"), "main");
}
