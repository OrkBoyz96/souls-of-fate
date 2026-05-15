package net.orkz.soulsoffate;

import net.fabricmc.api.ModInitializer;

import net.orkz.soulsoffate.Items.ModItemGroups;
import net.orkz.soulsoffate.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulsOfFate implements ModInitializer {
	public static final String MOD_ID = "souls-of-fate";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();

	}
}