package Model;

import Controller.*;


/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 *
 * @author Alex et Lena
 * @version 1.1
 * 
 */


public class Conseiller extends Employe {

	/**
	 * Nombre de clients rattaché au conseiller (max 10)
	 */
	private int nb_client ;
	
		
		
	public int getNb_client() {
		return nb_client;
	}

	public void setNb_client(int nb_client) {
		this.nb_client = nb_client;
	}
	
		
	
	/**
	 * Constructeur de la classe
	 */
	public Conseiller() {} ;
	public Conseiller(String nom, String prenom, String adresse, int code_postal, String ville, int telephone, String email, String iD_employe, String password, String iD_agence, String iD_client, int nb_client){
		super(nom,prenom,adresse,code_postal,ville,telephone,email,iD_employe,password,iD_agence,iD_client);
		this.nb_client = nb_client;
	}
	
	
	/**
	 * Authentification au réseau ProxyBank
	 */
	public void Connect() {
		
		Employe newConnexion = new Employe() {} ;
		newConnexion.Authentify() ;
	
	}	

		
	/**
	 * Création du compte client dans la base de donnée
	 */
	public void CreateClient() {
		
		Client newClient = new Client() {} ;
		newClient.Generate() ;
	
	}

	
	/**
	 * Suppression du compte client dans la base de donnée
	 */
	public void DeleteClient() {
		
		Client exClient = new Client() {} ;
		exClient.Kill() ;
	
	}
	
	
	/**
	 * Mise à jour du compte client dans la base de donnée
	 */
	public void UpdateClient() {
		
		Client majClient = new Client() {} ;
		majClient.Update() ;
	
	}
	
	
	/**
	 * Limitation à 10 clients par comseiller
	 */
	public void LimiteClient() {
		
	}
	
	
	/**
	 * Ouverture un compte bancaire
	 */
	public void CreateCompte() {
		
		CompteBancaire newCompte = new CompteBancaire() {} ;
		newCompte.Open() ;
	
	}
	
	
	/**
	 * Fermeture d'un compte bancaire
	 */
	public void DeleteCompte() {
		
		CompteBancaire exCompte = new CompteBancaire() {} ;
		exCompte.Close() ;
	
	}


	/**
	 * Mise à jour d'un compte bancaire
	 */
	public void UpdateCompte() {
		
		CompteBancaire majCompte = new CompteBancaire() {} ;
		majCompte.Update() ;
	
	}
	
	
	/**
	 * Souscription d'une carte bancaire
	 */
	public void CreateCarte() {
		
		CarteBancaire newCarte = new CarteBancaire() {} ;
		newCarte.Subscribe() ;
	
	}

	
	/**
	 * Résiliation d'une carte bancaire
	 */
	public void DeleteCarte() {
		
		CarteBancaire exCarte = new CarteBancaire() {} ;
		exCarte.Unsubscribe() ;
	
	}

	
	/**
	 * Mise à jour d'une carte bancaire
	 */
	public void UpdateCarte() {
		
		CarteBancaire majCarte = new CarteBancaire() {} ;
		majCarte.Update() ;
	
	}
	
	
	/**
	 * Virement bancaire
	 */
	public void VirementInt() {
		
		Virement abba = new Virement() {} ;
		abba.TransfertInt() ;
	
	}
	
	
	/**
	 * Demande de simulation de credit
	 */
	public void SimuleCredit() {
		
		CompteBancaire newSimulation = new CompteBancaire() {} ;
		newSimulation.SimulationCredit() ;
				
	}	
		
		
	/**
	 * Demande de gestion du patrimoine
	 */
	public void GestionPatrimoine() {
		
		Scan newPatrimoine = new Scan() {} ;
		newPatrimoine.ScanFortune();
	
	}

	
}
