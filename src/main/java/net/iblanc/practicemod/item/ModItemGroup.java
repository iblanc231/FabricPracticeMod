package net.iblanc.practicemod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.iblanc.practicemod.PracticeMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PRACTICE_TAB =
            FabricItemGroupBuilder.build(
                    new Identifier(PracticeMod.MOD_ID, "practice_tab"),
                    () -> new ItemStack(ModItems.RUBY));
}
