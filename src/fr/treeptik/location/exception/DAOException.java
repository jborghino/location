package fr.treeptik.location.exception;


public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public DAOException(String message, Throwable error){
		super(message, error);
		
	}
	
}
