package net.xpoxy.triballarie.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xpoxy.triballarie.Triballarie;
import net.xpoxy.triballarie.block.ModBlocks;

public class ModItems {
    public static final Item SAPPHIRE_GOLDEN = new Item(new Item.Settings());
    public static final Item SKULL_GOBLIN = new Item(new Item.Settings());

    public static final Item BONFIRE = new BonfireItem(ModBlocks.BONFIRE, new Item.Settings());
    public static final Item BONFIRE_TRIBAL = new BonfireTribalItem(ModBlocks.BONFIRE_TRIBAL, new Item.Settings());

    public static final Item CHIEFTAIN_STAFF = new ChieftainStaffItem(new Item.Settings());

    public static void RegisterAll() {
        Registry.register(Registries.ITEM, new Identifier(Triballarie.MOD_PREFIX, "sapphire"),
                SAPPHIRE_GOLDEN);
        Registry.register(Registries.ITEM, new Identifier(Triballarie.MOD_PREFIX, "goblin_skull"),
                SKULL_GOBLIN);

        Registry.register(Registries.ITEM, new Identifier(Triballarie.MOD_PREFIX, "bonfire"),
                BONFIRE);
        Registry.register(Registries.ITEM, new Identifier(Triballarie.MOD_PREFIX, "bonfire_tribal"),
                BONFIRE_TRIBAL);

        Registry.register(Registries.ITEM, new Identifier(Triballarie.MOD_PREFIX, "chieftain_staff"),
                CHIEFTAIN_STAFF);
    }
}
