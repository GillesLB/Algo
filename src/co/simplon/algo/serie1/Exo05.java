package co.simplon.algo.serie1;

import java.lang.Math.*;
import java.util.Scanner;

public class Exo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valeur = 1;
		System.out.println("Entrez une valeur : ");
		valeur = sc.nextInt();
		int exposant = 1;
		System.out.println("Entrez un exposant : ");
		exposant = sc.nextInt();
		double resultat = 1;
		for (int loop = 1; loop <= exposant; loop++) {
			resultat = resultat * valeur;
		}
		System.out.println("Le résultat est : " + resultat);
	}
}
