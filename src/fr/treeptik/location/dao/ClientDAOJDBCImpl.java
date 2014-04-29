package fr.treeptik.location.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Client;
import fr.treeptik.location.utils.JDBCUtils;

public class ClientDAOJDBCImpl implements ClientDAO {

	private Connection connection = JDBCUtils.getConnection();
	
	@Override
	public Client save(Client client) throws DAOException {
		
		try {
			PreparedStatement prepareStatement = connection
					.prepareStatement(
							"INSERT INTO Client (nomcl, adresse, ville) Values (?, ?, ?)",
							Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, client.getNomcl());
			prepareStatement.setString(2, client.getAdrese());
			prepareStatement.setString(3, client.getVille());

			prepareStatement.executeUpdate();
			// pas de commit dans les DAO

		} catch (SQLException e) {
			throw new DAOException("Erreur save client ", e);
		}

		return client;
	}

	@Override
	public void update(Client client) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Client client) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Client findById(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() throws DAOException {
		List<Client> clients = new ArrayList<>();

		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("SELECT nomcl FROM Client ORDER BY nomcl");
			ResultSet executeQuery = statement.executeQuery();

			while (executeQuery.next()) {
				Client client = new Client();

//				client.setCodecl(executeQuery.getInt(1));
				client.setNomcl(executeQuery.getString(1));
//				client.setAdrese(executeQuery.getString(3));
//				client.setVille(executeQuery.getString(4));

				clients.add(client);	
			}
		} catch (SQLException e) {
			throw new DAOException("Erreur findAll client ", e);
		}
		return clients;
	}

}
