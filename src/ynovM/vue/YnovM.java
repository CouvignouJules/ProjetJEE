package ynovM.vue;

import java.util.List;

import ynovM.controleur.Manager;
import ynovM.modele.metier.Station;

public class YnovM {

	public void afficher() {
		Manager.getInstance().getStations().forEach(System.out::println);
	}
	
	public void ajout(int id, int x, int y, String nom, String localisation, double temperature, double hygrometrie,
			int nebulosite, int anemometre, int pluviometrie, String remarques) {
		Manager.getInstance().ajouter(id, x, y, nom, localisation, temperature, hygrometrie, nebulosite, anemometre, pluviometrie, remarques);
	}
	
	public void supprimer(int id) {
		Manager.getInstance().supprimer(id);
	}
	
	public void rechercher() {
		
	}
	
	public static void main(String[] args) {
		YnovM z = null;
		z = new YnovM();
					
		System.out.println("-----------------------------");
		z.afficher();
		System.out.println("-----------------------------");
		z.ajout(5, 7, 8, "AlphaStation", "Bretagne", 17, 4, 5, 8, 7, "RAS");
		System.out.println("---------------APRES AJOUT-------------");
		z.afficher();
		System.out.println("-----------------------------");
		z.supprimer(1);
		System.out.println("-----------------------------");
		z.afficher();
		System.out.println("-----------------------------");
	}
}
