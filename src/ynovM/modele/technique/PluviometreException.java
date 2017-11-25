package ynovM.modele.technique;

public class PluviometreException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PluviometreException()
	{
		super("Pluviomètre en panne");
	}
	public PluviometreException(String msg)
	{
		super(msg);
	}
}