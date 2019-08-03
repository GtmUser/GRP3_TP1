package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 
 * @author Alex et Soizic
 * @version 1.0
 *
 * @author Alex et Lena
 * @version 1.1
 * 
 */

public class Connexion {

	
	/**
	 * Driver pour accéder à la base donnée
	 */
	private String driver;
	/**
	 * Chainpass pour accéder à la base donnée
	 */
	private String chain;
	/**
	 * User pour accéder à la base donnée
	 */
	private String user;
	/**
	 * Mot de Passe pour accéder à la base donnée
	 */
	private String password;
	
	private Connection Connect=null;
	private Properties ID = null;
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public Connexion () {}
	
	
	/**
	 * Méthode pour se connecter à la base de données
	 */
	public Connection Connect() {
		try {
			FileInputStream newID = new FileInputStream("ID.database");
			ID = new Properties();
			ID.clear();
			ID.load(newID);
			this.driver = ID.getProperty("driver");
			this.chain = ID.getProperty("chain");
			this.user = ID.getProperty("user");
			this.password = ID.getProperty("password");
			newID.close();
		} 
		
		catch (IOException io) {
			System.out.println("Connection failed");
			System.exit(1);
		}

		return Connect() ;
				
	}
	
	
	/**
	 * Méthode pour vérifier des informations dans la base de données
	 */
	public void Verify (){}

	
	/**
	 * Méthode pour se déconnecter de la base de données
	 */
	public void Disconnect() {
		try {
			Connect.close();
		} 
		
		catch (SQLException s) {
			System.out.println("Deconnection failed");
		}
	}


		
	
}
