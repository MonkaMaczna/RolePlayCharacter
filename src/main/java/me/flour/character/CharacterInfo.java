package me.flour.character;

import me.flour.character.Commands.CharacterParent;
import me.flour.character.menu.CharacterMenu;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompSound;

public class CharacterInfo extends SimplePlugin {
	@Override
	protected void onPluginStart() {




		registerCommands("character",new CharacterParent());

	}
}
