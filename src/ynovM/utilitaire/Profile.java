/**
 * 
 */
package ynovM.utilitaire;

/**
 * @author R�my
 *
 */
public enum Profile {

	ADMINISTRATEUR(0), SUPERVISEUR(1), CONTROLEUR(2);
	private int Profile;

	public int getProfile() {
		return Profile;
	}

	private Profile(int profile) {
		Profile = profile;
	}

}
