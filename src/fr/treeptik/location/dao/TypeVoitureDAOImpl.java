package fr.treeptik.location.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.TypeVoiture;
import fr.treeptik.location.utils.JDBCUtils;

public class TypeVoitureDAOImpl implements TypeVoitureDAO {

	private Connection connection = JDBCUtils.getConnection();

	@Override
	public TypeVoiture save(TypeVoiture typeVoiture) throws DAOException {
		try {
			PreparedStatement prepareStatement = connection
					.prepareStatement("INSERT INTO Type_voiture (description_type, places, prix_jour) Values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, typeVoiture.getDescriptionType());
			prepareStatement.setInt(2, typeVoiture.getPlaces());
			prepareStatement.setInt(3, typeVoiture.getPrixJour());

		} catch (SQLException e) {
			throw new DAOException("Erreur save typeVoiture ", e);
		}

		return typeVoiture;
	}

	@Override
	public void update(TypeVoiture voiture) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(TypeVoiture voiture) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public TypeVoiture findById(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeVoiture> findAll() throws DAOException {
		List<TypeVoiture> typeVoitures = new ArrayList<>();

		PreparedStatement statement;
		try {
			statement = connection
					.prepareStatement("SELECT code_type, description_type, places, prix_jour FROM Type_voiture");
			ResultSet executeQuery = statement.executeQuery();

			while (executeQuery.next()) {

				TypeVoiture typeVoiture = new TypeVoiture();

				typeVoiture.setCodeType(executeQuery.getInt(1));
				typeVoiture.setDescriptionType(executeQuery.getString(2));
				typeVoiture.setPlaces(executeQuery.getInt(3));
				typeVoiture.setPrixJour(executeQuery.getInt(4));

				typeVoitures.add(typeVoiture);
			}
		} catch (SQLException e) {
			throw new DAOException("Erreur findAll voiture ", e);
		}
		return typeVoitures;

	}

}
