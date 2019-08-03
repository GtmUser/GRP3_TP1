package Model;

import Controller.Connexion;

/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 *
 * @author Alex et Lena
 * @version 1.1
 * 
 */


public class Employe extends Personne {

	/**
	 * Clé unique d'identification d'un employé
	 */
	private String iD_employe ;
	/**
	 * Mot de passe de l'employé
	 */
	private String password ;
	/**
	 * Clé unique d'identification d'une agence
	 */
	private String iD_agence ;
	/**
	 * Clé unique d'identification d'un client
	 */
	private String iD_client ;
	
		
	
	public String getiD_employe() {
		return iD_employe;
	}
	
	public void setiD_employe(String iD_employe) {
		this.iD_employe = iD_employe;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getiD_agence() {
		return iD_agence;
	}
	
	public void setiD_agence(String iD_agence) {
		this.iD_agence = iD_agence;
	}
	
	public String getiD_client() {
		return iD_client;
	}
	
	public void setiD_client(String iD_client) {
		this.iD_client = iD_client;
	}
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public Employe() {} ;
	public Employe(String nom, String prenom, String adresse, int code_postal, String ville, int telephone,String email, String iD_employe, String password, String iD_agence, String iD_client){
		super(nom,prenom,adresse,code_postal,ville,telephone,email);
		this.iD_employe = iD_employe;
		this.password = password;
		this.iD_agence = iD_agence;
		this.iD_client = iD_client;
		
	}
	
	
	/**
	 * Authetification de l'employé au système
	 */
	public void Authentify() {
		
		Connexion newAuthentification = new Connexion() {} ;
		newAuthentification.Connect();
		newAuthentification.Disconnect();
	}
	
	
	
}