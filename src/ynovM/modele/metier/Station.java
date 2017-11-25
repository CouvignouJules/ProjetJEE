/**
 * 
 */
package ynovM.modele.metier;

import ynovM.stockage.*;
import ynovM.utilitaire.EtatStation;
import ynovM.utilitaire.TypeStation;

/**
 * @author Rémy
 *
 */
public class Station {

	private int id;
	private int x;
	private int y;
	private String nom;
	private String localisation;
	private double temperature;
	private double hygrometrie;
	private int nebulosite;
	private int anemometre;
	private int pluviometrie;
	private String remarques;

	private EtatStation etat;
	private TypeStation type;

	/**
	 * 
	 */
	public Station() {
		super();
	}

	/**
	 * @param id
	 * @param x
	 * @param y
	 * @param nom
	 * @param localisation
	 * @param temperature
	 * @param hygrometrie
	 * @param nebulosite
	 * @param anemometre
	 * @param pluviometrie
	 * @param remarques
	 * @param etat
	 * @param type
	 */
	public Station(int id, int x, int y, String nom, String localisation, double temperature, double hygrometrie,
			int nebulosite, int anemometre, int pluviometrie, String remarques) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.nom = nom;
		this.localisation = localisation;
		this.temperature = temperature;
		this.hygrometrie = hygrometrie;
		this.nebulosite = nebulosite;
		this.anemometre = anemometre;
		this.pluviometrie = pluviometrie;
		this.remarques = remarques;
		this.etat = EtatStation.EN_MARCHE;
		this.type = TypeStation.AUTONOME;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Station [id=" + id + ", x=" + x + ", y=" + y + ", nom=" + nom + ", localisation=" + localisation
				+ ", temperature=" + temperature + ", hygrometrie=" + hygrometrie + ", nebulosite=" + nebulosite
				+ ", anemometre=" + anemometre + ", pluviometrie=" + pluviometrie + ", remarques=" + remarques
				+ ", etat=" + etat + ", type=" + type + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * @param localisation
	 *            the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the hygrometrie
	 */
	public double gethygrometrie() {
		return hygrometrie;
	}

	/**
	 * @param hygrometrie
	 *            the hygrometrie to set
	 */
	public void sethygrometrie(double hygrometrie) {
		this.hygrometrie = hygrometrie;
	}

	/**
	 * @return the nebulosite
	 */
	public int getNebulosite() {
		return nebulosite;
	}

	/**
	 * @param nebulosite
	 *            the nebulosite to set
	 */
	public void setNebulosite(int nebulosite) {
		this.nebulosite = nebulosite;
	}

	/**
	 * @return the anemometre
	 */
	public int getAnemometre() {
		return anemometre;
	}

	/**
	 * @param anemometre
	 *            the anemometre to set
	 */
	public void setAnemometre(int anemometre) {
		this.anemometre = anemometre;
	}

	/**
	 * @return the pluviometrie
	 */
	public int getPluviometrie() {
		return pluviometrie;
	}

	/**
	 * @param pluviometrie
	 *            the pluviometrie to set
	 */
	public void setPluviometrie(int pluviometrie) {
		this.pluviometrie = pluviometrie;
	}

	/**
	 * @return the remarques
	 */
	public String getRemarques() {
		return remarques;
	}

	/**
	 * @param remarques
	 *            the remarques to set
	 */
	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	/**
	 * @return the etat
	 */
	public EtatStation getEtat() {
		return etat;
	}

	/**
	 * @param etat
	 *            the etat to set
	 */
	public void setEtat(EtatStation etat) {
		this.etat = etat;
	}

	/**
	 * @return the type
	 */
	public TypeStation getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeStation type) {
		this.type = type;
	}

}
