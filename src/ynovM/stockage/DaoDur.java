package ynovM.stockage;

import java.util.List;
import java.util.Vector;

import ynovM.service.StationPOJO;

public class DaoDur implements Dao<StationPOJO> {
	private List<StationPOJO> elts;
	private int ids[] = { 1, 2, 3 };
	private String noms[] = { "Paris", "Marseille", "Aix-en-Provence" };
	private int x[] = { 1, 1, 0 };
	private int y[] = { 2, 0, 0 };
	private String localisations[] = {"Paris","Marseille","Aix-en-Provence"};
	private double temperatures[] = { 7.2, 24, 25 };
	private double hygrometries[] = { 88, 0.5, 0.9 };
	private int nebulosites[] = { 12, 1, 2 };
	private int anemometres[] = { 3, 13, 11 };
	private int pluviometries[] = { 16, 1, 0 };
	private String remarques[] = { "", "", "" };

	public DaoDur() {
		elts = new Vector<StationPOJO>();
		init();
	}
	/**
	 * Méthode d'initialisation des attributs de DaoDur
	 */
	private void init() {
		StationPOJO tmp = null;
		for (int i = 0; i < noms.length; i++) {
			tmp = new StationPOJO();

			tmp.setId(ids[i]);
			tmp.setNom(noms[i]);
			tmp.setX(x[i]);
			tmp.setY(y[i]);
			tmp.setLocalisation(localisations[i]);
			tmp.setTemperature(temperatures[i]);
			tmp.setHygrometrie(hygrometries[i]);
			tmp.setNebulosite(nebulosites[i]);
			tmp.setAnemometre(anemometres[i]);
			tmp.setPluviometrie(pluviometries[i]);
			tmp.setRemarques(remarques[i]);

			elts.add(tmp);
		}
	}

	@Override
	public List<StationPOJO> lireTous() {
		return elts;
	}

	@Override
	public StationPOJO lire(int cle) {
		return elts.get(cle);
	}

	@Override
	public void inserer(StationPOJO elt) {
		elts.add(elt);
	}

	@Override
	public void update(int index, StationPOJO obj) {
		elts.set(index, obj);
	}

	@Override
	public void effacer(int cle) {
		elts.remove(cle);
	}

}
