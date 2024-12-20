package rpgcombatmanager.model;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Creature {
	private String name;
	private String race;
	private int armorClass;
	private int life;
	private int walkingDisplacement;
	private int flightDisplacement;
	private int swimmingDisplacement;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	private Map<String, SavingThrow> savingThrows;
	private Map<String, Skill> skills;
	private Map<String, Integer> senses;
	private Map<String, Boolean> languages;
	private Map<String, Boolean> damageImmunities;
	private Map<String, Boolean> conditionsImmunities;

	private List<Action> actions;

	public Creature() {
		this.savingThrows = new HashMap<>();
		this.skills = new HashMap<>();
		this.senses = new HashMap<>();
		this.languages = new HashMap<>();
		this.damageImmunities = new HashMap<>();
		this.conditionsImmunities = new HashMap<>();
	}

	public Creature(String name, String race, int armorClass, int life, int walkingDisplacement, int strenght,
			int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this.name = name;
		this.race = race;
		this.armorClass = armorClass;
		this.life = life;
		this.walkingDisplacement = walkingDisplacement;
		this.flightDisplacement = 0;
		this.swimmingDisplacement = 0;
		
		this.strength = strenght;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;

		this.savingThrows = new HashMap<>();
		this.skills = new HashMap<>();
		this.senses = new HashMap<>();
		this.languages = new HashMap<>();
		this.damageImmunities = new HashMap<>();
		this.conditionsImmunities = new HashMap<>();
	}

}
