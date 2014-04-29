package fr.treeptik.location.service;

import java.sql.SQLException;
import java.util.List;

import fr.treeptik.location.dao.ContratDAO;
import fr.treeptik.location.dao.DAOFactory;
import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Contrat;
import fr.treeptik.location.utils.JDBCUtils;

public class ContratServiceImpl implements ContratService {

	private ContratDAO contratDAO = DAOFactory.getContratDAO();
	
	@Override
	public Contrat save(Contrat contrat) throws ServiceException {
		try {
			contratDAO.save(contrat);
			JDBCUtils.getConnection().commit();
		} catch (SQLException | DAOException e) {
			throw new ServiceException("Erreur save contrat service ", e);
		}
		
		return contrat;
	}

	@Override
	public List<Contrat> findAll() throws ServiceException {
		try {
			return contratDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll contrat", e);
		}
	}

}
