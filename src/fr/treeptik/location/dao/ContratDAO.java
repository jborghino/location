package fr.treeptik.location.dao;

import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Contrat;

public interface ContratDAO {

	Contrat save(Contrat contrat) throws DAOException;
	
	void update(Contrat contrat) throws DAOException;
	
	void remove(Contrat contrat) throws DAOException;
	
	Contrat findById(Integer id) throws DAOException;
	
	List<Contrat> findAll() throws DAOException;
}
