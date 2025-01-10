package rpgcombatmanager.model;

import java.util.ArrayList;
import java.util.List;

import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.Dice;

public class Action {

	private String name;
	private String description;
	private int bonusAchive;
	private float range;
	private boolean isPassive;
	private boolean isMagicAttack;
	private boolean isLegendaryAction;

	private List<Damage> damages;

	public Action(String name, String description, int bonusAchive, float range, boolean isPassive,
			boolean isMagicAttack, Boolean isLegendaryAction, List<Damage> damages) {
		this.name = name;
		this.description = description;
		this.isPassive = isPassive;
		this.isMagicAttack = isMagicAttack;
		this.isLegendaryAction = isLegendaryAction;
		this.bonusAchive = 0;
		this.range = range;
		this.damages = damages != null ? damages : new ArrayList<>();

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

	public boolean isLegendaryAction() {
		return isLegendaryAction;
	}

	public void setLegendaryAction(boolean isLegendaryAction) {
		this.isLegendaryAction = isLegendaryAction;
	}

	public void addDamage(DamageTypes damageType, Dice dice, int diceCount, int standardDamage) {
		damages.add(new Damage(damageType, dice, diceCount, standardDamage));
	}

	public int rollDamage() {
		int totalDamage = 0;
		for (Damage damage : damages) {
			totalDamage += damage.rollDamage();
		}
		return totalDamage;
	}

	public int getStandardDamage() {
		int totalDamage = 0;
		for (Damage damage : damages) {
			totalDamage += damage.getStandardDamage();
		}
		return totalDamage;
	}

}