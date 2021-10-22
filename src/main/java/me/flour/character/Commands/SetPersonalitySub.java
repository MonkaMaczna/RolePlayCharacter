package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetPersonalitySub extends SimpleSubCommand {
	protected SetPersonalitySub(final SimpleCommandGroup parent) {
		super(parent, "personality");
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

			cache.setPersonality(newName);

			Common.tell(getPlayer(), "&aYou changed your personality to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getPersonality();

			final String command = "/character personality <text>";

			Common.tell(getPlayer(), "&aYour personality is " + name, "&a You can change it using: " + command);

		}
	}
}
