package net.go.fishing.item;

import net.go.fishing.DataDrivenStacks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.go.fishing.GoFishing;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FISHING_COIN = registerItem("fishing_coin", new Item(new Item.Settings()
            .maxCount(2000)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "fishing_coin")))));
    public static final  Item RAW_BLUE_FISH = registerItem("raw_blue_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "raw_blue_fish")))));
    public static final  Item COOKED_BLUE_FISH = registerItem("cooked_blue_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "cooked_blue_fish")))));
    public static final  Item RAW_GREEDILY_FISH = registerItem("raw_greedily_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "raw_greedily_fish")))));
    public static final  Item BLACK_CARD_FISH = registerItem("black_card_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "black_card_fish")))));
    public static final  Item BURNED_BLACK_CARD_FISH = registerItem("burned_black_card_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "burned_black_card_fish")))));
    public static final  Item RED_CARD_FISH = registerItem("red_card_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "red_card_fish")))));
    public static final  Item BURNED_RED_CARD_FISH = registerItem("burned_red_card_fish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "burned_red_card_fish")))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoFishing.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoFishing.LOGGER.info("Registering Mod Items for " + GoFishing.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(RAW_BLUE_FISH);
            entries.add(COOKED_BLUE_FISH);
            entries.add(RAW_GREEDILY_FISH);
            entries.add(BLACK_CARD_FISH);
            entries.add(BURNED_BLACK_CARD_FISH);
            entries.add(RED_CARD_FISH);
            entries.add(BURNED_RED_CARD_FISH);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FISHING_COIN);
        });
    }
}
