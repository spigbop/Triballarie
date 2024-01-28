package net.xpoxy.triballarie;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.block.TriballarieBlocks;
import net.xpoxy.triballarie.entity.GoblinEntity;
import net.xpoxy.triballarie.entity.TriballarieEntities;
import net.xpoxy.triballarie.item.TriballarieItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @see TriballarieBlocks Blocks
 * @see TriballarieItems Items
 * @see TriballarieEntities Entites
 * @see
 */
public class Triballarie implements ModInitializer {
    public static final String MOD_PREFIX = "triballarie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_PREFIX);
	public static Identifier identify(String id) { return new Identifier(MOD_PREFIX, id); }

	@Override
	public void onInitialize() {
		TriballarieItems.finalise();
		TriballarieBlocks.finalise();

		FabricDefaultAttributeRegistry.register(TriballarieEntities.GOBLIN, GoblinEntity.createGoblinAttiributes());
	}
}
