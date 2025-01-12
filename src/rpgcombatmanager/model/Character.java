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
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getAntecedent() {
		return antecedent;
	}

	public void setAntecedent(String antecedent) {
		this.antecedent = antecedent;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(float experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public int getInspiration() {
		return inspiration;
	}

	public void setInspiration(int inspiration) {
		this.inspiration = inspiration;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public boolean isNPC() {
		return isNPC;
	}

	public void setNPC(boolean isNPC) {
		this.isNPC = isNPC;
	}
	
	public void addSkill(SkillTypes skillType ) {
		skills.add(skillType);
	}
	
	public boolean containsSkill(SkillTypes skillType) {
		return skills.contains(skillType);
	}
	
	public void addSavingThrow(SavingThrowTypes savingThrowType) {
		savingThrows.add(savingThrowType);
	}
	
	public boolean containsSavingThrow(SavingThrowTypes savingThrowType) {
		return savingThrows.contains(savingThrowType);
	}
}
