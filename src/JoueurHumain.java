import java.util.Scanner;

public class JoueurHumain implements Joueur {
	private String nom;

	public JoueurHumain(String nom) {
		this.nom = nom;
	}

	@Override
	public int jouerUnTour(int Score) {
		int reponse = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(nom + "Veuillez saisir un nombre entre 1 et 10 compris:");
		reponse = sc.nextInt();
		System.out.println(this.nom + ": " + Score + " + " + reponse + " = " + (Score + reponse));

		Score = Score + reponse;
		return Score;
	}

	@Override
	public String getNom() {
		return nom;
	}

}
