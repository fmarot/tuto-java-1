//import java.util.Scanner;
public class Joueur {
	String nom;
	int force;
	int Rep;
   
	public Joueur(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int jouerUnTour(String nm, int Score, int Force) {
		//Scanner sc = new Scanner(System.in);
		
		switch (Force) {
    	case 0:
    		//System.out.println(nm + "Veuillez saisir un nombre entre 1 et 10 compris:");
    		//int str = sc.nextInt();
    	    Rep = 5;
    		System.out.println(nm + ": " + Score + " + " + Rep + " = " + (Score + Rep));
    		break;
    	case 4:
    		Rep = (100-Score) % 11;
    		//if  (Rep = 0) {
    		//   Rep = 4;
    		//}
    		System.out.println(nm + " : " + Score + " + " + Rep + " = " + (Score + Rep));
    		break;
    	}	
    	Score = Score + Rep;
    return Score; 
    }
 }

