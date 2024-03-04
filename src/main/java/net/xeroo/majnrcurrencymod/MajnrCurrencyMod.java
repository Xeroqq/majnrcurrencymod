package net.xeroo.majnrcurrencymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MajnrCurrencyMod implements ModInitializer {
	public static final String MOD_ID = "majnrcurrencymod";
    public static final Logger LOGGER = LoggerFactory.getLogger("majnrcurrencymod");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world");
	}
}