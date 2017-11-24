
public class Passer_a_gue {

	private static final int VALEUR_CIBLE = 100;

	public static void main(String[] args) {
		int lgpont = 0;
		String nomDernierJoueur = "";
		Joueur Humain = new Joueur("Vous", 0);
		Joueur Ordi = new Joueur("Moi", 4);
		// Humain.Nom = "Vous";
		// Humain.Force = 0;
		// Ordi.Nom = "Moi";
		// Ordi.Force = 4;
		while (lgpont < VALEUR_CIBLE) {
			nomDernierJoueur = Humain.nom;
			lgpont = Humain.jouerUnTour(Humain.nom, lgpont, Humain.force);
			if (lgpont < VALEUR_CIBLE) {
				nomDernierJoueur = Ordi.nom;
				lgpont = Ordi.jouerUnTour(Ordi.nom, lgpont, Ordi.force);
			}
		}
		System.out.println("Bravo " + nomDernierJoueur);
	}

}
