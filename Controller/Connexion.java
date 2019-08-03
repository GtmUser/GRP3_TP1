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
	 * Driver pour acc�der � la base donn�e
	 */
	private String driver;
	/**
	 * Chainpass pour acc�der � la base donn�e
	 */
	private String chain;
	/**
	 * User pour acc�der � la base donn�e
	 */
	private String user;
	/**
	 * Mot de Passe pour acc�der � la base donn�e
	 */
	private String password;
	
	private Connection Connect=null;
	private Properties ID = null;
	
	
	
	/**
	 * Constructeur de la classe
	 */
	public Connexion () {}
	
	
	/**
	 * M�thode pour se connecter � la base de donn�es
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
	 * M�thode pour v�rifier des informations dans la base de donn�es
	 */
	public void Verify (){}

	
	/**
	 * M�thode pour se d�connecter de la base de donn�es
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
