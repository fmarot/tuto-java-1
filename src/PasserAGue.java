
public class PasserAGue {

	private static final int VALEUR_CIBLE = 100;

	private int longueurPont;
	private Joueur[] joueurs;

	public PasserAGue() {
		longueurPont = 0;
		Joueur joueur1 = new JoueurHumain("Vous");
		Joueur joueur2 = new JoueurOrdi("Moi");
		joueurs = new Joueur[] { joueur1, joueur2 };
	}

	public void jouer() {
		Joueur joueurEnCours = null;
		int indexTour = 0;
		while (longueurPont < VALEUR_CIBLE) {
			joueurEnCours = joueurs[indexTour % (joueurs.length)];
			longueurPont = joueurEnCours.jouerUnTour(longueurPont);
			indexTour++;
		}

		System.out.println("Bravo " + joueurEnCours.getNom());
	}

	public static void main(String[] args) {
		PasserAGue passerAGue = new PasserAGue();
		passerAGue.jouer();
	}
}
