package net.go.fishing.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.go.fishing.GoFishing;
import net.go.fishing.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RAW_GREEDILY_FISH = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GoFishing.MOD_ID, "raw_greedily_fish"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_GREEDILY_FISH))
                    .displayName(Text.translatable("itemgroup.go-fishing.raw_greedily_fish"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.RAW_BLUE_FISH);
                        entries.add(ModItems.COOKED_BLUE_FISH);
                        entries.add(ModItems.RAW_GREEDILY_FISH);
                        entries.add(ModItems.BLACK_CARD_FISH);
                        entries.add(ModItems.BURNED_BLACK_CARD_FISH);
                        entries.add(ModItems.RED_CARD_FISH);
                        entries.add(ModItems.BURNED_RED_CARD_FISH);

                        entries.add(ModBlocks.COMPRESSED_FISH_BLOCK);
                        entries.add(ModBlocks.CASK_FISH_BLOCK);
                    }))
                    .build());

    public static void registerItemGroups() {
        GoFishing.LOGGER.info("Registering Items Groups for " + GoFishing.MOD_ID);
    }
}
