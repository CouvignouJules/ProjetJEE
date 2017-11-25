/**
 * 
 */
package ynovM.modele.technique;

/**
 * @author Alex
 *
 */
public class ProfileException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfileException()
	{
		super("Ce type de profil n'est pas autorisé à faire ceci.");
	}
	public ProfileException(String msg)
	{
		super(msg);
	}
}
