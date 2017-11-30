package ynovM.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ynovM.service.StationPOJO;
import ynovM.stockage.Dao;

/**
 * 
 * @author Tomafa06
 *	
 *	Classe faisant le lien entre les objets JAVA 
 *	et la BDD pour sauvegarder les donn�es
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
	 * @return la StationPOJO demand�e gr�ce � la cl� (index)
	 */
	@Override
	public StationPOJO lire(int cle) {
		return em.find(StationPOJO.class, cle);
	}
	
	/**
	 * ins�re une nouvelle StationPOJO dans la base de donn�es
	 * @param elt
	 */
	@Override
	public void inserer(StationPOJO elt) {
		em.getTransaction().begin();
		em.persist(elt);
		em.getTransaction().commit();
	}
	
	/**
	 * supprime une stationPOJO de la base de donn�es
	 * en fonction de la cl� (index)
	 * @param cle
	 */
	@Override
	public void effacer(int cle) {
		StationPOJO tmp = null;
		em.getTransaction().begin();
		tmp = em.find(StationPOJO.class, cle);
		em.remove(tmp);
		em.getTransaction().commit();
	}
	
	@Override
	public void update(int index, StationPOJO obj) {
		em.getTransaction().begin();
		update(obj);
		em.getTransaction().commit();
	}
	
	/**
	 * met � jour une StationPOJO dans la base de donn�es
	 * @param obj
	 */
	@Override
	public void update(StationPOJO obj) {
		em.merge(obj);
	}

}
