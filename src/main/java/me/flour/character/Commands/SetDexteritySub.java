package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetDexteritySub extends SimpleSubCommand {
	protected SetDexteritySub(final SimpleCommandGroup parent) {
		super(parent, "dexterity");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final int setIntelligence = Integer.parseInt(args[0]);

			cache.setDexterity(setIntelligence);

			Common.tell(getPlayer(), "&aYou have changed your dexterity to " + setIntelligence);

		} else if (args.length == 0) {

			final int age = cache.getDexterity();

			final String command = "/character dexterity <number>";

			Common.tell(getPlayer(), "&aYour dexterity is " + age, "&a You can change it using: " + command);

		}
	}
}
