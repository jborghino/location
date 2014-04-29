package fr.treeptik.location.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DAOFactory {

	
	private static Properties properties = new Properties();
	
	public static ClientDAO getClientDAO(){
		return new ClientDAOJDBCImpl();
	}
	
	public static VoitureDAO getVoitureDAO(){
		String mod = properties.getProperty("mod");
		
		if("text".equals(mod)){
			return new VoitureDAOFileImpl();
		} else if("jdbc".equals(mod)){
			return new VoitureDAOJDBCImpl();
		} else {
			System.out.println("Mod non initialisé");
			return null;
		}
		
		
		
	}
	
	public static ContratDAO getContratDAO(){
		return new ContratDAOJDBCImpl();
	}
	
	public static TypeVoitureDAO getTypeVoitureDAO(){
		return new TypeVoitureDAOImpl();
	}
	
	
	// un bloc static est chargé au demarage de l'application
	// et est chargé qu'une seule fois
	 static {
		String f = "./conf/confVoiture.properties";
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream(f));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}