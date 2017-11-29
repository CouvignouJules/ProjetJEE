package ynovM.utilitaire;

/**
 * 
 * @author Tomafa06
 *
 */
public enum DaoEnum {
	DUR(0), JPA(1);
	private int DaoEnum;
	
	public int getDaoEnum() {
		return DaoEnum;
	}
	
	private DaoEnum(int daoEnum) {
		DaoEnum = daoEnum;
	}
}
