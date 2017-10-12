package co.simplon.algo.serie1;

public class Exo03 {

	 public static void main(String[] args) {
		 System.out.println(noteObtenue('A'));
		 System.out.println(noteObtenue('B'));
		 System.out.println(noteObtenue('C'));
		 System.out.println(noteObtenue('D'));
		 System.out.println(noteObtenue('X'));		 
	 	 }
	     public static String noteObtenue (char note) {
				   String reponse;
				   if (note == 'A') {
					   reponse = "20";
				   } else if (note == 'B') {
					   reponse = "15";
				   } else if (note == 'C') {
					   reponse = "10";
				   } else if (note == 'D') {
					   reponse = "5";
				   } else {
					   reponse = "0";
				   }
				return reponse;
			   }
	}