package me.flour.character;

import me.flour.character.Commands.CharacterParent;
import me.flour.character.menu.CharacterMenu;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompSound;

public class  CharacterInfo extends SimplePlugin {
	@Override
	protected void onPluginStart() {

		final int pluginId = 13116; // <-- Replace with the id of your plugin!
		final org.mineacademy.fo.metrics.Metrics metrics = new org.mineacademy.fo.metrics.Metrics(this, pluginId);


		new UpdateChecker(this, 97031).getVersion(version -> {
			if (this.getDescription().getVersion().equals(version)) {
				getLogger().info("&b[Roleplay Character Information] &aThere aren't any new updates for Character Info");
			} else {
				Common.log("&aThere's a new update avalaible for Character Info",
						"&aLink to update: https://www.spigotmc.org/resources/roleplay-character-information.97031/",
						"&aPlease download regularly updates because they are fixing many bugs and add many new features.");

			}
		});

		Common.log("&a[Character Information] Loaded Character Information. ", "&aPlugin was made by Wheat Flour");


		registerCommands("character",new CharacterParent());

	}
}
