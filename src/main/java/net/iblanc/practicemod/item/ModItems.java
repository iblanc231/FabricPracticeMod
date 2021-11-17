package net.iblanc.practicemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iblanc.practicemod.PracticeMod;
import net.iblanc.practicemod.item.custom.DowsingRodItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    /**********************
     * Custom Items
     *********************/

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)));

    public static final Item TITANIUM_ingot = registerItem("titanium_ingot",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)));

    /**********************
     * Custom Food
     *********************/

    public static final Item PEPPER = registerItem("pepper",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder()
                            .hunger(4)
                            .saturationModifier(0.2f)
                            .build())
                    .group(ModItemGroup.PRACTICE_TAB)));

    /**********************
     * Custom Tools
     *********************/

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.PRACTICE_TAB)
                    .maxDamage(10)));

    /**********************
     * Register all custom items
     *********************/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PracticeMod.LOGGER.info("Registering Mod Items for " + PracticeMod.MOD_ID);
    }

}
