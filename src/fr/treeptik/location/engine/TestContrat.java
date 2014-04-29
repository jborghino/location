package fr.treeptik.location.engine;

import java.sql.Date;
import java.util.List;

import fr.treeptik.location.exception.ServiceException;
import fr.treeptik.location.pojo.Contrat;
import fr.treeptik.location.service.ContratServiceImpl;

public class TestContrat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contrat contrat = new Contrat();

		Date dateContrat = null;
		Date dateEnlevement = null;
		Date dateRetour = null;
		
		dateContrat = Date.valueOf("2010-04-18");
		dateEnlevement = Date.valueOf("2011-12-11");
		dateRetour = Date.valueOf("2012-09-28");
		
		contrat.setDateContrat(dateContrat);
		contrat.setDateEnlevement(dateEnlevement);
		contrat.setDateRetour(dateRetour);
		contrat.setCodecl(3);
		contrat.setNoImmatriculation(2);
		
		try {
			// test save contrat
			ContratServiceImpl impl = new ContratServiceImpl();
//			impl.save(contrat);

			// test findAll client
			List<Contrat> list = impl.findAll();
			for (Contrat c : list) {
				System.out.println(c.getNoImmatriculation() + " "
						+ c.getDateContrat() + " "
						+ c.getDateEnlevement() + " "
						+ c.getDateRetour() + " "
						+ c.getCodecl() + " "
						+ c.getNoImmatriculation() + " ");
			}

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
