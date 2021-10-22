package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetRelativesSub extends SimpleSubCommand {
	protected SetRelativesSub(final SimpleCommandGroup parent) {
		super(parent, "relatives");
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

			cache.setRelatives(newName);

			Common.tell(getPlayer(), "&aYou changed your relatives to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getRaoipitf();

			final String command = "/character relatives <text>";

			Common.tell(getPlayer(), "&aYour relatives are " + name, "&a You can change it using: " + command);

		}
	}
}
