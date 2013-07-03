package main;

import behaviors.UseBowBeahavior;
import model.characters.Archer;
import model.characters.Character;
import model.characters.Warrior;

public class Main {

	/**
	 * @param args
	 *            Testing class
	 */
	public static void main(String[] args) {

		startGame();

		model.characters.Character warrior = new Warrior();
		model.characters.Character archer = new Archer();

		warriorUseWeapon(warrior);
		archerUseWeapon(archer);

		warriorChangeStyleOfFight(warrior);
		warriorUseWeapon(warrior);

		endGame();

	}

	private static void warriorChangeStyleOfFight(Character warrior) {
		System.out.println("Warrior founds bow..");
		warrior.setUseWeaponBeahvior(new UseBowBeahavior());
	}

	private static void archerUseWeapon(Character archer) {
		System.out.println("Archer use his weapon: ");
		archer.useWeapon();
	}

	private static void warriorUseWeapon(Character warrior) {
		System.out.println("Warrior use his weapon: ");
		warrior.useWeapon();
	}

	private static void endGame() {
		System.out.println("The End");
	}

	private static void startGame() {
		System.out.println("Start Game");
	}

}
