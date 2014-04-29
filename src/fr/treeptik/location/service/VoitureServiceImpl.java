package fr.treeptik.location.service;

import java.sql.SQLException;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import fr.treeptik.location.dao.DAOFactory;
import fr.treeptik.location.dao.VoitureDAO;
import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Voiture;
import fr.treeptik.location.utils.JDBCUtils;

public class VoitureServiceImpl implements VoitureService {

	private VoitureDAO voitureDAO = DAOFactory.getVoitureDAO();
	
	@Override
	public Voiture save(Voiture voiture) throws ServiceException {
		
		try {
			voitureDAO.save(voiture);
			//TO DO
//			JDBCUtils.commitTransaction();
			JDBCUtils.getConnection().commit();
		} catch (SQLException | DAOException e) {
			throw new ServiceException("Erreur save voiture", e);
		}
		return voiture;
	}

	public List<Voiture> findAll() throws ServiceException{
		try {
			return voitureDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll voiture", e);
		}
	}
	
}
