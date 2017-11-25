package autonome.stockage;

import java.util.List;

import ynovM.service.StationPOJO;

public interface DaoRemote {
	
	/**
	 * 
	 * @return la liste de toutes les StationPOJO
	 */
	public List<StationPOJO> lireTous();
	
	/**
	 * 
	 * @param cle
	 * @return la StationPOJO demandée grâce à la clé (index)
	 */
	public StationPOJO lire(int cle);
	
	/**
	 * insère une nouvelle StationPOJO dans la base de données
	 * @param elt
	 */
	public void inserer(Object elt);
	
	/**
	 * met à jour une StationPOJO dans la base de données
	 * @param obj
	 */
	public void update(int index, Object obj);
	public void update(Object obj);
	
	/**
	 * supprime une stationPOJO de la base de données
	 * en fonction de la clé (index)
	 * @param cle
	 */
	public void effacer(int cle);

}
