package model.characters;

import behaviors.UseWeaponBehavior;

/**
 * Base model of characters existing in game
 * 
 * @author Tomasz Goralski
 * 
 */
public abstract class Character {

	private int health;
	private int mana;
	private int exp;

	private UseWeaponBehavior useWeaponBeahvior;

	
	
	
	/**
	 * method delegating weapon beahavior to concrete implements
	 */
	public void useWeapon(){
		getUseWeaponBeahvior().useWeapon();
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

	public UseWeaponBehavior getUseWeaponBeahvior() {
		return useWeaponBeahvior;
	}

	public void setUseWeaponBeahvior(UseWeaponBehavior useWeaponBeahvior) {
		this.useWeaponBeahvior = useWeaponBeahvior;
	}

}
