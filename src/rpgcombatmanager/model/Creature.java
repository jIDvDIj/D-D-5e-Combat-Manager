package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.LanguageTypes;
import rpgcombatmanager.model.enums.SavingThrowTypes;
import rpgcombatmanager.model.enums.SenseTypes;
import rpgcombatmanager.model.enums.SkillTypes;

import java.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Creature {
	private String name;
	private String race;
	private int armorClass;
	private int life;
	private float walkingDisplacement;
	private float flightDisplacement;
	private float swimmingDisplacement;
	private float telempathy;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	private Map<SavingThrowTypes, SavingThrow> savingThrows;
	private Map<SkillTypes, Skill> skills;
	private Map<SenseTypes, Integer> senses;
	private Map<LanguageTypes, Boolean> languages;
	private Map<DamageTypes, Boolean> resistances;
	private Map<DamageTypes, Boolean> damageImmunities;
	private Map<DamageTypes, Boolean> conditionsImmunities;

	private List<Action> actions;

	public Creature() {
		this.savingThrows = new EnumMap<>(SavingThrowTypes.class);
		this.skills = new EnumMap<>(SkillTypes.class);
		this.senses = new HashMap<>();
		this.languages = new HashMap<>();
		this.resistances = new HashMap<>();
		this.damageImmunities = new HashMap<>();
		this.conditionsImmunities = new HashMap<>();
		this.actions = new ArrayList<>();
	}

	public Creature(String name, String race, int armorClass, int life, float walkingDisplacement, int strength,
			int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this();
		this.name = name;
		this.race = race;
		this.armorClass = armorClass;
		this.life = life;
		this.walkingDisplacement = walkingDisplacement;
		this.flightDisplacement = 0;
		this.swimmingDisplacement = walkingDisplacement / 2;
		this.telempathy = 0;

		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
	}

	public int attributeModifier(int attributeValue) {
		return (attributeValue - 10) / 2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public float getWalkingDisplacement() {
		return walkingDisplacement;
	}

	public void setWalkingDisplacement(float walkingDisplacement) {
		this.walkingDisplacement = walkingDisplacement;
	}

	public float getFlightDisplacement() {
		return flightDisplacement;
	}

	public void setFlightDisplacement(float flightDisplacement) {
		this.flightDisplacement = flightDisplacement;
	}

	public float getSwimmingDisplacement() {
		return swimmingDisplacement;
	}

	public void setSwimmingDisplacement(float swimmingDisplacement) {
		this.swimmingDisplacement = swimmingDisplacement;
	}

	public float getTelempathy() {
		return telempathy;
	}

	public void setTelempathy(float telempathy) {
		this.telempathy = telempathy;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public Map<SavingThrowTypes, SavingThrow> getSavingThrows() {
		return savingThrows;
	}

	public void setSavingThrows(Map<SavingThrowTypes, SavingThrow> savingThrows) {
		this.savingThrows = savingThrows;
	}

	public Map<SkillTypes, Skill> getSkills() {
		return skills;
	}

	public void setSkills(Map<SkillTypes, Skill> skills) {
		this.skills = skills;
	}

	public Map<SenseTypes, Integer> getSenses() {
		return senses;
	}

	public void setSenses(Map<SenseTypes, Integer> senses) {
		this.senses = senses;
	}

	public Map<LanguageTypes, Boolean> getLanguages() {
		return languages;
	}

	public void setLanguages(Map<LanguageTypes, Boolean> languages) {
		this.languages = languages;
	}

	public Map<DamageTypes, Boolean> getResistances() {
		return resistances;
	}

	public void setResistances(Map<DamageTypes, Boolean> resistances) {
		resistances = resistances;
	}

	public Map<DamageTypes, Boolean> getDamageImmunities() {
		return damageImmunities;
	}

	public void setDamageImmunities(Map<DamageTypes, Boolean> damageImmunities) {
		this.damageImmunities = damageImmunities;
	}

	public Map<DamageTypes, Boolean> getConditionsImmunities() {
		return conditionsImmunities;
	}

	public void setConditionsImmunities(Map<DamageTypes, Boolean> conditionsImmunities) {
		this.conditionsImmunities = conditionsImmunities;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

}
