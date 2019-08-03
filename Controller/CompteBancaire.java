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


public abstract class CompteBancaire {

	/**
	 * Clé unique d'identification d'un compte bancaire 
	 */
	private String iD_compte ;	
	/**
	 * Type de compte bancaire (Courant ou  Epargne)
	 */
	private String type_compte ;	
	/**
	 * Date d'ouverture du compte bancaire
	 */
	private String date_ouverture ;
		/**
	 * Autorisation de découvert du compte courant
	 */
	private double autorisation_decouvert ;
	/**
	 * taux de rémunération du compte épargne
	 */
	private double taux_remunaration ;
	/**
	 * Clé unique d'identification d'un client
	 */
	private String iD_client ;
	/**
	 * Clé unique d'identification d'un virement
	 */
	private String iD_virement ;
	/**
	 * Clé unique d'identification d'un audit
	 */
	private String iD_audit ;
	/**
	 * Type de crédit (Conso ou Immo)
	 */
	private String type_credit ;
	/**
	 * Montant du crédit
	 */
	private String montant_emprunt ;
	/**
	 * Durée du crédit
	 */
	private String duree_emprunt ;
	
	
		
	public String getiD_compte() {
		return iD_compte;
	}
	
	public void setiD_compte(String iD_compte) {
		this.iD_compte = iD_compte;
	}
	
	public String getType_compte() {
		return type_compte;
	}
	
	public void setType_compte(String type_compte) {
		this.type_compte = type_compte;
	}
	
	public String getDate_ouverture() {
		return date_ouverture;
	}
	
	public void setDate_ouverture(String date_ouverture) {
		this.date_ouverture = date_ouverture;
	}
	
	public double getAutorisation_decouvert() {
		return autorisation_decouvert;
	}
	
	public void setAutorisation_decouvert(double autorisation_decouvert) {
		this.autorisation_decouvert = autorisation_decouvert;
	}
	
	public double getTaux_remunaration() {
		return taux_remunaration;
	}
	
	public void setTaux_remunaration(double taux_remunaration) {
		this.taux_remunaration = taux_remunaration;
	}
	
	public String getiD_client() {
		return iD_client;
	}
	
	public void setiD_client(String iD_client) {
		this.iD_client = iD_client;
	}
	
	public String getiD_virement() {
		return iD_virement;
	}
	
	public void setiD_virement(String iD_virement) {
		this.iD_virement = iD_virement;
	}
	
	public String getiD_audit() {
		return iD_audit;
	}
	
	public void setiD_audit(String iD_audit) {
		this.iD_audit = iD_audit;
	}
	
	public String getType_credit() {
		return type_credit;
	}
	
	public void setType_credit(String type_credit) {
		this.type_credit = type_credit;
	}
	
	public String getMontant_emprunt() {
		return montant_emprunt;
	}
	
	public void setMontant_emprunt(String montant_emprunt) {
		this.montant_emprunt = montant_emprunt;
	}
	
	public String getDuree_emprunt() {
		return duree_emprunt;
	}
	
	public void setDuree_emprunt(String duree_emprunt) {
		this.duree_emprunt = duree_emprunt;
	}
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public CompteBancaire() {} ;
	public CompteBancaire(String iD_compte, String type_compte, String date_ouverture, double autorisation_decouvert,
			double taux_remunaration, String iD_client, String iD_virement, String iD_audit, String type_credit,
			String montant_emprunt, String duree_emprunt) {
		this.iD_compte = iD_compte;
		this.type_compte = type_compte;
		this.date_ouverture = date_ouverture;
		this.autorisation_decouvert = autorisation_decouvert;
		this.taux_remunaration = taux_remunaration;
		this.iD_client = iD_client;
		this.iD_virement = iD_virement;
		this.iD_audit = iD_audit;
		this.type_credit = type_credit;
		this.montant_emprunt = montant_emprunt;
		this.duree_emprunt = duree_emprunt;
	}

	
	
	/**
	 * Ouverture un compte bancaire
	 */
	public void Open () {} ;
	
	
	/**
	 * Fermeture un compte bancaire
	 */
	public void Close () {} ;
		
	
	/**
	 * Mise à jour un compte bancaire
	 */
	public void Update () {} ;
	
	
	/**
	 * Calcul du solde d'un compte bancaire
	 */
	public void Solde () {} ;
	
	
	/**
	 * Simulation de calcul d'un crédit
	 */
	public void SimulationCredit () {} ;
	
	
	
}
