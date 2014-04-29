package fr.treeptik.location.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Contrat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int noContrat;
	private Date dateContrat;
	private Date dateEnlevement;
	private Date dateRetour;
	private int codecl;
	private int noImmatriculation;
	
	public Contrat(){}
	
	public Contrat(int noContrat, Date dateContrat, Date dateEnlevement,
			Date dateRetour, int codecl, int noImmatriculation) {
		super();
		this.noContrat = noContrat;
		this.dateContrat = dateContrat;
		this.dateEnlevement = dateEnlevement;
		this.dateRetour = dateRetour;
		this.codecl = codecl;
		this.noImmatriculation = noImmatriculation;
	}

	public int getNoContrat() {
		return noContrat;
	}

	public void setNoContrat(int noContrat) {
		this.noContrat = noContrat;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public Date getDateEnlevement() {
		return dateEnlevement;
	}

	public void setDateEnlevement(Date dateEnlevement) {
		this.dateEnlevement = dateEnlevement;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public int getCodecl() {
		return codecl;
	}

	public void setCodecl(int codecl) {
		this.codecl = codecl;
	}

	public int getNoImmatriculation() {
		return noImmatriculation;
	}

	public void setNoImmatriculation(int noImmatriculation) {
		this.noImmatriculation = noImmatriculation;
	}
	
	
	
}
