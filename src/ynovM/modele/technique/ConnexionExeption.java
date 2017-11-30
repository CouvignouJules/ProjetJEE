package ynovM.modele.technique;


public class ConnexionExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnexionExeption()
	{
		super("mauvait login ou password");
	}
	public ConnexionExeption(String msg)
	{
		super(msg);
	}
}
