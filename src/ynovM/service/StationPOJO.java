/**
 * 
 */
package ynovM.service;

import java.io.Serializable;


/**
 * @author Rémy
 *
 */
@Entity
@Table(name ="station")
@NamedQuery(name="lireTous",query="SELECT cp FROM StationPOJO cp")
public class StationPOJO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int x;
	private int y;
	private String nom;
	private String localisation;
	private double temperature;
	private String hygometrie;
	private int nebulosite;
	private int anemometre;
	private int pluviometrie;
	private String remarques;
	
	public StationPOJO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getHygometrie() {
		return hygometrie;
	}

	public void setHygometrie(String hygometrie) {
		this.hygometrie = hygometrie;
	}

	public int getNebulosite() {
		return nebulosite;
	}

	public void setNebulosite(int nebulosite) {
		this.nebulosite = nebulosite;
	}

	public int getAnemometre() {
		return anemometre;
	}

	public void setAnemometre(int anemometre) {
		this.anemometre = anemometre;
	}

	public int getPluviometrie() {
		return pluviometrie;
	}

	public void setPluviometrie(int pluviometrie) {
		this.pluviometrie = pluviometrie;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}
	
	
}
