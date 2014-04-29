package fr.treeptik.location.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Reparations implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numRep;
	private Date dateRep;
	private String descriptionPanne;
	private int montantRepa;
	private int noImmatriculation;
	
	public Reparations(){}

	public Reparations(int numRep, Date dateRep, String descriptionPanne,
			int montantRepa, int noImmatriculation) {
		super();
		this.numRep = numRep;
		this.dateRep = dateRep;
		this.descriptionPanne = descriptionPanne;
		this.montantRepa = montantRepa;
		this.noImmatriculation = noImmatriculation;
	}

	public int getNumRep() {
		return numRep;
	}

	public void setNumRep(int numRep) {
		this.numRep = numRep;
	}

	public Date getDateRep() {
		return dateRep;
	}

	public void setDateRep(Date dateRep) {
		this.dateRep = dateRep;
	}

	public String getDescriptionPanne() {
		return descriptionPanne;
	}

	public void setDescriptionPanne(String descriptionPanne) {
		this.descriptionPanne = descriptionPanne;
	}

	public int getMontantRepa() {
		return montantRepa;
	}

	public void setMontantRepa(int montantRepa) {
		this.montantRepa = montantRepa;
	}

	public int getNoImmatriculation() {
		return noImmatriculation;
	}

	public void setNoImmatriculation(int noImmatriculation) {
		this.noImmatriculation = noImmatriculation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
