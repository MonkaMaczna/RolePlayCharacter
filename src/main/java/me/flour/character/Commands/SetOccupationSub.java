package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetOccupationSub extends SimpleSubCommand {
	protected SetOccupationSub(final SimpleCommandGroup parent) {
		super(parent, "occupation");
		
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

			cache.setOccupation(newName);

			Common.tell(getPlayer(), "&aYou changed your occupation to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getOccupation();

			final String command = "/character occupation <text>";

			Common.tell(getPlayer(), "&aYour occupation is " + name, "&a You can change it using: " + command);

		}
	}
}
