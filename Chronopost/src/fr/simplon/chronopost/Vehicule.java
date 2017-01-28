package fr.simplon.chronopost;

public class Vehicule {

	protected String immat;
	protected String marque;
	protected String modele;
	protected String volume;
	protected String tailleColis;
	protected String carburant;
	protected int nbChauffeur;
	protected String periode;
	protected String distance;
	
	public Vehicule(String immat, String marque, String modele, String volume, String tailleColis, String carburant,
			int nbChauffeur, String periode, String distance) {
		this.immat = immat;
		this.marque = marque;
		this.modele = modele;
		this.volume = volume;
		this.tailleColis = tailleColis;
		this.carburant = carburant;
		this.nbChauffeur = nbChauffeur;
		this.periode = periode;
		this.distance = distance;
	}

	public void transporterColis(){
		int nbAleatoire = Appli.aleatoire();
		if (nbAleatoire % 2 == 0) {
			System.out.println("Vroum Vroum.... Votre colis est bien arrivé !");
		}
		else {
			System.out.println("Vroum Vroum.... Pas de chance, votre colis a été perdu !");
		}
		
	}
	
}

