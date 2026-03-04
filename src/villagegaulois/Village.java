package villagegaulois;

import java.util.Iterator;
import villagegaulois.Etal;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import personnages.Chef;
import personnages.Gaulois;
import sun.security.util.Length;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Marche marche;

	public Village(String nom, int nbVillageoisMaximum, int nbEtals) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		this.marche = new Marche(nbEtals);
	}
	
	private class Marche{
		private Etal []etals;
		
		public Marche(int nbEtals) {
			this.etals = etals;
			for(int i=0; i<nbEtals; i++)
				etals[i] = new Etal();	
		}
	

	public void utiliserEtal(int indiceEtal, Gaulois vendeur, String produit, int nbProduit) {
		etals[indiceEtal].occuperEtal(vendeur, produit, nbProduit);
	}
	
	public int trouverEtalLibre() {
		for (int i = 0; i < etals.length; i++) {
			if(etals[i].isEtalOccupe()) {
				return i;
			}
		}
		return -1;
	}
	
	public Etal[] trouverEtals(String produit) {
		int nbEtalsTrouves = 0;
		for (int i = 0; i < etals.length; i++) {
			if(etals[i].isEtalOccupe() && etals[i].contientProduit(produit))
				nbEtalsTrouves++;
			}
		
		Etal[] etalsTrouves = new Etal[nbEtalsTrouves];
		int num = 0;
		for (int i = 0; i < etals.length; i++) {
			if(etals[i].isEtalOccupe() && etals[i].contientProduit(produit))
				etalsTrouves[num] = etals[i];
            num++;
		}
		return etalsTrouves;
	}
	
	public Etal trouverVendeur(Gaulois gaulois) {
		for (int i = 0; i < etals.length; i++) {
			if(etals[i].isEtalOccupe() && etals[i].getVendeur()==gaulois)
				return etals[i];
		}
		return null;
	}
	
	public String afficherMarche() {
		int vide = 0;
		for (int i = 0; i < etals.length; i++) {
			if(etals[i].isEtalOccupe()==false)
				vide++;
			else
				System.out.println(etals[i].afficherEtal());
		}
		System.out.println("Il reste " + vide + " étals non utilisés dans le marché.");
	}
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(String nomGaulois) {
		if (nomGaulois.equals(chef.getNom())) {
			return chef;
		}
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois = villageois[i];
			if (gaulois.getNom().equals(nomGaulois)) {
				return gaulois;
			}
		}
		return null;
	}

	public String afficherVillageois() {
		StringBuilder chaine = new StringBuilder();
		if (nbVillageois < 1) {
			chaine.append("Il n'y a encore aucun habitant au village du chef "
					+ chef.getNom() + ".\n");
		} else {
			chaine.append("Au village du chef " + chef.getNom()
					+ " vivent les légendaires gaulois :\n");
			for (int i = 0; i < nbVillageois; i++) {
				chaine.append("- " + villageois[i].getNom() + "\n");
			}
		}
		return chaine.toString();
	}
	
	public String installerVendeur(Gaulois vendeur, String produit,int
			nbProduit) {
		StringBuilder chaine = new StringBuilder();
			
	}
	
	public String rechercherVendeurProduit(String Produit) {
		if etals.lenght
		
	}
	
	public String rechercherVendeursProduit(String produit) {
		
	}
	
	public Etal rechercherEtal(Gaulois vendeur) {
		
	}
	
	public String partirVendeur(Gaulois vendeur) {
		("Le vendeur" + vendeur + "quitte son étal, il a vendu "20 fleurs" parmi les " 20 " qu'il voulait vendre")
		
	}
	
	public String afficherMarche() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le marché du village " + nom + "possède plusieurs étals :" + afficherMarche());
	}
	
}