package net.iblanc.practicemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iblanc.practicemod.PracticeMod;
import net.iblanc.practicemod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

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

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(5.0f)
            )
    );

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(6.0f)
            )
    );

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
