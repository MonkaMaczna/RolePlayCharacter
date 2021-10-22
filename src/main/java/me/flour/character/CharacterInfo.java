package me.flour.character;

import me.flour.character.Commands.CharacterParent;
import me.flour.character.menu.CharacterMenu;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompSound;

public class CharacterInfo extends SimplePlugin {
	@Override
	protected void onPluginStart() {


		Common.log("&a[Character Information] Loaded Character Information. ", "&aPlugin was made by Wheat Flour");


		registerCommands("character",new CharacterParent());

	}
}
