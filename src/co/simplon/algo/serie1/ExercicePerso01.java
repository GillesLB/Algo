package co.simplon.algo.serie1;

import java.util.Scanner;

public class ExercicePerso01 {

	public static void main(String[] args) {
		System.out.println(saluer(15));
		}
	/*
	 * fonction dire
	 */
		public static String saluer (int heure) {
		String dire = "";
		if ((heure < 0 || heure > 24)) {
			dire = "Heu, nous ne sommes pas sur Terre, là !!";
		} else if (heure < 12) {
			dire = "Bonjour !";
		} else if ((heure > 12) && (heure < 14)) {
			dire = "Bon appétit bien sur !";
		} else if (heure < 17) {
			dire = "Bonjour aussi.";
		} else if (heure < 22) {
			dire = "Bonsoir.";
		} else {
			dire = "Bonne nuit ...";
		}
		return dire;
	}
}

