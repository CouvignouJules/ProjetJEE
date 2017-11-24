/**
 * 
 */
package ynovM.stockage;

/**
 * @author Rémy
 *
 */
public enum EtatStation {
	
		EN_ATTENTE(0), REDEMARRAGE(1), EN_PANNE(2), EN_MARCHE(3);
			private int EtatStation;

			public int getEtatStation() {
				return EtatStation;
			}

			private EtatStation(int etatStation) {
				EtatStation = etatStation;
			}


			
}
