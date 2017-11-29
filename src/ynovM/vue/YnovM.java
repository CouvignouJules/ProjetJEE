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
	
	public void rechercherParNom(String name) throws StationException {
		Manager.getInstance().getStationsByName(name).forEach(System.out::println);
	}
	
	public void rechercherParLoc(String loc) throws StationException {
		Manager.getInstance().getStationsByLocalisation(loc).forEach(System.out::println);
	}
	
	public void rechercherParEtat(EtatStation etat) throws StationException {
		Manager.getInstance().getStationsByEtat(etat).forEach(System.out::println);
	}
	
	public void rechercherParType(TypeStation type) throws StationException {
		Manager.getInstance().getStationsByType(type).forEach(System.out::println);
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
		System.out.println("-------------AVANT REDEMARRER----------------");
		z.redemarrer(1);
		System.out.println("--------------APRES REDEMARRER--------------");
		z.afficher();
		System.out.println("------------RECHERCHE PAR ID-----------------");
		System.out.println(z.rechercherParID(1));
		System.out.println("-----------RECHERCHE PAR ETAT------------------");
		z.rechercherParEtat(EtatStation.EN_MARCHE);
		System.out.println("-----------------------------");
		z.rechercherParType(TypeStation.AUTONOME);
		System.out.println("-----------------------------");
		z.rechercherParLoc("Lille");
		System.out.println("-----------------------------");
		z.rechercherParNom("Marseille");
		
	}
}
