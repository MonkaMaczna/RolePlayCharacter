package me.flour.character.API;

import me.flour.character.data.PlayerCache;
import org.bukkit.entity.Player;

public class CharacterAPI {

	public static String getRpName(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getName();
	}
	public static String getRpGender(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getGender();
	}
	public static Integer getRpAge(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getAge();
	}
	public static String getPersonality(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getPersonality();
	}
	public static String getAbilities(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getAbilities();
	}
	public static String getAlias(final Player player) {
		PlayerCache cache = PlayerCache.getCache(player);
		return cache.getAlias();
	}
}
