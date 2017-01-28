package fr.simplon.chronopost;

public class Colis {
	
	protected int taille;

	public Colis(int taille) {
		this.taille = taille;
	}
	
	public String VerifierColis(){
		String resultat;
		if (this.taille<15) {
			resultat="petit véhicule";
		} else {
			resultat="gros véhicule";
		}
		return resultat;
	}
}
