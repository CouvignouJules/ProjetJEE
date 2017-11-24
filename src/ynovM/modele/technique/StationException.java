package ynovM.modele.technique;

public class StationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StationException()
	{
		super("Aucune station disponible");
	}
	public StationException(String msg)
	{
		super(msg);
	}

}