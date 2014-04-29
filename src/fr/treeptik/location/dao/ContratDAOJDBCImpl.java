package fr.treeptik.location.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Contrat;
import fr.treeptik.location.utils.JDBCUtils;

public class ContratDAOJDBCImpl implements ContratDAO {

	private Connection connection = JDBCUtils.getConnection();
	
	@Override
	public Contrat save(Contrat contrat) throws DAOException {
		try {
			PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO Contrat (date_contrat, date_enlevement, date_retour, codecl, noimmatriculation) Values (?, ?, ?, ?, ?)");
			prepareStatement.setDate(1, contrat.getDateContrat());
			prepareStatement.setDate(2, contrat.getDateEnlevement());
			prepareStatement.setDate(3, contrat.getDateRetour());
			prepareStatement.setInt(4, contrat.getCodecl());
			prepareStatement.setInt(5, contrat.getNoImmatriculation());
			
			prepareStatement.executeUpdate();
			
			//pas de commit dans les DAO
			
		} catch (SQLException e) {
			throw new DAOException("Erreur save contrat ", e);
		}
		
		return contrat;
	}

	@Override
	public void update(Contrat contrat) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Contrat contrat) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contrat findById(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrat> findAll() throws DAOException {
		List<Contrat> contrats = new ArrayList<>();
		
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("SELECT nocontrat, date_contrat, date_enlevement, date_retour, codecl, noimmatriculation FROM Contrat ORDER BY date_contrat");
			ResultSet executeQuery = statement.executeQuery();
			
			while(executeQuery.next()){
				
				Contrat contrat = new Contrat();
				
				contrat.setNoContrat(executeQuery.getInt(1));
				contrat.setDateContrat(executeQuery.getDate(2));
				contrat.setDateEnlevement(executeQuery.getDate(3));
				contrat.setDateRetour(executeQuery.getDate(4));
				contrat.setCodecl(executeQuery.getInt(5));
				contrat.setNoImmatriculation(executeQuery.getInt(6));
				
				contrats.add(contrat);
			}
		} catch (SQLException e) {
			throw new DAOException("Erreur findAll voiture ", e);
		}
		return contrats;
	}

}
