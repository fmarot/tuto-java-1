public class JoueurOrdi implements Joueur {
	private String nom;

	public JoueurOrdi(String nom) {
		this.nom = nom;
	}

	@Override
	public int jouerUnTour(int Score) {
		int reponse = 0;

		reponse = (100 - Score) % 11;
		if (reponse == 0) {
			reponse = repondreNimporteQuoi();
		}
		System.out.println(nom + " : " + Score + " + " + reponse + " = " + (Score + reponse));

		Score = Score + reponse;
		return Score;
	}

	@Override
	public String getNom() {
		return nom;
	}

	private int repondreNimporteQuoi() {
		return 4;
	}

}
