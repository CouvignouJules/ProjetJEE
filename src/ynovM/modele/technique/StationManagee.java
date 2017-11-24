package ynovM.modele.technique;

import ynovM.modele.metier.Station;
import ynovM.service.StationPOJO;
import ynovM.stockage.Dao;
import ynovM.utilitaire.Conversion;

public class StationManagee {
	private Station station;
	private StationPOJO cp;
	private Dao<StationPOJO> dao;
	private int cle;

	/**
	 * 
	 */
	public StationManagee() {
		cle = -1;
		station = null;
		cp = null;
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
		cp = p;
		dao = d;
		station = Conversion.pojoToCage(p);
	}

	/**
	 * 
	 */
	private void init() {
		cp = dao.lire(cle);
		station = Conversion.pojoToCage(cp);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return String.join(" ", "id:", ("" + cle), station.toString());
	}

	public StationPOJO getPOJO() {
		return cp;
	}

}
