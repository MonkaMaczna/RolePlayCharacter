package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import me.flour.character.menu.CharacterMenu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class InfoSub extends SimpleSubCommand {
	protected InfoSub(final SimpleCommandGroup parent) {
		super(parent, "info");
	}

	@Override
	protected void onCommand() {
		if (args.length > 0) {

			final Player playerTarget = Bukkit.getServer().getPlayer(args[0]);

			final Player player = getPlayer();

			new CharacterMenu(playerTarget, player).displayTo(player);


		} else if (args.length == 0) {
			final Player player = getPlayer();

			new CharacterMenu(player, player).displayTo(player);


		}
	}
}
