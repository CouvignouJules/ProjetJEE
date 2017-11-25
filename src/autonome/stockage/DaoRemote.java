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
	 * @return la StationPOJO demand�e gr�ce � la cl� (index)
	 */
	public StationPOJO lire(int cle);
	
	/**
	 * ins�re une nouvelle StationPOJO dans la base de donn�es
	 * @param elt
	 */
	public void inserer(Object elt);
	
	/**
	 * met � jour une StationPOJO dans la base de donn�es
	 * @param obj
	 */
	public void update(int index, Object obj);
	public void update(Object obj);
	
	/**
	 * supprime une stationPOJO de la base de donn�es
	 * en fonction de la cl� (index)
	 * @param cle
	 */
	public void effacer(int cle);

}
