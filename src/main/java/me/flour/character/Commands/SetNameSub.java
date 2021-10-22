package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetNameSub extends SimpleSubCommand {
	protected SetNameSub(final SimpleCommandGroup parent) {
		super(parent, "name");
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

			cache.setName(newName);

			Common.tell(getPlayer(), "&aYou changed your name to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getName();

			Common.tell(getPlayer(), "&aYour name is " + name, "&a You can change it using: " + "/character name <text>");

		}
	}
}
