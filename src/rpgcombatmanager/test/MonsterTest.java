package rpgcombatmanager.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rpgcombatmanager.model.Action;
import rpgcombatmanager.model.Damage;
import rpgcombatmanager.model.Monster;
import rpgcombatmanager.model.enums.Alignment;
import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.Dice;
import rpgcombatmanager.model.enums.Size;

import java.util.List;

class MonsterTest {

	private Monster aarakocra;

	// String name, String race, Alignment alignment, int armorClass, int life,
	// float walkingDisplacement,
	// int strength, int dexterity, int constitution, int intelligence, int wisdom,
	// int charisma, Size size
	@BeforeEach
	void setUp() {
		aarakocra = new Monster("Aarakocra", "Humanoid", Alignment.NEUTRAL_GOOD, 12, 13, 20, 10, 14, 10, 11, 12, 11,
				Size.MEDIUM);
		aarakocra.setFlightDisplacement(50);
	}

	@Test
	void testConstructor() {
		assertEquals("Aarakocra", aarakocra.getName());
		assertEquals("Humanoid", aarakocra.getRace());
		assertEquals(Alignment.NEUTRAL_GOOD, aarakocra.getAlignment());
		assertEquals(12, aarakocra.getArmorClass());
		assertEquals(13, aarakocra.getLife());
		assertEquals(20, aarakocra.getWalkingDisplacement());
		assertEquals(10, aarakocra.getStrength());
		assertEquals(50, aarakocra.getFlightDisplacement());
	}

	@Test
	void testSettersAndGetters() {
		aarakocra.setName("Orc");
		assertEquals("Orc", aarakocra.getName());

		aarakocra.setRace("Dragon");
		assertEquals("Dragon", aarakocra.getRace());

		aarakocra.setLife(50);
		assertEquals(50, aarakocra.getLife());

	}

	@Test
	void testAttributeModifier() {
		assertEquals(0, aarakocra.attributeModifier(10)); // (10 - 10) / 2 = 0
		assertEquals(2, aarakocra.attributeModifier(14)); // (14 - 10) / 2 = 2
		assertEquals(-1, aarakocra.attributeModifier(8)); // (8 - 10) / 2 = -1
	}

	@Test
	void testAddActions() {
		Action diveAttack = new Action("Dive Attack",
				"If the aarakocra is flying and dives at least 30 feet straight toward a target and then hits it with a melee weapon attack, the attack deals an extra 3 (1d6) damage to the target.",
				0, 0, true, false, false, List.of(new Damage(DamageTypes.SLASHING, Dice.D6, 1, 0, 3)));
		aarakocra.CreateAction("Talon", " Melee Weapon Attack", 4, 5, false, false, false, List.of(new Damage(DamageTypes.SLASHING, Dice.D4, 1, 2, 4)));
		aarakocra.addAction(diveAttack);
		
		aarakocra.sortActionsAlphabetically();
		assertEquals("Talon", aarakocra.getActionByName("Talon").getName());
		assertEquals(4, aarakocra.getActionByName("Talon").getStandardDamage());
	}

	@Test
	void testDefaultValues() {
		Monster defaultCreature = new Monster();
		assertEquals(0, defaultCreature.getLife());
		assertEquals(0, defaultCreature.getArmorClass());
	}
}
