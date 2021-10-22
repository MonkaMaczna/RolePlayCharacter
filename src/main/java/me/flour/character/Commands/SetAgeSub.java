package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetAgeSub extends SimpleSubCommand {
	protected SetAgeSub(final SimpleCommandGroup parent) {
		super(parent, "age");
	}

	@Override
	protected void onCommand() {

		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {

			final int setAg = Integer.parseInt(args[0]);

			cache.setAge(setAg);

			Common.tell(getPlayer(), "&aYou have changed your age to " + setAg);

		} else if (args.length == 0) {

			final int age = cache.getAge();

			Common.tell(getPlayer(), "&aYour age is " + age, "&a You can change it using: /character age <number>");

		}
	}
}
