package fr.treeptik.location.dao;

import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Voiture;

public interface VoitureDAO {


	Voiture save(Voiture voiture) throws DAOException;
	
	void update(Voiture voiture) throws DAOException;
	
	void remove(Voiture voiture) throws DAOException;
	
	Voiture findById(Integer id) throws DAOException;
	
	List<Voiture> findAll() throws DAOException;

}
