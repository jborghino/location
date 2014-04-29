package fr.treeptik.location.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.treeptik.location.exception.DAOException;

public class JDBCUtils {

	private static Connection connection;

	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
				
				// Chargement du driver MySQL
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				// Externaliser dans un .properties
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/Location", "root", "root");
				connection.setAutoCommit(false);

			}

		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			throw new IllegalAccessError();
		}

		return connection;

	}

	public static void commitTransaction() throws DAOException{
		try {
			connection.commit();
		} catch (SQLException e) {
			throw new DAOException("Erreur commit transaction", e);
		}
	}
	
	public static void rollbackTransaction() throws DAOException {
		try {
			connection.rollback();
		} catch (SQLException e) {
			throw new DAOException("Erreur rollback transaction", e);
		}
	}
}
