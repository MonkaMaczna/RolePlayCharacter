package me.flour.character.settings;

import org.mineacademy.fo.remain.CompMaterial;
import org.mineacademy.fo.settings.SimpleSettings;

public class Settings extends SimpleSettings {
	@Override
	protected int getConfigVersion() {
		return 1;

	}



	public static Boolean PLAYERHEADS;
	public static Integer CHARACTER_SLOT;
	public static CompMaterial CHARACTER_ITEM;
	public static Integer ADDITIONAL_SLOT;
	public static CompMaterial ADDITIONAL_ITEM;
	public static Integer ABILITIES_SLOT;
	public static CompMaterial ABILITIES_ITEM;
	public static Integer MENU_SIZE;
	public static String MENU_TITLE;


	private static void init() {
		PLAYERHEADS = getBoolean("Player_Heads_In_Menu");
		CHARACTER_SLOT = getInteger("Menu_Settings.Character_Info.Slot");
		CHARACTER_ITEM = getMaterial("Menu_Settings.Character_Info.Item");
		ADDITIONAL_SLOT = getInteger("Menu_Settings.Additional_Info.Slot");
		ADDITIONAL_ITEM = getMaterial("Menu_Settings.Additional_Info.Item");
		ABILITIES_SLOT = getInteger("Menu_Settings.Abilities.Slot");
		ABILITIES_ITEM = getMaterial("Menu_Settings.Abilities.Item");
		MENU_SIZE = getInteger("Menu_Settings.Menu_Size");
		MENU_TITLE = getString("Menu_Settings.Menu_Title");




	}
}
