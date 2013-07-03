package model;

import behaviors.Weapon;

/**
 * 
 * @author Tomasz Goralski Base model of characters existing in game
 * 
 */
public abstract class Characters {

	private int health;
	private int mana;
	private int exp;

	private Weapon weapon;

	/**
	 * method delegating weapon beahavior to concrete implements
	 */
	public void useWeapon() {
		getWeapon().use();
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
