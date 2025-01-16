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

	public Monster(String name, String race, Alignment alignment, int armorClass, int life, float walkingDisplacement,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Size size) {
		super(name, race, alignment, armorClass, life, walkingDisplacement, strength, dexterity, constitution, intelligence,
				wisdom, charisma);
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	public boolean containsSkill(SkillTypes key) {
		return skills.containsKey(key);
	}
	
	public void putSkill(SkillTypes key, Integer value) {
		skills.put(key, value);
	}

	public Integer getSkill(SkillTypes key) {
		return skills.get(key);
	}
	
	public boolean containsSavingThrow(SavingThrowTypes key) {
		return savingThrows.containsKey(key);
	}
	
	public void putSavingThrow(SavingThrowTypes key, Integer value) {
		savingThrows.put(key, value);
	}

	public Integer getSavingThrow(SavingThrowTypes key) {
		return savingThrows.get(key);
	}
	
	
}
