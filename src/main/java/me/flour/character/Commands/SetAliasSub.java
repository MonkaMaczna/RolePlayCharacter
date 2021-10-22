package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetAliasSub extends SimpleSubCommand {
	protected SetAliasSub(final SimpleCommandGroup parent) {
		super(parent, "alias");
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

			cache.setAlias(newName);

			Common.tell(getPlayer(), "&aYou changed your alias to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getAlias();

			final String command = "/character alias <text>";

			Common.tell(getPlayer(), "&aYour Alias is " + name, "&a You can change it using: " + command);

		}
	}
}
