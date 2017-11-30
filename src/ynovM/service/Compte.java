package ynovM.service;

import java.io.Serializable;

import javax.persistence.*;

import ynovM.utilitaire.Profile;

@Entity
@Table(name = "user")
@NamedQuery(name = "lireUsers", query = "SELECT a FROM Compte a")
public class Compte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String login;
    private String password;
    private Profile Profile;
    
    public Compte() {
    	super();
    }

    
    public Compte(String identifiant, String mdp, int profile) {
        this.login = identifiant;
        this.password = mdp;
        this.Profile = Profile.values()[profile];
    }

    public String getlogin() {
        return login;
    }

    public void setlogin(String identifiant) {
        this.login = identifiant;
    }

    public String getmdp() {
        return password;
    }

    public void setmdp(String mdp) {
        this.password = mdp;
    }

    public Profile getProfile() {
        return Profile;
    }

    public void setProfile(Profile typeProfile) {
        this.Profile = typeProfile;
    }  
    
    @Override
    public String toString() {
    	return "je m'appel "+this.getlogin()+" je suis un "+this.getProfile();
    }
}