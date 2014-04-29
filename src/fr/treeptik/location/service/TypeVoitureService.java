package fr.treeptik.location.service;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.TypeVoiture;

public interface TypeVoitureService {

	TypeVoiture save (TypeVoiture typeVoiture) throws ServiceException;
	
	List<TypeVoiture> findAll() throws ServiceException;
	
}
