package ynovM.stockage;

import java.util.List;

public interface Dao<T> {

	/**
	 * Méthode retournant la liste des éléments de Dao
	 */
	public List<T> lireTous();

	/**
	 * Lecture d'un élément de Dao
	 */
	public T lire(int cle);

	/**
	 * Insertion d'un élément dans le Dao
	 */
	public void inserer(T elt);

	/**
	 * Mise à jour d'un élément de Dao en fonction d'un index
	 */
	public void update(int index, T obj);

	// JAVA 8
	/**
	 * Mise à jour d'un élément de Dao en fonction d'un objet seulement
	 */
	public default void update(T obj) {
	}

	/**
	 * Effacement d'un élément de Dao
	 */
	public void effacer(int cle);
}
