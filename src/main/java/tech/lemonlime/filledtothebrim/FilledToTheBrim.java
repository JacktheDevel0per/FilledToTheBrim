/*
 * This file is part of the TemplateMod project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2023  Fallen_Breath and contributors
 *
 * TemplateMod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TemplateMod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TemplateMod.  If not, see <https://www.gnu.org/licenses/>.
 */

package tech.lemonlime.filledtothebrim;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FilledToTheBrim implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("FilledToTheBrim");
	public static final String MOD_ID = "filledtothebrim";
	public static String MOD_VERSION = "unknown";
	public static String MOD_NAME = "unknown";



	public static boolean IS_ENABLED = true;


	//This will soon be a part of a config... soon :tm:
	public static boolean rule_noEffectOnMagenta = false;

	@Override
	public void onInitialize() {

		LOGGER.info("[Filled To the Brim]: Loading...");

		ModMetadata metadata = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata();
		MOD_NAME = metadata.getName();
		MOD_VERSION = metadata.getVersion().getFriendlyString();

		ModItemTags.registerTags();


		LOGGER.info("[Filled To the Brim]: Loaded!");



	}
}