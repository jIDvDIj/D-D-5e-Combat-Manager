package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.LanguageTypes;
import rpgcombatmanager.model.enums.SavingThrowTypes;
import rpgcombatmanager.model.enums.SenseTypes;
import rpgcombatmanager.model.enums.SkillTypes;

import java.util.Map;
import java.util.Objects;
import java.util.EnumMap;
import java.util.EnumSet;
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
	private EnumSet<LanguageTypes> languages;
	private EnumSet<DamageTypes> resistances;
	private EnumSet<DamageTypes> damageImmunities;
	private EnumSet<DamageTypes> conditionsImmunities;

	private List<Action> actions;

	public Creature() {
		this.savingThrows = new EnumMap<>(SavingThrowTypes.class);
		this.skills = new EnumMap<>(SkillTypes.class);
		this.senses = new HashMap<>();
		this.languages = EnumSet.noneOf(null);
		this.resistances = EnumSet.noneOf(DamageTypes.class);
		this.damageImmunities = EnumSet.noneOf(DamageTypes.class);
		this.conditionsImmunities = EnumSet.noneOf(DamageTypes.class);
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

	public void addActions(String name, String description, int bonusAchive, float range, boolean ispassive,
			boolean isMagicAttack, List<Damage> damages) {
		actions.add(new Action(name, description, bonusAchive, range, ispassive, isMagicAttack, damages));
	}

	@Override
	public int hashCode() {
		return Objects.hash(actions, armorClass, charisma, conditionsImmunities, constitution, damageImmunities,
				dexterity, flightDisplacement, intelligence, languages, life, name, race, resistances, savingThrows,
				senses, skills, strength, swimmingDisplacement, telempathy, walkingDisplacement, wisdom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return Objects.equals(actions, other.actions) && armorClass == other.armorClass && charisma == other.charisma
				&& Objects.equals(conditionsImmunities, other.conditionsImmunities)
				&& constitution == other.constitution && Objects.equals(damageImmunities, other.damageImmunities)
				&& dexterity == other.dexterity
				&& Float.floatToIntBits(flightDisplacement) == Float.floatToIntBits(other.flightDisplacement)
				&& intelligence == other.intelligence && Objects.equals(languages, other.languages)
				&& life == other.life && Objects.equals(name, other.name) && Objects.equals(race, other.race)
				&& Objects.equals(resistances, other.resistances) && Objects.equals(savingThrows, other.savingThrows)
				&& Objects.equals(senses, other.senses) && Objects.equals(skills, other.skills)
				&& strength == other.strength
				&& Float.floatToIntBits(swimmingDisplacement) == Float.floatToIntBits(other.swimmingDisplacement)
				&& Float.floatToIntBits(telempathy) == Float.floatToIntBits(other.telempathy)
				&& Float.floatToIntBits(walkingDisplacement) == Float.floatToIntBits(other.walkingDisplacement)
				&& wisdom == other.wisdom;
	}

}
