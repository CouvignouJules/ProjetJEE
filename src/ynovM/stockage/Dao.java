package ynovM.stockage;

import java.util.List;

public interface Dao<T> {

	/**
	 * M�thode retournant la liste des �l�ments de Dao
	 */
	public List<T> lireTous();

	/**
	 * Lecture d'un �l�ment de Dao
	 */
	public T lire(int cle);

	/**
	 * Insertion d'un �l�ment dans le Dao
	 */
	public void inserer(T elt);

	/**
	 * Mise � jour d'un �l�ment de Dao en fonction d'un index
	 */
	public void update(int index, T obj);

	// JAVA 8
	/**
	 * Mise � jour d'un �l�ment de Dao en fonction d'un objet seulement
	 */
	public default void update(T obj) {
	}

	/**
	 * Effacement d'un �l�ment de Dao
	 */
	public void effacer(int cle);
}
