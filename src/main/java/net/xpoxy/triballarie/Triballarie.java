package net.xpoxy.triballarie;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.entity.GoblinEntity;
import net.xpoxy.triballarie.entity.ModEntities;
import net.xpoxy.triballarie.item.ModItems;
import net.xpoxy.triballarie.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triballarie implements ModInitializer {
    public static final String MOD_PREFIX = "triballarie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_PREFIX);

	private static final ItemGroup TRIBALLARIE_CREATIVE_TAB = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.CHIEFTAIN_STAFF))
			.displayName(Text.translatable("itemGroup.triballarie.main"))
			.entries((context, entries) -> {
				entries.add(ModItems.SAPPHIRE_GOLDEN);
				entries.add(ModItems.SKULL_GOBLIN);
				entries.add(ModItems.CHIEFTAIN_STAFF);
				entries.add(ModItems.BONFIRE);
				entries.add(ModItems.BONFIRE_TRIBAL);
			})
			.build();

	@Override
	public void onInitialize() {
		ModItems.RegisterAll();
		ModBlocks.RegisterAll();

		FabricDefaultAttributeRegistry.register(ModEntities.GOBLIN, GoblinEntity.createGoblinAttiributes());

		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_PREFIX, "main"), TRIBALLARIE_CREATIVE_TAB);
	}
}
