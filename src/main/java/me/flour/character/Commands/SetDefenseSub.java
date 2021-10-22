package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetDefenseSub extends SimpleSubCommand {
	protected SetDefenseSub(final SimpleCommandGroup parent) {
		super(parent, "defense");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final int setIntelligence = Integer.parseInt(args[0]);

			cache.setDefense(setIntelligence);

			Common.tell(getPlayer(), "&aYou have changed your defense to " + setIntelligence);

		} else if (args.length == 0) {

			final int age = cache.getDefense();

			final String command = "/character defense <number>";

			Common.tell(getPlayer(), "&aYour defense is " + age, "&a You can change it using: " + command);

		}
	}
}
