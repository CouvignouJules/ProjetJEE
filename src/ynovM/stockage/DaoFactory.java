package ynovM.stockage;

public class DaoFactory {

	private static DaoFactory instance = null;
	private DaoFactory() {

	}
	public static DaoFactory getInstance() {
		if (instance == null)
		{
			instance=new DaoFactory();
		}
		return instance;
	}

}
