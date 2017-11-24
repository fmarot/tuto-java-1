import java.util.Scanner;

public class Joueur {
	String nom;
	int force;

	public Joueur(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int jouerUnTour(int Score) {
		int reponse = 0;
		
		switch (force) {
		case 0:
			Scanner sc = new Scanner(System.in);
			System.out.println(nom + "Veuillez saisir un nombre entre 1 et 10 compris:");
			reponse = sc.nextInt();
			System.out.println(this.nom + ": " + Score + " + " + reponse + " = " + (Score + reponse));
			break;
		case 4:
			reponse = (100 - Score) % 11;
			if (reponse == 0) {
				reponse = repondreNimporteQuoi();
			}
			System.out.println(nom + " : " + Score + " + " + reponse + " = " + (Score + reponse));
			break;
		}
		Score = Score + reponse;
		return Score;
	}

	private int repondreNimporteQuoi() {
		return 4;
	}
}
