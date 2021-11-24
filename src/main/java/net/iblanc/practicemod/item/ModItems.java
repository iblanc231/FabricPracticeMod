package net.iblanc.practicemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iblanc.practicemod.PracticeMod;
import net.iblanc.practicemod.item.custom.DowsingRodItem;
import net.iblanc.practicemod.item.custom.ModAxeItem;
import net.iblanc.practicemod.item.custom.ModHoeItem;
import net.iblanc.practicemod.item.custom.ModPickaxeItem;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    /**********************
     * Custom Items
     *********************/

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item IRON_WOOL = registerItem("iron_wool",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    /**********************
     * Custom Tools
     *********************/

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY,
                    2, 1f,
                    new FabricItemSettings()
                            .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY,
                    2,1f,
                    new FabricItemSettings()
                            .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterial.RUBY,
                    2,1f,
                    new FabricItemSettings()
                            .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY,
                    2,1f,
                    new FabricItemSettings()
                            .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterial.RUBY,
                    2,1f,
                    new FabricItemSettings()
                            .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)
                    .maxDamage(10)
            )
    );

    /**********************
     * Custom Food
     *********************/

    public static final Item PEPPER = registerItem("pepper",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder()
                            .hunger(4)
                            .saturationModifier(0.2f)
                            .build())
                    .group(ModItemGroup.PRACTICE_TAB)
            )
    );

    /****************************
     * Register all custom items
     ***************************/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PracticeMod.LOGGER.info("Registering Mod Items for " + PracticeMod.MOD_ID);
    }

}
