
public class Passer_a_gue {

	private static final int VALEUR_CIBLE = 100;

	public static void main(String[] args) {
		int longueurPont = 0;
		Joueur joueurEnCours = null;

		Joueur joueur1 = new JoueurHumain("Vous");
		Joueur joueur2 = new JoueurOrdi("Moi");

		Joueur[] joueurs = { joueur1, joueur2 };

		int indexTour = 0;
		while (longueurPont < VALEUR_CIBLE) {
			joueurEnCours = joueurs[indexTour % (joueurs.length)];
			longueurPont = joueurEnCours.jouerUnTour(longueurPont);
			indexTour++;
		}

		System.out.println("Bravo " + joueurEnCours.getNom());
	}

}
