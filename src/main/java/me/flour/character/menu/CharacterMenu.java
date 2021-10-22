package me.flour.character.menu;

import me.flour.character.data.PlayerCache;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;
import org.mineacademy.fo.remain.CompSound;

import java.util.ArrayList;
import java.util.List;

public class CharacterMenu extends Menu {


	private final Button CharacterName;
	private final Button BackStory;
	private final Button Abilities;
	private final Button Head;

	public CharacterMenu(final Player player, final Player showingTo) {

		setSize(9 * 6);



		if (player.equals(showingTo)) {
			setTitle( "\uF808" + ChatColor.WHITE + "\uF001");
		} else {
			setTitle("\uF808" + ChatColor.WHITE + "\uF001");
		}


		Head = new Button() {
			@Override
			public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

				showingTo.closeInventory();
				Common.tell(showingTo,"&2Closed Character Info Menu.");
			}

			@Override
			public ItemStack getItem() {



				return ItemCreator.of(CompMaterial.PLAYER_HEAD, "&2Database repository for: " + player.getDisplayName()).skullOwner(player.getName()
				).build().make();
			}
		};

		Abilities = new Button() {
			@Override
			public void onClickedInMenu(final Player player, final Menu menu, final ClickType clickType) {
				showingTo.closeInventory();
				Common.tell(showingTo, "&aClosed Character Info Menu.");
			}

			@Override
			public ItemStack getItem() {

				final PlayerCache cache = PlayerCache.getCache(player);

				return ItemCreator.of(CompMaterial.BIRCH_SIGN, "&aAbilities",
						"&a",
						"&a<------------------->",
						"&a",
						"&aPhysical Description: " + (cache.getPhysical() != null ? cache.getPhysical() : "Unknown"),
						"&a",
						"&a<------------------->",
						"&a",
						"&aAbilities: " + (cache.getAbilities() != null ? cache.getAbilities() : "Unknown"),
						"&a",
						"&a<------------------->",
						"&a",
						"&aStrenght :" + (cache.getStrength() != 0 ? cache.getStrength() : "Unknown"),
						"&aDexterity: " + (cache.getDexterity() != 0 ? cache.getDexterity() : "Unknown"),
						"&aIntelligence: " + (cache.getIntelligence() != 0 ? cache.getIntelligence() : "Unknown"),
						"&aAgility: " + (cache.getAgility() != 0 ? cache.getAgility() : "Unknown"),
						"&aDefense: " + (cache.getDefense() != 0 ? cache.getDefense() : "Unknown"),
						"&a",
						"&a<------------------->",
						"&a",
						"&aWeak Points: " + (cache.getWeakpoints() != null ? cache.getWeakpoints() : "Unknown"),
						"&a",
						"&a<------------------->",
						"&a"

				).build().make();
			}
		};


		BackStory = new Button() {
			@Override
			public void onClickedInMenu(final Player player, final Menu menu, final ClickType clickType) {
				showingTo.closeInventory();
				Common.tell(showingTo, "&5Closed Character Info Menu.");
			}

			@Override
			public ItemStack getItem() {

				final PlayerCache cache = PlayerCache.getCache(player);







				return ItemCreator.of(CompMaterial.DARK_OAK_SIGN, "&5Additional information",
						"&5",
						"&5<------------------->",
						"&5",
						"&5Personality: " + (cache.getPersonality() != null ? cache.getPersonality() : "Unknown"),
						"&5",
						"&5<------------------->",
						"&5",
						"&5Relatives and/or important people in life: " + (cache.getRaoipitf() != null ? cache.getRaoipitf() : "Unknown"),
						"&5",
						"&5<------------------->",
						"",
						"&5Backstory: " + (cache.getStory() != null ? cache.getStory() : "Unknown"),
						"",
						"&5<------------------->",
						"",
						"&5Occupation: " + (cache.getOccupation() != null ? cache.getOccupation() : "Unknown"),
						"",
						"&5<------------------->",
						"",
						"&5Status: " + (cache.getStatus() != null ? cache.getStatus() : "Unknown"),
						"",
						"&5<------------------->",
						"").build().make();

			}
		};


		CharacterName = new Button() {
			@Override
			public void onClickedInMenu(final Player player, final Menu menu, final ClickType clickType) {

				showingTo.closeInventory();
				Common.tell(showingTo, "&bClosed Character Info Menu.");
			}

			@Override
			public ItemStack getItem() {


				final PlayerCache cache = PlayerCache.getCache(player);

				return ItemCreator.of(CompMaterial.OAK_SIGN, "&bCharacter Info",
						"",
						"&bFull Name: " + (cache.getName() != null ? cache.getName() : "Not Chosen"),
						"",
						"&b<------------------->",
						"",
						"&bAlias: " + (cache.getAlias() != null ? cache.getAlias() : "Not Chosen"),
						"",
						"&b<------------------->",
						"",
						"&bAge: " + (cache.getAge() > 0 ? cache.getAge() : "Not Chosen"),
						"",
						"&b<------------------->",
						"",
						"&bGender: " + (cache.getGender() != null ? cache.getGender() : "Not Chosen"),
						"",
						"&b<------------------->"


				).build().make();


			}
		};


	}

	@Override
	public ItemStack getItemAt(final int slot) {

		if (slot == 9 * 1 + 4)
			return CharacterName.getItem();

		if (slot == 9 * 1 + 2)
			return BackStory.getItem();
		if (slot == 9 * 1 + 6)
			return Abilities.getItem();
		if (slot == 37)
			return Head.getItem();

		return null;
	}


}

// 		final PlayerCache cache = PlayerCache.getCache(event.getPlayer());