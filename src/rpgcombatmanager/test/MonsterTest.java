package rpgcombatmanager.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rpgcombatmanager.model.Damage;
import rpgcombatmanager.model.Monster;
import rpgcombatmanager.model.enums.Alignment;
import rpgcombatmanager.model.enums.DamageTypes;
import rpgcombatmanager.model.enums.Dice;
import rpgcombatmanager.model.enums.Size;

import java.util.List;

class MonsterTest {

    private Monster goblin;

    @BeforeEach
    void setUp() {
        goblin = new Monster("Goblin", "Monstro", Alignment.CHAOTIC_EVIL, 15, 30, 30, 
                10, 14, 12, 8, 10, 6, Size.SMALL);
    }

    @Test
    void testConstructor() {
        assertEquals("Goblin", goblin.getName());
        assertEquals("Monstro", goblin.getRace());
        assertEquals(Alignment.CHAOTIC_EVIL, goblin.getAlignment());
        assertEquals(15, goblin.getArmorClass());
        assertEquals(30, goblin.getLife());
        assertEquals(30.0f, goblin.getWalkingDisplacement());
        assertEquals(10, goblin.getStrength());
    }

    @Test
    void testSettersAndGetters() {
        goblin.setName("Orc");
        assertEquals("Orc", goblin.getName());

        goblin.setRace("Guerreiro");
        assertEquals("Guerreiro", goblin.getRace());

        goblin.setLife(50);
        assertEquals(50, goblin.getLife());
    }

    @Test
    void testAttributeModifier() {
        assertEquals(0, goblin.attributeModifier(10)); // (10 - 10) / 2 = 0
        assertEquals(2, goblin.attributeModifier(14)); // (14 - 10) / 2 = 2
        assertEquals(-1, goblin.attributeModifier(8)); // (8 - 10) / 2 = -1
    }

    @Test
    void testAddActions() {
        goblin.CreateAction(
                "Ataque Básico",
                "Um golpe simples com espada",
                5,
                5.0f,
                false,
                false,
                false,
                List.of(new Damage(DamageTypes.SLASHING, Dice.D6, 2, 10))
        );
    }

    @Test
    void testDefaultValues() {
        Monster defaultCreature = new Monster();
        assertEquals(0, defaultCreature.getLife());
        assertEquals(0, defaultCreature.getArmorClass());
    }
}
