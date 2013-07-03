package model.characters;

import behaviors.UseSwordBeahavior;

public class Archer extends Character {

	public Archer() {
		setUseWeaponBeahvior(new UseSwordBeahavior());
	}
}
