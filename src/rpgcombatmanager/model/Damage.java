package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.Dice;

public class Damage {
	private DamageTypes damageType;
	private Dice dice;
	private int diceCount;
	private int standardDamage;

	public Damage(DamageTypes damageType, Dice dice, int diceCount, int standardDamage) {
		this.damageType = damageType;
		this.dice = dice;
		this.diceCount = diceCount;
		this.standardDamage = standardDamage;
	}

	public DamageTypes getDamageType() {
		return damageType;
	}

	public void setDamageType(DamageTypes damageType) {
		this.damageType = damageType;
	}

	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	public int getDiceCount() {
		return diceCount;
	}

	public void setDiceCount(int diceCount) {
		this.diceCount = diceCount;
	}

	public int getStandardDamage() {
		return standardDamage;
	}

	public void setStandardDamage(int standardDamage) {
		this.standardDamage = standardDamage;
	}

	public int rollDamage() {
		int totalDamage = 0;
		for (int i = 0; i < diceCount; i++) {
			totalDamage += dice.roll();
		}
		return totalDamage;
	}

}
