package Model;

import Controller.Scan;

/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 * 
 * @author Alex et Lena
 * @version 1.1
 * 
 */


public class Gerant extends Employe {

	
	
	/**
	 * Clé unique d'identification d'un audit
	 */
	private String iD_audit ;
		
	
	
	public String getiD_audit() {
		return iD_audit;
	}
	
	public void setiD_audit(String iD_audit) {
		this.iD_audit = iD_audit;
	}
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public Gerant() {} ;
	public Gerant(String nom, String prenom, String adresse, int code_postal, String ville, int telephone, String email, String iD_employe, String password, String iD_agence, String iD_audit, String iD_client){
		super(nom,prenom,adresse,code_postal,ville,telephone,email,iD_employe,password,iD_agence,iD_client);
		this.iD_audit = iD_audit;
	}
	
	
	/**
	 * Authentification au réseau ProxyBank
	 */
	public void Connect() {
		
		Employe newConnexion = new Employe() {} ;
		newConnexion.Authentify() ;
	
	}	
	
	
	/**
	 * Audit des comptes bancaires de l'agence
	 */
	public void Audit () {
		
		Scan newAudit = new Scan() {} ;
		newAudit.ScanDebiteur();
	
	}
	
		
}
