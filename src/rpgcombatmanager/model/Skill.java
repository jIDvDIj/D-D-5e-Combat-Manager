package rpgcombatmanager.model;

import rpgcombatmanager.model.enums.Dice;
import rpgcombatmanager.model.enums.SkillTypes;

public class Skill {
	public int rollSkillMonster(SkillTypes skillType, Monster monster) {
		Integer totalBonus = 0;
		if (monster.containsSkill(skillType)) {
			totalBonus += monster.getSkill(skillType);
		} else {
			switch (skillType) {
			case ATHLETICS:
				totalBonus = monster.getStrength();
				break;
			case ACROBATICS:
			case SLEIGHT_OF_HAND:
			case STEALTH:
				totalBonus = monster.getDexterity();
				break;
			case ARCANA:
			case HISTORY:
			case INVESTIGATION:
			case NATURE:
			case RELIGION:
				totalBonus = monster.getIntelligence();
				break;
			case ANIMAL_HANDLING:
			case INSIGHT:
			case MEDICINE:
			case PERCEPTION:
			case SURVIVAL:
				totalBonus = monster.getWisdom();
				break;
			case DECEPTION:
			case INTIMIDATION:
			case PERFORMANCE:
			case PERSUASION:
				totalBonus = monster.getCharisma();
				break;
			default:
				throw new IllegalArgumentException("Unrecognized skill type: " + skillType);
			}
			totalBonus = (totalBonus - 10) / 2;
		}
		return Dice.D20.roll() + totalBonus;
	}

	public int rollSkillCharacter(SkillTypes skillType, Character character) {
		Integer totalBonus = 0;

		switch (skillType) {
		case ATHLETICS:
			totalBonus = character.getStrength();
			break;
		case ACROBATICS:
		case SLEIGHT_OF_HAND:
		case STEALTH:
			totalBonus = character.getDexterity();
			break;
		case ARCANA:
		case HISTORY:
		case INVESTIGATION:
		case NATURE:
		case RELIGION:
			totalBonus = character.getIntelligence();
			break;
		case ANIMAL_HANDLING:
		case INSIGHT:
		case MEDICINE:
		case PERCEPTION:
		case SURVIVAL:
			totalBonus = character.getWisdom();
			break;
		case DECEPTION:
		case INTIMIDATION:
		case PERFORMANCE:
		case PERSUASION:
			totalBonus = character.getCharisma();
			break;
		default:
			throw new IllegalArgumentException("Unrecognized skill type: " + skillType);
		}
		totalBonus = (totalBonus - 10) / 2;
		if (character.containsSkill(skillType)) {
			totalBonus += character.getProficiencyBonus();
		}
		return Dice.D20.roll() + totalBonus;
	}
}