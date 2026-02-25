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

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	private class Marche{
		Etal []etals;
		
		public Marche(int nbEtals) {
			this.etals = etals;
			etals =  new Etal[nbEtals];
		}
	}
	
	public void utiliserEtal(int indiceEtal, Gaulois vendeur, String produit, int nbProduit) {
		etals =  new Etal[indiceEtal];
		Etal[indiceEtal].occuperEtal(vendeur, produit, nbProduit);
	}
	
	public static int trouverEtalLibre() {
		for (int i = 0; i < etals.lenght; i++) {
			if(etals[i].isEtalOccupe==false) {
				System.out.println("L'etal" + i + "est libre.");
			}
	}
	
	public Etal[] trouverEtals(String produit) {
		
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
}