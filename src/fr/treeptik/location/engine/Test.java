package fr.treeptik.location.engine;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Client;
import fr.treeptik.location.pojo.Voiture;
import fr.treeptik.location.service.ClientServiceImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		client.setNomcl("Toto");
		client.setAdrese("Avenue du prado");
		client.setVille("Marseille");
		
		Voiture voiture = new Voiture();
		voiture.setMarque("Mercedes");
		voiture.setModel("Benz");
		voiture.setCouleur("gris");
		voiture.setCumulReparation(29);
		voiture.setDisponible(true);
		voiture.setCodeType(1);
		
		
		try {
			//test save client
//			ClientServiceImpl impl = new ClientServiceImpl();
//			impl.save(client);
			
			//test save voiture
//			VoitureServiceImpl impl = new VoitureServiceImpl();
//          impl.save(voiture);
			
			//test findAll voiture
//			List<Voiture> findAll = impl.findAll();
//			
//			for(Voiture v : findAll){
//				System.out.println(v.getNoImmatriculation() + " "
//						+ v.getCouleur() + " "
//						+ v.getCumulReparation() + " "
//						+ v.getDisponible() + " "
//						+ v.getMarque() + " "
//						+ v.getModel() + " "
//						+ v.getCodeType() + " ");
//			}
			
			// test findAll client
			ClientServiceImpl impl = new ClientServiceImpl();
			List<Client> list = impl.findAll();
			for(Client c : list){
				System.out.println(c.getCodecl() + " "
						+ c.getNomcl() + " "
						+ c.getAdrese() + " "
						+ c.getVille());
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
