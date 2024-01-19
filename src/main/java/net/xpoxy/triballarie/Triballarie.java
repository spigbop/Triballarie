package net.xpoxy.triballarie;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.xpoxy.triballarie.entity.GoblinEntity;
import net.xpoxy.triballarie.entity.ModEntities;
import net.xpoxy.triballarie.item.ModItems;
import net.xpoxy.triballarie.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triballarie implements ModInitializer {
    public static final String MOD_PREFIX = "triballarie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_PREFIX);

	@Override
	public void onInitialize() {
		ModItems.RegisterAll();
		ModBlocks.RegisterAll();

		FabricDefaultAttributeRegistry.register(ModEntities.GOBLIN, GoblinEntity.createGoblinAttiributes());
	}
}
