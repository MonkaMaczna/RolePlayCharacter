package me.flour.character.Commands;

import org.mineacademy.fo.command.SimpleCommandGroup;

public class CharacterParent extends SimpleCommandGroup {
	@Override
	protected void registerSubcommands() {

		registerSubcommand(new SetAgeSub(this));
		registerSubcommand(new SetGenderSub(this));
		registerSubcommand(new SetNameSub(this));
		registerSubcommand(new SetStorySub(this));
		registerSubcommand(new SetIntelligenceSub(this));
		registerSubcommand(new SetAgilitySub(this));
		registerSubcommand(new SetDexteritySub(this));
		registerSubcommand(new SetDefenseSub(this));
		registerSubcommand(new SetAliasSub(this));
		registerSubcommand(new SetOccupationSub(this));
		registerSubcommand(new SetPersonalitySub(this));
		registerSubcommand(new SetPhysicalSub(this));
		registerSubcommand(new SetStatusSub(this));
		registerSubcommand(new SetRelativesSub(this));
		registerSubcommand(new SetStrengthSub(this));
		registerSubcommand(new SetAbilitiesSub(this));
		registerSubcommand(new SetWeakPointsSub(this));
		registerSubcommand(new InfoSub(this));
		registerSubcommand(new UpdateSub(this));


	}

	@Override
	protected String getCredits() {
		return "Command group for character card settings.";
	}
}
