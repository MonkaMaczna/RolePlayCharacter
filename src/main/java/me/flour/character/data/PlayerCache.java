package me.flour.character.data;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.model.ConfigSerializable;
import org.mineacademy.fo.settings.YamlSectionConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class PlayerCache extends YamlSectionConfig implements ConfigSerializable {

	private static final Map<UUID, PlayerCache> cacheMap = new HashMap<>();


	String gender;
	String name;
	Integer age;
	String race;
	String story;
	Integer strength;
	Integer dexterity;
	Integer intelligence;
	Integer agility;
	Integer defense;
	String occupation;
	String abilities;
	String weakpoints;
	String personality;
	String raoipitf;
	String alias;
	String status;
	String physical;


	protected PlayerCache(final String uuid) {

		// This will prepend this cache with the players unique id just like you use pathPrefix in SimpleSettings
		super(uuid);

		// Load our player cache from the disk however do not use any default file
		// from our source code
		loadConfiguration(null, "data.db");
	}

	@Override
	protected void onLoadFinish() {


		if (isSet("Gender"))
			gender = getString("Gender");
		else if (!isSet("Gender"))
			gender = "Not set";
		if (isSet("Age"))
			age = getInteger("Age");
		else if (!isSet("Age"))
			age = 18;
		if (isSet("Name"))
			name = getString("Name");
		else if (!isSet("Name"))
			name = "No name";

		if (isSet("Story"))
			story = getString("Story");
		else if (!isSet("Story"))
			story = "Unknown";

		if (isSet("Dexterity"))
			dexterity = getInteger("Dexterity");
		else if (!isSet("Dexterity"))
			dexterity = 1;
		if (isSet("Strength"))
			strength = getInteger("Strength");
		else if (!isSet("Strength"))
			strength = 1;
		if (isSet("Agility"))
			agility = getInteger("Agility");
		else if (!isSet("Agility"))
			agility = 1;
		if (isSet("Intelligence"))
			intelligence = getInteger("Intelligence");
		else if (!isSet("Intelligence"))
			intelligence = 1;
		if (isSet("Defense"))
			defense = getInteger("Defense");
		else if (!isSet("Defense"))
			defense = 1;
		if (isSet("Occupation"))
			occupation = getString("Occupation");
		else if (!isSet("Occupation"))
			occupation = "Unknown";
		if (isSet("Personality"))
			personality = getString("Personality");
		else if (!isSet("Personality"))
			personality = "Unknown";
		if (isSet("Status"))
			status = getString("Status");
		else if (!isSet("Status"))
			status = "Unknown";
		if (isSet("Physical"))
			physical = getString("Physical");
		else if (!isSet("Physical"))
			physical = "Unknown";
		if (isSet("WeakPoints"))
			weakpoints = getString("WeakPoints");
		else if (!isSet("WeakPoints"))
			weakpoints = "Unknown";
		if (isSet("Relatives"))
			raoipitf = getString("Relatives");
		else if (!isSet("Relatives"))
			raoipitf = "Unknown";
		if (isSet("Alias"))
			alias = getString("Alias");
		else if (!isSet("Alias"))
			alias = "Unknown";
		if (isSet("Abilities"))
			abilities = getString("Abilities");
		else if (!isSet("Abilities"))
			abilities = "Unknown";



		/*
		Integer strenght;
	Integer dexterity;
	Integer intelligence;
	Integer agility;
	Integer defense;
	String occupation;
	String abilities;
	String weakpoints;
	String personality;
	String raoipitf;
	String alias;
	String status;
	String physical;
		 */
	}

	public void setStrength(final Integer strength) {
		this.strength = strength;
		save("Strength", strength);
	}

	public void setDexterity(final Integer dexterity) {
		this.dexterity = dexterity;
		save("Dexterity", dexterity);
	}

	public void setIntelligence(final Integer intelligence) {
		this.intelligence = intelligence;
		save("Intelligence", intelligence);
	}

	public void setStatus(final String status) {
		this.status = status;
		save("Status", status);
	}

	public void setPersonality(final String personality) {
		this.personality = personality;
		save("Personality", personality);
	}

	public void setAgility(final Integer agility) {
		this.agility = agility;
		save("Agility", agility);
	}

	public void setWeakpoints(final String weakpoints) {
		this.weakpoints = weakpoints;
		save("WeakPoints", weakpoints);
	}

	public void setRelatives(final String relatives) {
		this.raoipitf = relatives;
		save("Relatives", relatives);
	}

	public void setAlias(final String alias) {
		this.alias = alias;
		save("Alias", alias);
	}

	public void setOccupation(final String occupation) {
		this.occupation = occupation;
		save("Occupation", occupation);
	}

	public void setDefense(final Integer defense) {
		this.defense = defense;
		save("Defense", defense);
	}

	public void setAbilities(final String abilities) {
		this.abilities = abilities;
		save("Abilities", abilities);
	}

	public void setPhysical(final String physical) {
		this.physical = physical;
		save("Physical", physical);
	}


	public void setGender(final String gender) {
		this.gender = gender;
		save("Gender", gender);

	}

	public void setAge(final Integer age2) {
		this.age = age2;
		save("Age", age2);
	}


	public void setName(final String name1) {
		this.name = name1;
		save("Name", name1);

	}

	public void setStory(final String story1) {

		this.story = story1;
		save("Story", story1);


	}


	@Override
	public SerializedMap serialize() {
		final SerializedMap map = new SerializedMap();


		map.put("Gender", gender);
		map.put("Age", age);
		map.put("Story", story);
		map.put("Name", name);
		map.put("Personality", personality);
		map.put("Abilities", abilities);
		map.put("Status", status);
		map.put("Alias", alias);
		map.put("Dexterity", dexterity);
		map.put("Agility", agility);
		map.put("Defense", defense);
		map.put("Occupation", occupation);
		map.put("WeakPoints", weakpoints);
		map.put("Intelligence", intelligence);
		map.put("Relatives", raoipitf);
		map.put("Physical", physical);
		map.put("Uuid", getSection());

		return map;
	}


	public static PlayerCache getCache(final Player player) {
		PlayerCache cache = cacheMap.get(player.getUniqueId());

		if (cache == null) {
			cache = new PlayerCache(player.getUniqueId().toString());

			cacheMap.put(player.getUniqueId(), cache);
		}

		return cache;
	}
}
