package net.ztn.agriculturalmysticism;

import net.fabricmc.api.ModInitializer;

import net.ztn.agriculturalmysticism.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AgriculturalMysticism implements ModInitializer {
	public static final String MOD_ID = "agricultural-mysticism";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}