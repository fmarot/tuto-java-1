
public class Passer_a_gue {

	private static final int VALEUR_CIBLE = 100;

	public static void main(String[] args) {
		int lgpont = 0;
		Joueur joueurEnCours = null;

		Joueur[] joueurs = { new Joueur("Vous", 0), new Joueur("Moi", 4) };

		int indexTour = 0;
		while (lgpont < VALEUR_CIBLE) {
			joueurEnCours = joueurs[indexTour % (joueurs.length)];
			lgpont = joueurEnCours.jouerUnTour(lgpont);
			indexTour++;
		}

		System.out.println("Bravo " + joueurEnCours.nom);
	}

}
