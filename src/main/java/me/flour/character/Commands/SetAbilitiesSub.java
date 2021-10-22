package me.flour.character.Commands;

import me.flour.character.data.PlayerCache;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class SetAbilitiesSub extends SimpleSubCommand {
	protected SetAbilitiesSub(final SimpleCommandGroup parent) {
		super(parent, "abilities");
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

				cache.setAbilities(newName);

				Common.tell(getPlayer(), "&aYou changed your abilities to: " + newName);




		} else if (args.length == 0) {

			final String name = cache.getAbilities();

			final String command = "/character abilities <text>";

			Common.tell(getPlayer(), "&aYour abilities are " + name, "&a You can change it using: " + command);

		}
	}
}
