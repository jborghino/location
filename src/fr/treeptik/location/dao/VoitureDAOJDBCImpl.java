package fr.treeptik.location.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Voiture;
import fr.treeptik.location.utils.JDBCUtils;

public class VoitureDAOJDBCImpl implements VoitureDAO {

	private Connection connection = JDBCUtils.getConnection();
	
	@Override
	public Voiture save(Voiture voiture) throws DAOException {
		
		try {
			PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO Voiture (couleur, cumul_reparation, disponible, marque, modele, code_type) Values (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, voiture.getCouleur());
			prepareStatement.setInt(2, voiture.getCumulReparation());
			prepareStatement.setBoolean(3, true);
			prepareStatement.setString(4, voiture.getMarque());
			prepareStatement.setString(5, voiture.getModel());
			prepareStatement.setInt(6, voiture.getCodeType());

			
			prepareStatement.executeUpdate();
			//pas de commit dans les DAO
			
		} catch (SQLException e) {
			throw new DAOException("Erreur save voiture ", e);
		}
		
		return voiture;
	}

	@Override
	public void update(Voiture voiture) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Voiture voiture) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Voiture findById(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findAll() throws DAOException {
		List<Voiture> voitures = new ArrayList<>();
		
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("SELECT noimmatriculation, couleur, cumul_reparation, disponible, marque, modele, code_type FROM Voiture");
			ResultSet executeQuery = statement.executeQuery();
			
			while(executeQuery.next()){
				
				Voiture voiture = new Voiture();
				
				voiture.setNoImmatriculation(executeQuery.getInt(1));
				voiture.setCouleur(executeQuery.getString(2));
				voiture.setCumulReparation(executeQuery.getInt(3));
				voiture.setDisponible(executeQuery.getBoolean(4));
				voiture.setMarque(executeQuery.getString(5));
				voiture.setModel(executeQuery.getString(6));
				voiture.setCodeType(executeQuery.getInt(7));
				
				voitures.add(voiture);
			}
		} catch (SQLException e) {
			throw new DAOException("Erreur findAll voiture ", e);
		}
		return voitures;
	}

}
