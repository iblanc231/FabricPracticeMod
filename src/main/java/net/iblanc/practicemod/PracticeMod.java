package net.iblanc.practicemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.iblanc.practicemod.block.ModBlocks;
import net.iblanc.practicemod.item.ModItems;
import net.iblanc.practicemod.registries.ModRegistries;
import net.minecraft.client.render.RenderLayer;
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

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

		LOGGER.info("Hello Fabric world!");
	}
}
