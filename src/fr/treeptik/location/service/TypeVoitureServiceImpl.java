package fr.treeptik.location.service;

import java.sql.SQLException;
import java.util.List;

import fr.treeptik.location.dao.DAOFactory;
import fr.treeptik.location.dao.TypeVoitureDAO;
import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.TypeVoiture;
import fr.treeptik.location.utils.JDBCUtils;

public class TypeVoitureServiceImpl implements TypeVoitureService{

	TypeVoitureDAO typeVoitureDAO = DAOFactory.getTypeVoitureDAO();
	
	@Override
	public TypeVoiture save(TypeVoiture typeVoiture) throws ServiceException {

		try {
			typeVoitureDAO.save(typeVoiture);
			JDBCUtils.getConnection().commit();
		} catch (SQLException | DAOException e) {
			throw new ServiceException("Erreur save typeVoiture service ", e);
		}
		return typeVoiture;
	}

	@Override
	public List<TypeVoiture> findAll() throws ServiceException{
		try {
			return typeVoitureDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll typeVoiture", e);
		}
	}

}
