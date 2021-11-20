package net.iblanc.practicemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iblanc.practicemod.PracticeMod;
import net.iblanc.practicemod.block.custom.ModStairsBlock;
import net.iblanc.practicemod.block.custom.StatusBlock;
import net.iblanc.practicemod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    /**********************
     * Custom Blocks - Ruby
     *********************/

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(3.0f)
            )
    );

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f)
            )
    );

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new ModStairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    FabricBlockSettings
                        .of(Material.STONE)
                        .strength(4.0f)
            )
    );

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f)
            )
    );

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f)
            )
    );

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f)
            )
    );

    /**********************
     * Custom Blocks - MISC
     *********************/

    public static final Block STATUS_BLOCK = registerBlock("status_block",
            new StatusBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(6.0f)
            )
    );

    /**********************
     * Register Custom Blocks and assoc. BlockItems
     *********************/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registry.BLOCK, new Identifier(PracticeMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM,
                new Identifier(PracticeMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.PRACTICE_TAB)));
    }

    public static void registerModBlocks() {
        PracticeMod.LOGGER.info("Registering ModBlocks for " + PracticeMod.MOD_ID);
    }

}
