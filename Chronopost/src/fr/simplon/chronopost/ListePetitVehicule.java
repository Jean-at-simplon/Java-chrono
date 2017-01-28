package fr.simplon.chronopost;

import java.util.ArrayList;

public class ListePetitVehicule {
	
	protected ArrayList<PetitVehicule> listePetit;

	public ListePetitVehicule() {
		super();
		this.listePetit = new ArrayList<>();
	}
	
	public void constituerPetitVehicule(){
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("123-ABC-51", "Renault", "Express", "6m3", "non"));
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("AB-453-CC", "Renault", "Kangoo", "6m3", "oui"));
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("786-HYT-75", "Renault", "Express", "6m3", "non"));
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("AB-567-CC", "Peugeolt", "Partner", "6m3", "oui"));
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("GG-045-TY", "Renault", "Kangoo", "6m3", "non"));
		this.listePetit.add((PetitVehicule) PetitVehicule.creerVehicule("BB-948-ML", "Citroen", "Jumper", "6m3", "oui"));
	}
	
	public void afficherListe(){
		for (PetitVehicule petitVehicule : listePetit) {
			System.out.println(petitVehicule.immat +", "+ petitVehicule.marque + ", "+petitVehicule.modele+", "+petitVehicule.volume
					+", "+petitVehicule.tailleColis +" colis, "+ petitVehicule.carburant + ", " + petitVehicule.nbChauffeur 
					+ " chauffeur(s), circule " + petitVehicule.periode + ", sur une " + petitVehicule.distance + " distance");
			
			if (petitVehicule.autoradio=="oui") {
				System.out.println("Ce véhicule possède un autoradio");
			} else {
				System.out.println("Ce véhicule ne possède pas d'autoradio");
			}
		}
	}

}
