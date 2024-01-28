package net.xpoxy.triballarie.item;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xpoxy.triballarie.Triballarie;
import net.xpoxy.triballarie.block.TriballarieBlocks;
import net.xpoxy.triballarie.entity.TriballarieEntities;

public class TriballarieItems {
    public static final Item SAPPHIRE_GOLDEN = reg("sapphire", new Item(new Item.Settings()));
    public static final Item SKULL_GOBLIN = reg("goblin_skull", new Item(new Item.Settings()));
    public static final Item BONFIRE = reg("bonfire", new PlaceBlockItem(TriballarieBlocks.BONFIRE, new Item.Settings()));
    public static final Item BONFIRE_TRIBAL = reg("bonfire_tribal", new PlaceBlockItem(TriballarieBlocks.BONFIRE_TRIBAL, new Item.Settings()));
    public static final Item CHIEFTAIN_STAFF = reg("chieftain_staff", new ChieftainStaffItem(new Item.Settings().maxCount(1)));
    public static final Item GOBLIN_SPAWN_EGG = reg("goblin_spawn_egg", new SpawnEggItem(TriballarieEntities.GOBLIN, 0x3d8e1f, 0xe2e592, new Item.Settings()));

    protected static Item reg(String id, Item item) {
        Triballarie.LOGGER.info("Registering (item) - triballarie:" + id);
        return Registry.register(Registries.ITEM, Triballarie.identify(id), item);
    }

    public static void finalise() {
        Triballarie.LOGGER.info("Registering all (items) triballarie:*");
    }
}
