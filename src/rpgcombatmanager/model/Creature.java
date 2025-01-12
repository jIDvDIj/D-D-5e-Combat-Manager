package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.Alignment;
import rpgcombatmanager.model.enums.ConditionTypes;
import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.LanguageTypes;
import rpgcombatmanager.model.enums.SenseTypes;

import java.util.Map;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Creature {
	private String name;
	private String race;
	private Alignment alignment;
	private int lifePoints;
	private int armorClass;
	private float walkingDisplacement;
	private float flightDisplacement;
	private float swimmingDisplacement;
	private float telempathyDisplacement;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	private Map<SenseTypes, Integer> senses;
	private EnumSet<LanguageTypes> languages;
	private EnumSet<DamageTypes> resistances;
	private EnumSet<DamageTypes> damageImmunities;
	private EnumSet<ConditionTypes> conditionsImmunities;

	private List<Action> actions;
	private List<Action> passiveActions;

	public Creature() {

		this.senses = new HashMap<>();

		this.languages = EnumSet.noneOf(LanguageTypes.class);
		this.resistances = EnumSet.noneOf(DamageTypes.class);
		this.damageImmunities = EnumSet.noneOf(DamageTypes.class);
		this.conditionsImmunities = EnumSet.noneOf(ConditionTypes.class);
		this.actions = new ArrayList<>();
		this.passiveActions = new ArrayList<>();
	}

	public Creature(String name, String race, Alignment alignment, int armorClass, int lifePoints,
			float walkingDisplacement, int strength, int dexterity, int constitution, int intelligence, int wisdom,
			int charisma) {
		this();
		this.name = name;
		this.race = race;
		this.alignment = alignment;
		this.armorClass = armorClass;
		this.lifePoints = lifePoints;
		this.walkingDisplacement = walkingDisplacement;
		this.flightDisplacement = 0;
		this.swimmingDisplacement = walkingDisplacement / 2;
		this.telempathyDisplacement = 0;

		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
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

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getLife() {
		return lifePoints;
	}

	public void setLife(int life) {
		this.lifePoints = life;
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
		return telempathyDisplacement;
	}

	public void setTelempathy(float telempathy) {
		this.telempathyDisplacement = telempathy;
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

	public Integer getSense(SenseTypes sense) {
		return senses.get(sense);
	}

	public boolean containsSense(SenseTypes sense) {
		return senses.containsKey(sense);
	}

	public Integer addSense(SenseTypes senseType, Integer value) {
		return senses.put(senseType, value);
	}

	public Integer removeSense(SenseTypes senseType) {
		return senses.remove(senseType);
	}

	public void clearSenses() {
		senses.clear();
	}

	public void addLanguage(LanguageTypes languageType) {
		languages.add(languageType);
	}

	public boolean containsLanguage(LanguageTypes languageType) {
		return languages.contains(languageType);
	}

	public void removeLanguage(LanguageTypes languageType) {
		languages.remove(languageType);
	}

	public void clearLanguages() {
		languages.clear();
	}

	public void addResistance(DamageTypes damageType) {
		resistances.add(damageType);
	}

	public boolean containsResistance(DamageTypes damageType) {
		return resistances.contains(damageType);
	}

	public void removeResistance(DamageTypes damageType) {
		resistances.remove(damageType);
	}

	public void clearResistances() {
		resistances.clear();
	}

	public void addDamageImmunity(DamageTypes damageType) {
		damageImmunities.add(damageType);
	}

	public boolean containsDamageImmunity(DamageTypes damageType) {
		return damageImmunities.contains(damageType);
	}

	public void removeDamageImmunity(DamageTypes damageType) {
		damageImmunities.remove(damageType);
	}

	public void clearDamageImmunities() {
		damageImmunities.clear();
	}

	public void addConditionImmunity(ConditionTypes conditionType) {
		conditionsImmunities.add(conditionType);
	}

	public boolean containsConditionImmunity(ConditionTypes conditionType) {
		return conditionsImmunities.contains(conditionType);
	}

	public void removeConditionImmunity(ConditionTypes conditionType) {
		conditionsImmunities.remove(conditionType);
	}

	public void clearConditionImmunities() {
		conditionsImmunities.clear();
	}

	public void CreateAction(String name, String description, int bonusAchive, float range, boolean ispassive,
			boolean isMagicAttack, Boolean isLegendaryAction, List<Damage> damages) {
		actions.add(new Action(name, description, bonusAchive, range, ispassive, isMagicAttack, isLegendaryAction,
				damages));
	}

	public void addAction(Action action) {
		if (action == null) {
			throw new IllegalArgumentException("Action cannot be null.");
		}
		if (actions.contains(action)) {
			throw new IllegalStateException("Action already exists in the list.");
		}
		actions.add(action);
	}
	
	public Action getActionByName(String actionName) {
	    if (actionName == null || actionName.isEmpty()) {
	        throw new IllegalArgumentException("The action name cannot be null or empty.");
	    }
	    return actions.stream()
	                  .filter(action -> actionName.equalsIgnoreCase(action.getName()))
	                  .findFirst()
	                  .orElse(null);
	}

	public boolean removeAction(Action action) {
		return actions.remove(action);
	}

	public List<Action> getActions() {
		return new ArrayList<>(actions);
	}
	
	public void sortActionsAlphabetically() {
	    actions.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
	}

	public void CreatePassiveAction(String name, String description, int bonusAchive, float range, boolean isPassive,
			boolean isMagicAttack, Boolean isLegendaryAction, List<Damage> damages) {
		passiveActions.add(new Action(name, description, bonusAchive, range, isPassive, isMagicAttack,
				isLegendaryAction, damages));
	}

	public void addPassiveAction(Action action) {
		if (action == null || !action.isPassive()) {
			throw new IllegalArgumentException("Invalid action. It must be passive.");
		}
		if (actions.contains(action)) {
			throw new IllegalStateException("Action already exists in the list.");
		}
		passiveActions.add(action);
	}
	
	public Action getPassiveActionByName(String actionName) {
	    if (actionName == null || actionName.isEmpty()) {
	        throw new IllegalArgumentException("The action name cannot be null or empty.");
	    }
	    return passiveActions.stream()
	                  .filter(action -> actionName.equalsIgnoreCase(action.getName()))
	                  .findFirst()
	                  .orElse(null);
	}
	public List<Action> getPassiveActions() {
		return new ArrayList<>(passiveActions);
	}
	
	public boolean removePassiveAction(Action action) {
		return passiveActions.remove(action);
	}
	
	public void sortPassiveActionsAlphabetically() {
	    passiveActions.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
	}
}
