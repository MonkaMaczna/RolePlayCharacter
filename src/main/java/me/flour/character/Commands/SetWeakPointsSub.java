package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetWeakPointsSub extends SimpleSubCommand {
	protected SetWeakPointsSub(final SimpleCommandGroup parent) {
		super(parent, "weakpoints");
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

			cache.setWeakpoints(newName);

			Common.tell(getPlayer(), "&aYou changed your weak points to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getWeakpoints();

			final String command = "/character weakpoints <text>";

			Common.tell(getPlayer(), "&aYour weakpoints is " + name, "&a You can change it using: " + command);

		}
	}
}
