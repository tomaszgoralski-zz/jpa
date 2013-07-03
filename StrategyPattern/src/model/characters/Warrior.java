package model.characters;

import behaviors.UseBowBeahavior;

public class Warrior extends Character {

	public Warrior() {
		setUseWeaponBeahvior(new UseBowBeahavior());
	}

}
