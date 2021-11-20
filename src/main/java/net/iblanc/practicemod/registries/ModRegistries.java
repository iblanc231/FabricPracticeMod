package net.iblanc.practicemod.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.iblanc.practicemod.PracticeMod;
import net.iblanc.practicemod.item.ModItems;

public class ModRegistries {

    public static void registerModFuels() {

        PracticeMod.LOGGER.info("Registering Mod Fuels for " + PracticeMod.MOD_ID);

        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.IRON_WOOL, 300);

    }

}
