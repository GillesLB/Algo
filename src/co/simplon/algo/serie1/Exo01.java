package co.simplon.algo.serie1;

public class Exo01 {

	   public static void main(String[] args) {
		   System.out.println(donnerLeSigneDuNombre(-5));
		   System.out.println(donnerLeSigneDuNombre(0));
		   System.out.println(donnerLeSigneDuNombre(10));
	       }
	   public static String donnerLeSigneDuNombre (int nombre) {
		   String reponse;
		   if (nombre > 0) {
			   reponse = "Positif";
		   } else if (nombre < 0) {
			   reponse = "Négatif";
		   } else {
			   reponse = "Zéro";
	    }
		return reponse;
	   }
	}