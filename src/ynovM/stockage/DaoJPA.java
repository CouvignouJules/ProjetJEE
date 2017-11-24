package ynovM.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ynovM.stockage.Dao;
import ynovM.service.StationPOJO;

/**
 * 
 * @author Tomafa06
 *	
 *	Classe faisant le lien entre les objets JAVA 
 *	et la BDD pour sauvegarder les données
 */
public class DaoJPA implements Dao<StationPOJO> {

	@PersistenceContext(unitName="ynovm")
	
	/**
	 * Permet d'assurer toutes les actions de la persistance
	 */
	private EntityManager em;
	
	/**
	 * ctor
	 * initialise l'EntityManager
	 */
	public DaoJPA() {
		em = Persistence.createEntityManagerFactory("ynovm").createEntityManager();
	}
	
	/**
	 * 
	 * @return la liste de toutes les StationPOJO
	 */
	@Override
	public List<StationPOJO> lireTous() {
		return em.createNamedQuery("lireTous",StationPOJO.class).getResultList();
	}
	
	/**
	 * 
	 * @param cle
	 * @return la StationPOJO demandée grâce à la clé (index)
	 */
	@Override
	public StationPOJO lire(int cle) {
		return em.find(StationPOJO.class, cle);
	}
	
	/**
	 * insère une nouvelle StationPOJO dans la base de données
	 * @param elt
	 */
	@Override
	public void inserer(StationPOJO elt) {
		em.persist(elt);
	}
	
	/**
	 * supprime une stationPOJO de la base de données
	 * en fonction de la clé (index)
	 * @param cle
	 */
	@Override
	public void effacer(int cle) {
		StationPOJO tmp = null;
		tmp = em.find(StationPOJO.class, cle);
		em.remove(tmp);
	}
	
	@Override
	public void update(int index, StationPOJO obj) {
		update(obj);
	}
	
	/**
	 * met à jour une StationPOJO dans la base de données
	 * @param obj
	 */
	@Override
	public void update(StationPOJO obj) {
		em.merge(obj);
	}

}
