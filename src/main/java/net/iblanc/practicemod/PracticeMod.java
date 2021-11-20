package net.iblanc.practicemod;

import net.fabricmc.api.ModInitializer;
import net.iblanc.practicemod.block.ModBlocks;
import net.iblanc.practicemod.item.ModItems;
import net.iblanc.practicemod.registries.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PracticeMod implements ModInitializer {

	public static final String MOD_ID = "practicemod";
	public static final Logger LOGGER = LogManager.getLogger("practicemod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModFuels();

		LOGGER.info("Hello Fabric world!");
	}
}
