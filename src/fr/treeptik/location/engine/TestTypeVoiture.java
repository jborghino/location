package fr.treeptik.location.engine;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.TypeVoiture;
import fr.treeptik.location.service.TypeVoitureServiceImpl;

public class TestTypeVoiture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TypeVoiture typeVoiture = new TypeVoiture();
		
		typeVoiture.setDescriptionType("Berline");
		typeVoiture.setPlaces(4);
		typeVoiture.setPrixJour(50);
		
		try {
			// test save contrat
			TypeVoitureServiceImpl impl = new TypeVoitureServiceImpl();
			impl.save(typeVoiture);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
	}

}
