package Controller;


/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 *
 * @author Alex et Lena
 * @version 1.1
 * 
 */


public abstract class CarteBancaire {

	/**
	 * Clé unique d'identification d'une carte bancaire 
	 */
	private String iD_carte ;
	/**
	 * Type de carte bancaire (Visa Premier ou Visa Electron)
	 */
	private String type_carte ;	
	/**
	 * Date de souscription au contrat de carte bancaire 
	 */
	private String date_souscription ;	
	/**
	 * Code secret de la carte bancaire 
	 */
	private float code_carte ;
	/**
	 * Date d'expiration de la carte bancaire 
	 */
	private String date_expiration_carte ;	
	/**
	 * Clé unique d'identification d'un client 
	 */
	private String iD_client ;	
	/**
	 * Clé unique d'identification d'un compte bancaire 
	 */
	private String iD_compte ;	
	
	

	public String getiD_carte() {
		return iD_carte;
	}
	
	public void setiD_carte(String iD_carte) {
		this.iD_carte = iD_carte;
	}
	
	public String getType_carte() {
		return type_carte;
	}

	public void setType_carte(String type_carte) {
		this.type_carte = type_carte;
	}

	public String getDate_souscription() {
		return date_souscription;
	}
	
	public void setDate_souscription(String date_souscription) {
		this.date_souscription = date_souscription;
	}
	
	public float getCode_carte() {
		return code_carte;
	}
	
	public void setCode_carte(float code_carte) {
		this.code_carte = code_carte;
	}
	
	public String getDate_expiration_carte() {
		return date_expiration_carte;
	}
	
	public void setDate_expiration_carte(String date_expiration_carte) {
		this.date_expiration_carte = date_expiration_carte;
	}
	
	public String getiD_client() {
		return iD_client;
	}
	
	public void setiD_client(String iD_client) {
		this.iD_client = iD_client;
	}
	
	public String getiD_compte() {
		return iD_compte;
	}
	
	public void setiD_compte(String iD_compte) {
		this.iD_compte = iD_compte;
	}
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public CarteBancaire() {} ;
	public CarteBancaire(String iD_carte, String type_carte, String date_souscription, float code_carte, String date_expiration_carte, String iD_client, String iD_compte){
		this.iD_carte = iD_carte;
		this.type_carte = type_carte;
		this.date_souscription = date_souscription;
		this.code_carte = code_carte;
		this.date_expiration_carte = date_expiration_carte;
		this.iD_client = iD_client;
		this.iD_compte = iD_compte;
		
	}
	
	
	/**
	 * Souscription d'une carte bancaire
	 */
	public void Subscribe() {}

	
	/**
	 * Résiliation d'une carte bancaire
	 */
	public void Unsubscribe() {}
		
	
	/**
	 * Mise à jour d'une carte bancaire
	 */
	public void Update() {}
	
	
	
}
	
