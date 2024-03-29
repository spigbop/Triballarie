package net.xpoxy.triballarie.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xpoxy.triballarie.Triballarie;

public class TriballarieEntities {
    public static final EntityType<GoblinEntity> GOBLIN = Registry.register(Registries.ENTITY_TYPE,
            Triballarie.identify("goblin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GoblinEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,1f)).build());
}
