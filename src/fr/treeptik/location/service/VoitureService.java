package fr.treeptik.location.service;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Voiture;

public interface VoitureService {

	Voiture save (Voiture save) throws ServiceException;
	
	List<Voiture> findAll() throws ServiceException;
	
}
