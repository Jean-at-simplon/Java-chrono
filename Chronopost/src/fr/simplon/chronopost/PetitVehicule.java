package fr.simplon.chronopost;

public class PetitVehicule extends Vehicule {

	protected String autoradio;
	
	public PetitVehicule(String immat, String marque, String modele, String volume, String autoradio) {
		super(immat, marque, modele, volume, "petit", "électrique", 1, "le jour", "courte");
		this.autoradio = autoradio;
	}
	
	public static Vehicule creerVehicule(String immat, String marque, String modele, String volume, String autoradio) {
		return new PetitVehicule(immat, marque, modele, volume, autoradio);
	}
	
	public void afficherVehicule(){
		System.out.println(this.immat +", "+ this.marque + ", "+this.modele+", "+this.volume
				+", "+this.tailleColis +" colis, "+ this.carburant + ", " + this.nbChauffeur 
				+ " chauffeur(s), circule " + this.periode + ", sur une " + this.distance + " distance");
		
		if (autoradio=="oui") {
			System.out.println("Ce véhicule possède un autoradio");
		} else {
			System.out.println("Ce véhicule ne possède pas d'autoradio");
		}
	}

}
