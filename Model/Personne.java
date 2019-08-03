package Model;


/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 *
 * @author Alex et Lena
 * @version 1.1
 * 
 */


public class Personne {
	
	/**
	 * Nom de la personne
	 */
	private String nom;
	/**
	 * Prénom de la personne
	 */
	private String prenom;
	/**
	 * Adresse de la personne
	 */
	private String adresse;
	/**
	 * Code Postal de la personne
	 */
	private int code_postal;
	/**
	 * Ville de la personne
	 */
	private String ville;
	/**
	 * Numéro de téléphone de la personne
	 */
	private int telephone;
	/**
	 * E-mail de la personne
	 */
	private String email;	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	/**
	 * Constructeur de la classe
	 */
	public Personne () {} ; 
	public Personne(String nom, String prenom, String adresse, int code_postal, String ville, int telephone, String email){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
		
	}

	
}
