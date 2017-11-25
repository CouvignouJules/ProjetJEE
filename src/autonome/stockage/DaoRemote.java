package autonome.stockage;

import java.util.List;

import ynovM.service.StationPOJO;

public interface DaoRemote {
	public List<StationPOJO> lireTous();
	public StationPOJO lire(int cle);
	public void inserer(Object elt);
	public void update(int index, Object obj);
	public void update(Object obj);
	public void effacer(int cle);

}
