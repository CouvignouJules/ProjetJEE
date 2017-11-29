package ynovM.vue;

import java.util.List;

import ynovM.controleur.Manager;
import ynovM.modele.technique.StationException;
import ynovM.utilitaire.EtatStation;
import ynovM.utilitaire.TypeStation;

public class YnovM {

	public void afficher() {
		Manager.getInstance().getStations().forEach(System.out::println);
	}
	
	public void ajout(int id, int x, int y, String nom, String localisation, double temperature, double hygrometrie,
			int nebulosite, int anemometre, int pluviometrie, String remarques, TypeStation type) {
		Manager.getInstance().ajouter(id, x, y, nom, localisation, temperature, hygrometrie, nebulosite, anemometre, pluviometrie, remarques, type);
	}
	
	public void supprimer(int id) throws StationException {
		Manager.getInstance().supprimer(id);
	}
	
	public void redemarrer(int id) throws StationException {
		Manager.getInstance().redemarrer(id);
	}
	
	public String rechercherParID(int id) throws StationException {
		return Manager.getInstance().getStationById(id);
	}
	
	public List<String> rechercherParNom(String name) throws StationException {
		return Manager.getInstance().getStationsByName(name);
	}
	
	public List<String> rechercherParLoc(String loc) throws StationException {
		return Manager.getInstance().getStationsByLocalisation(loc);
	}
	
	public List<String> rechercherParEtat(EtatStation etat) throws StationException {
		return Manager.getInstance().getStationsByEtat(etat);
	}
	
	public List<String> rechercherParType(TypeStation type) throws StationException {
		return Manager.getInstance().getStationsByType(type);
	}
	
	public static void main(String[] args) throws StationException {
		YnovM z = null;
		z = new YnovM();
					
		System.out.println("-------------AFFICHAGE---------------");
		z.afficher();
		System.out.println("----------------SUPPRIMER-------------");
		z.supprimer(1);
		z.supprimer(6);
		System.out.println("------------------APRES SUPPRIMER-----------");
		z.afficher();
		System.out.println("-------------AJOUT---------------");
		z.ajout(1, 7, 8, "AlphaStation", "Bretagne", 17, 4, 5, 8, 7, "RAS", TypeStation.AUTONOME);
		z.ajout(6, 7, 8, "BetaStation", "Bretagne", 17, 4, 5, 8, 7, "RAS", TypeStation.ESCLAVE);
		System.out.println("---------------APRES AJOUT-------------");
		z.afficher();		
		System.out.println("-----------------------------");
	}
}
