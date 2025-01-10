package rpgcombatmanager.model.enums;

import java.util.Random;

public enum Dice {
	D4(4), D6(6), D8(8), D10(10), D12(12), D20(20), D100(100);

	private final int sides;

	Dice(int sides) {
		this.sides = sides;
	}

	public int roll() {
		Random random = new Random();
		return random.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}
}