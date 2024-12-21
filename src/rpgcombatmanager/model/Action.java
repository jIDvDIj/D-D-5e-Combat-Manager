package rpgcombatmanager.model;

import java.util.HashMap;
import java.util.Map;

import rpgcombatmanager.model.enums.DamageTypes;

public class Action {

	private String name;
	private String description;
	private int bonusAchive;
	private float range;
	private Creature target;
	private int damage;
	private DamageTypes typeDamage;
	private boolean isPassive;
	private boolean isMagicAttack;

	private Map<Integer, Dice> diceDamage;

	public Action(String name, String description, boolean isPassive, boolean isMagicAttack) {
		this.name = name;
		this.description = description;
		this.isPassive = isPassive;
		this.isMagicAttack = isMagicAttack;

		this.bonusAchive = 0;
		this.range = 0;
		this.target = null;
		this.damage = 0;
		this.typeDamage = null;
		this.diceDamage = new HashMap<>();
	}

}