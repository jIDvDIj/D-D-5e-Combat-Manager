package rpgcombatmanager.model;

public class Action {

	private String name;
	private String description;
	private int bonusAchive;
	private float range;
	private Creature target;
	private int damage;
	private String typeDamage;
	private boolean isPassive;

	public Action(String name, String description, boolean isPassive) {
		this.name = name;
		this.description = description;
		this.isPassive = isPassive;
		
		this.bonusAchive = 0;
		this.range = 0;
		this.target = null;
		this.damage = 0;
		this.typeDamage = null;
	}

}