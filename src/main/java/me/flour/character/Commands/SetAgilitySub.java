package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetAgilitySub extends SimpleSubCommand {
	protected SetAgilitySub(final SimpleCommandGroup parent) {
		super(parent, "agility");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final int setIntelligence = Integer.parseInt(args[0]);

			cache.setAgility(setIntelligence);

			Common.tell(getPlayer(), "&aYou have changed your agility to " + setIntelligence);

		} else if (args.length == 0) {

			final int age = cache.getAgility();

			final String command = "/character agility <number>";

			Common.tell(getPlayer(), "&aYour agility is " + age, "&a You can change it using: " + command);

		}
	}
}
