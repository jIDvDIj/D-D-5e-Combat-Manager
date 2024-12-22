package rpgcombatmanager.model;

import java.util.ArrayList;
import java.util.List;

import rpgcombatmanager.model.enums.DamageTypes;

public class Action {

	private String name;
	private String description;
	private int bonusAchive;
	private float range;
	private boolean isPassive;
	private boolean isMagicAttack;

	private List<Damage> damages;
	
	public Action(String name, String description, boolean isPassive, boolean isMagicAttack) {
		this.name = name;
		this.description = description;
		this.isPassive = isPassive;
		this.isMagicAttack = isMagicAttack;
		this.bonusAchive = 0;
		this.range = 0;
		this.damages = new ArrayList<>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBonusAchive() {
		return bonusAchive;
	}

	public void setBonusAchive(int bonusAchive) {
		this.bonusAchive = bonusAchive;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public DamageTypes getTypeDamage() {
		return typeDamage;
	}

	public void setTypeDamage(DamageTypes typeDamage) {
		this.typeDamage = typeDamage;
	}

	public boolean isPassive() {
		return isPassive;
	}

	public void setPassive(boolean isPassive) {
		this.isPassive = isPassive;
	}

	public boolean isMagicAttack() {
		return isMagicAttack;
	}

	public void setMagicAttack(boolean isMagicAttack) {
		this.isMagicAttack = isMagicAttack;
	}
	
	public void addDiceDamage(int quantity, Dice Dice) {
		diceDamage.put(quantity, Dice);
	}
	
	
}