package fr.simplon.chronopost;

import java.util.ArrayList;

public class ListeGrosVehicule {

	protected ArrayList<GrosVehicule> listeGros;

	public ListeGrosVehicule() {
		super();
		this.listeGros = new ArrayList<>();
	}
	
	public void constituerGrosVehicule(){
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("123-ABC-51", "Renault", "Traffic", "12m3", 4));
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("AB-453-CC", "Renault", "Traffic", "15m3", 6));
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("786-HYT-75", "Renault", "Traffic", "12m3", 5));
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("AB-567-CC", "Peugeolt", "Boxer", "15m3", 4));
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("GG-045-TY", "Renault", "Traffic", "15m3", 6));
		this.listeGros.add((GrosVehicule) GrosVehicule.creerVehicule("BB-948-ML", "Citroen", "Jumpy", "9m3", 6));
	}
	
	public void afficherListe(){
		for (GrosVehicule grosVehicule : listeGros) {
			System.out.println(grosVehicule.immat +", "+ grosVehicule.marque + ", "+grosVehicule.modele+", "+grosVehicule.volume
					+", "+grosVehicule.tailleColis +" colis, "+ grosVehicule.carburant + ", " + grosVehicule.nbChauffeur 
					+ " chauffeur(s), circule " + grosVehicule.periode + ", sur une " + grosVehicule.distance + " distance");
			
			System.out.println("Le nombre de pause par jour est de "+grosVehicule.nbrPause);
		}
	}
	
}
