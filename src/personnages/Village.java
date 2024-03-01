package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois ;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageaois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	
	public ajouterHabitant(Gaulois nvhabitant) {
		if this.nbVillageois >= this.nbVillageoisMaximum{System.out.println(" Pas de place ");}
		else {
			this.nbVillageois = this.nbVillageois + 1;
			villageaois[this.nbvillageaois]= nvhabitant;
		}
	}
	
	public trouverHabitant(int indice) {
		return villageois[indice];
	}
	
	public void afficherVillageois(Village village) {

        for (int i = 1; i < nbVillageois; i++) {
        	if village.villageois[i] == Gaulois {System.out.println("Villageois : " + village.villageois[i].getNom());}
        	else {System.out.println("Chef du village : " + village.villageois[i].getNom());}
        }
    }
}
	
	public static void main(String[] args) {
		Village villages = new Village("Village des Irreductibles");
		village(vilage.nom, 30);
		Chef abraracourcix = new Chef("Abraracourcix",6,villages);
		Gaulois asterix = new Gaulois("Asterix",8,villages);
		Gaulois oblixe = new Gaulois("Obleixe",25,villages);
		afficherVillageois(villages);
	}
	
}
