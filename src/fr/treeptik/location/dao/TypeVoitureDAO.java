package fr.treeptik.location.dao;

import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.TypeVoiture;

public interface TypeVoitureDAO {

	TypeVoiture save(TypeVoiture voiture) throws DAOException;
	
	void update(TypeVoiture voiture) throws DAOException;
	
	void remove(TypeVoiture voiture) throws DAOException;
	
	TypeVoiture findById(Integer id) throws DAOException;
	
	List<TypeVoiture> findAll() throws DAOException;
	
}
