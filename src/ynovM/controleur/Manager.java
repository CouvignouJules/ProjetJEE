package ynovM.controleur;

import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import esclave.stockage.DaoRemote;
import ynovM.stockage.DaoFactory;
import ynovM.modele.technique.StationManagee;
import ynovM.service.StationPOJO;

public final class Manager {
	private static Manager instance = null;
	private Vector<StationManagee> lesStations;

	private Manager() {
		lesStations = new Vector<>();
		init();
		// initEJB();
	}

	private void init() {
		List<StationPOJO> tmp = null;
		tmp = DaoFactory.getInstance().getDao().lireTous();
		for (StationPOJO cp : tmp) {
			lesStations.add(new StationManagee(cp, DaoFactory.getInstance().getDao()));
		}
	}

	private void initEJB() {
		List<StationPOJO> tmp = null;
		InitialContext contexteWildFly = null;
		Properties env = null;
		DaoRemote daoLocal = null;

		env = new Properties();
		env.put("jboss.naming.client.ejb.context", true);
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

		try {
			contexteWildFly = new InitialContext(env);
			daoLocal = (DaoRemote) contexteWildFly.lookup("//esclave/DaoJPA!esclave.stockage.DaoRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tmp = daoLocal.lireTous();
		for (StationPOJO cp : tmp) {
			lesStations.add(new StationManagee(cp, daoLocal));
		}

	}
	
	//manager est un singleton
	public static Manager getInstance() {
		if(instance == null)
		{
			instance = new Manager();
		}
		return instance;
	}

	public void redemarrer() {

	}

	public void ajouter() {

	}

	public void supprimer() {

	}

	public List<String> getStations() {
		List<String> ret = null;
		ret = new Vector<>();
		for (StationManagee a : lesStations) {
			ret.add(a.toString());
		}
		return ret;
	}

	public List<StationPOJO> getPOJOs() {
		List<StationPOJO> ret = null;
		ret = new Vector<>();
		for (StationManagee a : lesStations) {
			ret.add(a.getPOJO());
		}
		return ret;
	}
}
