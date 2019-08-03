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


public class Client extends Personne {

	/**
	 * Clé unique d'identification d'un client
	 */
	private String iD_client ;
	/**
	 * Catégorie de client (Particulier ou Professionnel)
	 */
	private String categorie ;
	/**
	 * Clé unique d'identification d'un employé
	 */
	private String iD_employe ;
	/**
	 * Clé unique d'identification d'un compte bancaire
	 */
	private String iD_compte ;
	/**
	 * Clé unique d'identification d'une carte bancaire
	 */
	private String iD_carte ;
	
	
		
	public String getID_client() {
		return iD_client;
	}
	
	public void setID_client(String iD_client) {
		this.iD_client = iD_client;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getID_employe() {
		return iD_employe;
	}
	
	public void setID_employe(String iD_employe) {
		this.iD_employe = iD_employe;
	}
	
	public String getID_compte() {
		return iD_compte;
	}
	
	public void setID_compte(String iD_compte) {
		this.iD_compte = iD_compte;
	}
	
	public String getID_carte() {
		return iD_carte;
	}
	
	public void setID_carte(String iD_carte) {
		this.iD_carte = iD_carte;
	}
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public Client () {} ;
	public Client(String nom, String prenom, String adresse, int code_postal, String ville, int telephone, String email, String iD_client, String categorie, String iD_employe, String iD_compte, String iD_carte){
		super(nom,prenom,adresse,code_postal, ville,telephone,email);
		this.iD_client = iD_client;
		this.categorie = categorie;
		this.iD_employe = iD_employe; 
		this.iD_compte = iD_compte; 
		this.iD_carte = iD_carte; 
					
	}
	
	
	/**
	 * Création du compte client dans la base de donnée
	 */
	public void Generate () {} ;
	
	
	/**
	 * Suppression du compte client dans la base de donnée
	 */
	public void Kill () {} ;
	
	
	/**
	 * Mise à jour du compte client dans la base de donnée
	 */
	public void Update () {} ;
	
		
	
}


