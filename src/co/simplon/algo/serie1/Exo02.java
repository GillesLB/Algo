package co.simplon.algo.serie1;

public class Exo02 {

	 public static void main(String[] args) {
		 System.out.println(noteObtenue(-5));
		 System.out.println(noteObtenue(0));
		 System.out.println(noteObtenue(3));
		 System.out.println(noteObtenue(8));
		 System.out.println(noteObtenue(11));
		 System.out.println(noteObtenue(13));
		 System.out.println(noteObtenue(16));
		 System.out.println(noteObtenue(20));		 
	 	 }
	     public static String noteObtenue (int note) {
				   String reponse;
				   if ((note > 20) || (note < 0)) {
					   reponse = "Erreur";
				   } else if (note < 5) {
					   reponse = "Nul";
				   } else if (note < 10) {
					   reponse = "A refaire";
				   } else if (note < 13) {
					   reponse = "Passable";
				   } else if (note < 15) {
					   reponse = "Bien";
				   } else {
					   reponse = "Très bien";
				   }
				return reponse;
			   }
	}