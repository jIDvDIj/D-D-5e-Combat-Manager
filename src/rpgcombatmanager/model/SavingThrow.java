package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.Dice;
import rpgcombatmanager.model.enums.SavingThrowTypes;

public class SavingThrow {
	public int rollSavingThrowMonster(SavingThrowTypes savingThrowType, Monster monster) {
		Integer totalBonus = 0;
		if (monster.containsSavingThrow(savingThrowType) == true) {
			totalBonus += monster.getSavingThrow(savingThrowType);
		} else {
			switch (savingThrowType) {
			case STRENGTH:
				totalBonus = monster.getStrength();
				break;
			case DEXTERITY:
				totalBonus = monster.getDexterity();
				break;
			case CONSTITUTION:
				totalBonus = monster.getConstitution();
				break;
			case INTELLIGENCE:
				totalBonus = monster.getIntelligence();
				break;
			case WISDOM:
				totalBonus = monster.getWisdom();
				break;
			case CHARISMA:
				totalBonus = monster.getCharisma();
				break;
			default:
				throw new IllegalArgumentException("Unrecognized Saving Throw type:" + savingThrowType);

			}
			totalBonus = (totalBonus - 10) / 2;
		}
		return Dice.D20.roll() + totalBonus;
	}

	public int rollSavingThrowCharacter(SavingThrowTypes savingThrowType, Character character) {
		Integer totalBonus = 0;

		switch (savingThrowType) {
		case STRENGTH:
			totalBonus = character.getStrength();
			break;
		case DEXTERITY:
			totalBonus = character.getDexterity();
			break;
		case CONSTITUTION:
			totalBonus = character.getConstitution();
			break;
		case INTELLIGENCE:
			totalBonus = character.getIntelligence();
			break;
		case WISDOM:
			totalBonus = character.getWisdom();
			break;
		case CHARISMA:
			totalBonus = character.getCharisma();
			break;
		default:
			throw new IllegalArgumentException("Unrecognized Saving Throw type:" + savingThrowType);

		}
		totalBonus = (totalBonus - 10) / 2;
		if (character.containsSavingThrow(savingThrowType)) {
			totalBonus += character.getProficiencyBonus();
		}
		return Dice.D20.roll() + totalBonus;
	}
}
