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
	 * @return un user demand�e gr�ce � la cl� (index)
	 */
	@Override
	public Compte lire(int id) {
		return em.find(Compte.class, id);
	}
	
	/**
	 * ins�re un nouveau user dans la base de donn�es
	 * @param elt
	 */
	@Override
	public void inserer(Compte elt) {
		em.persist(elt);
	}
	
	/**
	 * supprime une stationPOJO de la base de donn�es
	 * en fonction de la cl� (index)
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
	 * met � jour une StationPOJO dans la base de donn�es
	 * @param obj
	 */
	@Override
	public void update(Compte obj) {
		em.merge(obj);
	}
}
