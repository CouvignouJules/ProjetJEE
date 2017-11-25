package ynovM.vue;

import java.util.List;

import ynovM.controleur.Manager;
import ynovM.modele.metier.Station;

public class YnovM {	
	public void afficher() {
		Manager.getInstance().getStations().forEach(System.out::println);
	}
	
	public void rechercher() {
		
	}
	
	public static void main(String[] args) {
		YnovM z = null;
		z = new YnovM();
					
		System.out.println("-----------------------------");
		z.afficher();
		System.out.println("-----------------------------");
	}
}
