package fr.treeptik.location.service;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Contrat;

public interface ContratService {

	Contrat save(Contrat contrat) throws ServiceException;
	
	List<Contrat> findAll() throws ServiceException;
	
}
