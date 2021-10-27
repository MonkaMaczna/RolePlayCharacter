package me.flour.character.Commands;

import me.flour.character.CharacterInfo;
import me.flour.character.UpdateChecker;
import me.flour.character.menu.CharacterMenu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class UpdateSub extends SimpleSubCommand {
	protected UpdateSub(final SimpleCommandGroup parent) {
		super(parent, "update");
	}

	@Override
	protected void onCommand() {
		new UpdateChecker(CharacterInfo.getPlugin(CharacterInfo.class), 97031).getVersion(version -> {
			if (CharacterInfo.getPlugin(CharacterInfo.class).getDescription().getVersion().equals(version)) {
				Common.tell(getPlayer(),"&b[Roleplay Character Information] &aThere aren't any new updates for Character Info");
			} else {
				Common.tell(getPlayer(),"&aThere's a new update avalaible for Character Info",
						"&aLink to update: https://www.spigotmc.org/resources/roleplay-character-information.97031/",
						"&aPlease download regularly updates because they are fixing many bugs and add many new features.");

			}
		});
	}
}
