package fr.treeptik.location.dao;

import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Client;

public interface ClientDAO {

	Client save(Client client) throws DAOException;
	
	void update(Client client) throws DAOException;
	
	void remove(Client client) throws DAOException;
	
	Client findById(Integer id) throws DAOException;
	
	List<Client> findAll() throws DAOException;
	
}
