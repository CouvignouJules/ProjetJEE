package ynovM.stockage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ynovM.Stockage.Dao;
import ynovM.service.StationPOJO;

public class DaoJPA implements Dao<StationPOJO> {

	@PersistenceContext(unitName="ynovm")
	private EntityManager em;
	
	public DaoJPA() {
		em = Persistence.createEntityManagerFactory("ynovm").createEntityManager();
	}
	
	@Override
	public List<StationPOJO> lireTous() {
		return em.createNamedQuery("lireTous",StationPOJO.class).getResultList();
	}
	
	@Override
	public CagePOJO lire(int cle) {
		return em.find(StationPOJO.class, cle);
	}
	
	@Override
	public void inserer(StationPOJO elt) {
		em.persist(elt);
	}
	
	@Override
	public void update(int index, StationPOJO obj) {
		update(obj);
	}
	
	@Override
	public void effacer(int cle) {
		StationPOJO tmp = null;
		tmp = em.find(StationPOJO.class, cle);
		em.remove(tmp);
	}
	
	@Override
	public void update(StationPOJO obj) {
		em.merge(obj);
	}

}
