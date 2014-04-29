package fr.treeptik.location.engine;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Client;
import fr.treeptik.location.pojo.Voiture;
import fr.treeptik.location.service.VoitureServiceImpl;

public class TestVoiture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Voiture voiture = new Voiture();
		voiture.setMarque("Mercedes");
		voiture.setModel("Benz");
		voiture.setCouleur("gris");
		voiture.setCumulReparation(29);
		voiture.setDisponible(true);
		voiture.setCodeType(1);

		try {

			// test save voiture
			VoitureServiceImpl impl = new VoitureServiceImpl();
			impl.save(voiture);

			// test findAll voiture
			List<Voiture> findAll = impl.findAll();

			for (Voiture v : findAll) {
				System.out.println(v.getNoImmatriculation() + " "
								+ v.getCouleur() + " " 
								+ v.getCumulReparation() + " "
								+ v.getDisponible() + " " 
								+ v.getMarque() + " "
								+ v.getModel() + " " 
								+ v.getCodeType() + " ");
			}

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
