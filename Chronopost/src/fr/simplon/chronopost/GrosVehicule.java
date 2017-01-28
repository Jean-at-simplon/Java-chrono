package fr.simplon.chronopost;

public class GrosVehicule extends Vehicule {
	
	protected int nbrPause;

	public GrosVehicule(String immat, String marque, String modele, String volume, int pause) {
		super(immat, marque, modele, volume, "gros", "diesel", 2, "jour et nuit", "longue");
		this.nbrPause = pause;
	}
	
	public static Vehicule creerVehicule(String immat, String marque, String modele, String volume, int pause) {
		return new GrosVehicule(immat, marque, modele, volume, pause);
	}
	
	public void afficherVehicule(){
		System.out.println(this.immat +", "+ this.marque + ", "+this.modele+", "+this.volume
				+", "+this.tailleColis +" colis, "+ this.carburant + ", " + this.nbChauffeur 
				+ " chauffeur(s), circule " + this.periode + ", sur une " + this.distance + " distance");
		
		System.out.println("Le nombre de pause par jour est de "+nbrPause);
	}

}
