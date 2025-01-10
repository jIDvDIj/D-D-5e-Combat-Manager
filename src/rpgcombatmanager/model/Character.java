package rpgcombatmanager.model;

import java.util.EnumSet;

import rpgcombatmanager.model.enums.Alignment;
import rpgcombatmanager.model.enums.SavingThrowTypes;
import rpgcombatmanager.model.enums.SkillTypes;

public class Character extends Creature {
	
	private String playerName;
	private String antecedent;
	private int level;
	private float experiencePoints;
	private int inspiration;
	
	private int proficiencyBonus;
	private EnumSet<SkillTypes> skills;
	private EnumSet<SavingThrowTypes> savingThrows;
	private boolean isNPC;
	
	public Character() {
		super();
		this.skills = EnumSet.noneOf(SkillTypes.class);
		this.savingThrows = EnumSet.noneOf(SavingThrowTypes.class);
		
	}

	public Character(String name, String race, Alignment alignment, int armorClass, int life, float walkingDisplacement,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String antecedent, int level, boolean isNPC) {
		super(name, race, alignment, armorClass, life, walkingDisplacement, strength, dexterity, constitution, intelligence,
				wisdom, charisma);
		this.proficiencyBonus = 2;
		this.playerName = null;
		this.antecedent = null;
		this.level = level;
		this.experiencePoints = 0;
		this.inspiration = 0;
		this.isNPC = isNPC;
		
	}
	
}
