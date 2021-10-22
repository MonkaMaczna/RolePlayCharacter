package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetGenderSub extends SimpleSubCommand {
	protected SetGenderSub(final SimpleCommandGroup parent) {
		super(parent, "gender");
	}

	@Override
	protected void onCommand() {
		final PlayerCache cache = PlayerCache.getCache(getPlayer());

		if (args.length > 0) {


			final StringBuilder builder = new StringBuilder();
			for (final String arg : args) {
				builder.append(arg).append(" ");
			}
			final String newGender = builder.toString().trim();

			cache.setGender(newGender);

			Common.tell(getPlayer(), "&aYou have changed your gender to " + newGender);


		} else if (args.length == 0) {


			Common.tell(getPlayer(), "&aYour gender is " + cache.getGender(), "&a You can change it using: /character gender <text>");

		}
	}
}
