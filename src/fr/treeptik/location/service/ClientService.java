package fr.treeptik.location.service;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Client;

public interface ClientService {

	Client save (Client client) throws ServiceException;
	
	List<Client> findAll() throws ServiceException;
}
