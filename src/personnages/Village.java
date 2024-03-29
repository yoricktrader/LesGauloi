package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois ;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	private Chef chef;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public static void nvchef(Chef chef, Village village) {
		village.chef=chef;
	}
	
	public static void ajouterHabitant(Gaulois nvhabitant,Village village) {
		if (village.nbVillageois >= village.nbVillageoisMaximum){System.out.println(" Pas de place ");}
		else {
			village.nbVillageois = village.nbVillageois + 1;
			village.villageois[village.nbVillageois]= nvhabitant;
		}
	}
	
	public Gaulois trouverHabitant(int indice) {
		System.out.println("Villageois : " + villageois[indice].getNom());
		return villageois[indice];
	}
	
	public static void afficherVillageois(Village village) {
		System.out.println("Dans le village du chef " + village.chef.getNom() + " vivent les gaulois");
        for (int i =1; i <= village.nbVillageois; i++) {System.out.println("- " + village.villageois[i].getNom());}
	}
	
	public static void main(String[] args) {
		Village ville = new Village("Village des Irreductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,ville);
		nvchef(abraracourcix,ville);
		Gaulois asterix = new Gaulois("Asterix",8);
		ajouterHabitant(asterix,ville);
		afficherVillageois(ville);
		Gaulois obelixe = new Gaulois("Obelixe",25);
		ajouterHabitant(obelixe,ville);
		afficherVillageois(ville);
		//Gaulois gaulois = ville.trouverHabitant(1); 
		//System.out.println(gaulois); Gaulois [nom=Asterix, force=8, effetPotion=1]

	}
	
}
