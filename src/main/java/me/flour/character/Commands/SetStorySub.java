package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetStorySub extends SimpleSubCommand {
	public SetStorySub(final SimpleCommandGroup parent) {
		super(parent, "backstory");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final StringBuilder builder = new StringBuilder();
			for (final String arg : args) {
				builder.append(arg).append(" ");
			}
			final String message = builder.toString().trim();
			cache.setStory(message);
			Common.tell(getPlayer(), "&aYou changed your backstory to: " + message);
		} else if (args.length == 0) {
			Common.tell(getPlayer(), "&aYour backstory is: " + cache.getStory(), "&a You can change it using: /character backstory <text>");
		}


	}
}
