package ynovM.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ynovM.service.Compte;
import ynovM.stockage.Dao;

public class DaoCompte implements Dao<Compte>{
@PersistenceContext(unitName="ynovm")
	
	/**
	 * Permet d'assurer toutes les actions de la persistance
	 */
	private EntityManager em;
	
	/**
	 * ctor
	 * initialise l'EntityManager
	 */
	public DaoCompte() {
		em = Persistence.createEntityManagerFactory("ynovm").createEntityManager();
	}
	
	/**
	 * 
	 * @return la liste de tout les user
	 */
	@Override
	public List<Compte> lireTous() {
		return em.createNamedQuery("lireUsers",Compte.class).getResultList();
	}
	
	/**
	 * 
	 * @param cle
	 * @return un user demandée grâce à la clé (index)
	 */
	@Override
	public Compte lire(int id) {
		return em.find(Compte.class, id);
	}
	
	/**
	 * insère un nouveau user dans la base de données
	 * @param elt
	 */
	@Override
	public void inserer(Compte elt) {
		em.persist(elt);
	}
	
	/**
	 * supprime une stationPOJO de la base de données
	 * en fonction de la clé (index)
	 * @param cle
	 */
	@Override
	public void effacer(int cle) {
		Compte tmp = null;
		tmp = em.find(Compte.class, cle);
		em.remove(tmp);
	}
	
	@Override
	public void update(int index, Compte obj) {
		update(obj);
	}
	
	/**
	 * met à jour une StationPOJO dans la base de données
	 * @param obj
	 */
	@Override
	public void update(Compte obj) {
		em.merge(obj);
	}
}
