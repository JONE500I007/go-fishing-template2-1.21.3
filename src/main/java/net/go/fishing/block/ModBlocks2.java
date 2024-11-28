package net.go.fishing.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.go.fishing.GoFishing;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks2 {
    public static final Block TEST_BLOCK_OF_ONE = registerBlock2("test_block_of_one",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GoFishing.MOD_ID, "test_block_of_one")))
                    .strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock2(String name, Block block) {
        registerBlockItem2(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GoFishing.MOD_ID, name), block);
    }

    private static void registerBlockItem2(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GoFishing.MOD_ID, name),
                new BlockItem(block, new Item.Settings().maxCount(99)
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        GoFishing.LOGGER.info("Registering Mod Items for " + GoFishing.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(TEST_BLOCK_OF_ONE);

        });
    }
}
