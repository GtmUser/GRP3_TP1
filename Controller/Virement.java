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


public class Virement {

	
	/**
	 * Clé unique d'identification d'un virement
	 */
	private String iD_virement ;
	/**
	 * Clé unique d'identification d'un compte
	 */
	private String iD_compte;
	/**
	 * Référence bancaire du compte bénéficiare
	 */
	private String compte_beneficiaire;
	/**
	 * Montant de la transaction
	 */
	private String montant;
	/**
	 * Clé unique d'identification d'un employé
	 */
	private String iD_employe;
	
	
	
	public String getiD_virement() {
		return iD_virement;
	}

	public void setiD_virement(String iD_virement) {
		this.iD_virement = iD_virement;
	}

	public String getiD_compte() {
		return iD_compte;
	}

	public void setiD_compte(String iD_compte) {
		this.iD_compte = iD_compte;
	}

	public String getCompte_beneficiaire() {
		return compte_beneficiaire;
	}

	public void setCompte_beneficiaire(String compte_beneficiaire) {
		this.compte_beneficiaire = compte_beneficiaire;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getiD_employe() {
		return iD_employe;
	}

	public void setiD_employe(String iD_employe) {
		this.iD_employe = iD_employe;
	}


	/**
	 * Constructeur de la classe
	 */
	public Virement () {} ;
	public Virement(String iD_virement, String iD_compte, String compte_beneficiaire, String montant, String iD_employe){
		this.iD_virement = iD_virement;
		this.iD_compte = iD_compte;
		this.compte_beneficiaire = compte_beneficiaire;
		this.montant = montant;
		this.iD_employe = iD_employe;
	}
	
	
	
	/**
	 * Virement bancaire entre comptes internes à une agence
	 */
	public void TransfertInt () {} ;
	
	
	/**
	 * Virement bancaire entre comptes d'une agence/banque différente
	 */
	public void TransfertExt () {} ;
	
	
	
}
