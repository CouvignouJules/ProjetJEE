package ynovM.controleur;

import java.util.List;
import java.util.Vector;

import ynovM.modele.metier.Station;
import ynovM.modele.technique.StationManagee;

public final class Manager {
	private static Manager instance = null;
	private Vector<StationManagee> lesStations;
	
	public Manager() {
		
	}
	
	public Manager getInstance() {
		return instance;
	}
	
	public void init() {
		
	}
	
	public void redemarrer() {
		
	}
	
	public void ajouter() {
		
	}
	
	public void supprimer() {
		
	}
	
	public List<Station> getStations(){
		List<Station> ret = null;
		return ret; 
	}
}
