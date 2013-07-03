package model.characters;

import behaviors.UseSwordBeahavior;

public class Warrior extends Character {

	public Warrior() {
		setUseWeaponBeahvior(new UseSwordBeahavior());
	}

}
