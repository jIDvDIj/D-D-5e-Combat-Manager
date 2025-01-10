package rpgcombatmanager.model;

import java.util.EnumMap;
import java.util.Map;

import rpgcombatmanager.model.enums.Alignment;
import rpgcombatmanager.model.enums.SavingThrowTypes;
import rpgcombatmanager.model.enums.Size;
import rpgcombatmanager.model.enums.SkillTypes;

public class Monster extends Creature {
	private Size size;
	
	private Map<SavingThrowTypes, Integer> savingThrows;
	private Map<SkillTypes, Integer> skills;
	
	public Monster() {
		super();
		this.savingThrows = new EnumMap<>(SavingThrowTypes.class);
		this.skills = new EnumMap<>(SkillTypes.class);
	}

	public Monster(String name, String race, Size size, Alignment alignment, int armorClass, int life, float walkingDisplacement,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		super(name, race, alignment, armorClass, life, walkingDisplacement, strength, dexterity, constitution, intelligence,
				wisdom, charisma);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
 
}
