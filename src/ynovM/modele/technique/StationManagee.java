package ynovM.modele.technique;

import ynovM.modele.metier.Station;
import ynovM.service.StationPOJO;
import ynovM.stockage.Dao;
import ynovM.utilitaire.Conversion;

public class StationManagee {
	private Station station;
	private StationPOJO sp;
	private Dao<StationPOJO> dao;
	private int cle;

	/**
	 * 
	 */
	public StationManagee() {
		cle = -1;
		station = null;
		sp = null;
		dao = null;
	}

	/**
	 * 
	 * @param clef
	 * @param d
	 */
	public StationManagee(int clef, Dao<StationPOJO> d) {
		cle = clef;
		dao = d;
		init();
	}

	/**
	 * 
	 * @param p
	 * @param d
	 */
	public StationManagee(StationPOJO p, Dao<StationPOJO> d) {
		cle = p.getId();
		sp = p;
		dao = d;
		station = Conversion.pojoToStation(p);
	}

	/**
	 * 
	 */
	private void init() {
		sp = dao.lire(cle);
		station = Conversion.pojoToStation(sp);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return String.join(" ", "id:", ("" + cle), station.toString());
	}

	public StationPOJO getPOJO() {
		return sp;
	}
	
	public void redemarrer() throws StationException {
		if(station != null)	{
			station.redemarrer();
			sp.setEtat(station.getEtat());
			dao.update(cle, sp);
		}		
	}
	
	public void supprimer() {
		if(station != null){
			dao.effacer(cle);
			station = null;
		}
	}

	public void ajouter(StationPOJO sp) {
		if(station != null) {
			dao.inserer(sp);
		}		
	}
}
