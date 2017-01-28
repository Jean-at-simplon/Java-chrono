package fr.simplon.chronopost;

public class Main {

	public static void main(String[] args) {
		
		ListePetitVehicule listePetitVehicule = new ListePetitVehicule();
		
		ListeGrosVehicule listeGrosVehicule = new ListeGrosVehicule();
		
		listePetitVehicule.constituerPetitVehicule();
		
		listePetitVehicule.afficherListe();
		
		listeGrosVehicule.constituerGrosVehicule();
		
		listeGrosVehicule.afficherListe();
		
		/*Colis colis1 = new Colis(Appli.aleatoire());
		System.out.println("Pour un colis de "+colis1.taille+" kg, il faut un "+colis1.VerifierColis()+".");
		
		if (colis1.taille<15){
			PetitVehicule vehicule1 = new PetitVehicule("123abc51", "Renault", "Kangoo", "6m3", "non");
			vehicule1.afficherVehicule();
			vehicule1.transporterColis();
		} else{
			
			GrosVehicule vehicule2 = new GrosVehicule("AA-123-BB", "Fiat", "Scudo", "12m3","4");
			vehicule2.afficherVehicule();
			vehicule2.transporterColis();
		}*/
		
	}

}
