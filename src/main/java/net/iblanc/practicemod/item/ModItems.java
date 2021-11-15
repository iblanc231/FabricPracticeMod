package net.iblanc.practicemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iblanc.practicemod.PracticeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.PRACTICE_TAB)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.PRACTICE_TAB)));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PRACTICE_TAB)));

    public static final Item TITANIUM_ingot = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PRACTICE_TAB)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PracticeMod.LOGGER.info("Registering Mod Items for " + PracticeMod.MOD_ID);
    }

}
