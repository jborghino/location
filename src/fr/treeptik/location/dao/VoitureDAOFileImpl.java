package fr.treeptik.location.dao;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.treeptik.location.exception.DAOException;
import fr.treeptik.location.pojo.Voiture;

public class VoitureDAOFileImpl implements VoitureDAO {

	private Path path = FileSystems.getDefault().getPath("./save/voiture.sav");
	
	@Override
	public Voiture save(Voiture voiture) throws DAOException {
		
		BufferedWriter bufferedWriter;

		Random r = new Random();
		int noImmatriculation = r.nextInt(9999);

		String chaineVoiture = noImmatriculation + " " + voiture.getMarque()
				+ " " + voiture.getModel() + " " + voiture.getCouleur() + " "
				+ voiture.getCumulReparation() + " " + voiture.getDisponible()
				+ " " + voiture.getCodeType();

		try {
			bufferedWriter = Files.newBufferedWriter(path,
					Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			bufferedWriter.write(chaineVoiture);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			throw new DAOException("erreur save file voiture", e);
		}

		return voiture;
	}

	@Override
	public void update(Voiture voiture) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Voiture voiture) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Voiture findById(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findAll() throws DAOException {
		List<String> allLines;
		List<Voiture> voitures = new ArrayList<>();
		try {
			allLines = Files.readAllLines(path, Charset.forName("UTF-8"));
			for (String string : allLines) {
				
				String[] split = string.split(" ");
				Voiture voiture = new Voiture();
				voiture.setNoImmatriculation(Integer.parseInt(split[0]));
				voiture.setMarque(split[1]);
				voiture.setModel(split[2]);
				voiture.setCouleur(split[3]);
				voiture.setCumulReparation(Integer.parseInt(split[4]));
				voiture.setDisponible(Boolean.parseBoolean(split[5]));
				voiture.setCodeType(Integer.parseInt(split[6]));
				
				voitures.add(voiture);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return voitures;
		
	}

}
