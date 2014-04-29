package fr.treeptik.location.engine;

import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Client;
import fr.treeptik.location.service.ClientServiceImpl;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		client.setNomcl("Toto");
		client.setAdrese("Avenue du prado");
		client.setVille("Marseille");

		try {
			// test save client
			ClientServiceImpl impl = new ClientServiceImpl();
			//impl.save(client);

			// test findAll client
			List<Client> list = impl.findAll();
			for (Client c : list) {
				System.out.println(c.getNomcl());
			}

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
