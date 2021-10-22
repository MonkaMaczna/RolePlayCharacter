package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetPhysicalSub extends SimpleSubCommand {
	protected SetPhysicalSub(final SimpleCommandGroup parent) {
		super(parent, "physical");
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

			cache.setPhysical(newName);

			Common.tell(getPlayer(), "&aYou changed your physical description to: " + newName);

		} else if (args.length == 0) {

			final String name = cache.getPhysical();

			final String command = "/character physical <text>";

			Common.tell(getPlayer(), "&aYour physical desctiption is " + name, "&a You can change it using: " + command);

		}
	}
}
