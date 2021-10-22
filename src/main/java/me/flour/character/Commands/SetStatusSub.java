package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetStatusSub extends SimpleSubCommand {
	protected SetStatusSub(final SimpleCommandGroup parent) {
		super(parent, "status");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final StringBuilder builder = new StringBuilder();
			for (final String arg : args) {
				builder.append(arg).append(" ");
			}
			final String newName = builder.toString().trim();

			cache.setStatus(newName);

			Common.tell(getPlayer(), "&aYou changed your status to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getStatus();

			final String command = "/character status <text>";

			Common.tell(getPlayer(), "&aYour status is " + name, "&a You can change it using: " + command);

		}
	}
}
