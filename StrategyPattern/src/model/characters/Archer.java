package model.characters;

import behaviors.UseBowBeahavior;

public class Archer extends Character {

	public Archer() {
		setUseWeaponBeahvior(new UseBowBeahavior());
	}
}
