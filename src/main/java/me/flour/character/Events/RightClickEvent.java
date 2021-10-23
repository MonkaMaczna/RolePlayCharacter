package me.flour.character.Events;

import me.flour.character.menu.CharacterMenu;
import me.flour.character.settings.Settings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class RightClickEvent implements Listener {
	@EventHandler
	public void onRightClick(PlayerInteractAtEntityEvent event) {
		if (Settings.RIGHT_CLICK) {
			if (event.getRightClicked() instanceof Player) {
				if (event.getPlayer().isSneaking()) {
					Player Clicked = ((Player) event.getRightClicked()).getPlayer();
					new CharacterMenu(event.getPlayer(),Clicked).displayTo(event.getPlayer());
				}

			}
		}

	}
}
