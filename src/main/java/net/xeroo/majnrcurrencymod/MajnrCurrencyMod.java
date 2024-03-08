package net.xeroo.majnrcurrencymod;

import net.fabricmc.api.ModInitializer;

import net.xeroo.majnrcurrencymod.block.ModBlocks;
import net.xeroo.majnrcurrencymod.item.ModItemGroups;
import net.xeroo.majnrcurrencymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MajnrCurrencyMod implements ModInitializer {
		public static final String MOD_ID = "majnrcurrencymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}

