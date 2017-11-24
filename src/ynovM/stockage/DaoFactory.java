package ynovM.stockage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ynovM.service.StationPOJO;

/**
 * 
 * @author Tomafa06
 * Classe Singleton
 */
public class DaoFactory {

	/**
	 * Nom du fichier de propriétés
	 */
	public final static String FICHIER="acces.properties";
	
	/**
	 * Instance de la factory
	 */
	private static DaoFactory instance = null;
	
	/**
	 * ctor PRIVÉ
	 */
	private DaoFactory() {}
	
	/**
	 * 
	 * @return l'instance de la factory, si elle n'existe pas, 
	 * la crée puis la retourne
	 */
	public static DaoFactory getInstance() {
		if (instance == null)
		{
			instance = new DaoFactory();
		}
		return instance;
	}

	/**
	 * 
	 * @return une nouvelle DaoJPA
	 */
	public Dao<StationPOJO> getDao() {
		return new DaoJPA();
	}
	
	/**
	 * 
	 * @return le nom de la DaoJPA grâce à l'injection de dépendance
	 */
	private String getNomDao()
	{
		String ret = "";
		Properties prop = null;
		prop = new Properties();
		
		try {
			prop.load(new FileInputStream(FICHIER));
			ret = prop.getProperty("package") + prop.getProperty("dao");
		} catch (FileNotFoundException e) {
			// FIXME Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
}
