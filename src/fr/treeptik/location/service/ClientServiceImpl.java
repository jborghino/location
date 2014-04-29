package fr.treeptik.location.service;

import java.sql.SQLException;
import java.util.List;

import fr.treeptik.location.dao.ClientDAO;
import fr.treeptik.location.dao.DAOFactory;
import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Client;
import fr.treeptik.location.utils.JDBCUtils;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDAO = DAOFactory.getClientDAO();
	
	@Override
	public Client save(Client client) throws ServiceException {

		
		
		try {
			clientDAO.save(client);
			JDBCUtils.getConnection().commit();
		} catch (SQLException | DAOException e) {
			throw new ServiceException("Erreur save voiture service ", e);
		}
		return client;
	}

	@Override
	public List<Client> findAll() throws ServiceException {
		try {
			return clientDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll client", e);
		}
	}

}
