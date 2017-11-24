package esclave.stockage;

import java.util.List;
import ynovM.service.StationPOJO;
import ynovM.stockage.Dao;

public interface DaoRemote extends Dao<StationPOJO> {

	/**
	 * Méthode retournant la liste des éléments de Dao
	 */
	public List<StationPOJO> lireTous();

	/**
	 * Lecture d'un élément de Dao
	 */
	public StationPOJO lire(int cle);

	/**
	 * Insertion d'un élément dans le Dao
	 */
	public void inserer(StationPOJO elt);

	/**
	 * Mise à jour d'un élément de Dao en fonction d'un index
	 */
	public void update(int index, StationPOJO obj);

	// JAVA 8
	/**
	 * Mise à jour d'un élément de Dao en fonction d'un objet seulement
	 */
	public default void update(StationPOJO obj) {
	}

	/**
	 * Effacement d'un élément de Dao
	 */
	public void effacer(int cle);

}
