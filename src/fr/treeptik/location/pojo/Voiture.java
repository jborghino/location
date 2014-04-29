package fr.treeptik.location.pojo;

import java.io.Serializable;

public class Voiture implements Serializable{

	private static final long serialVersionUID = 1L;

	private int noImmatriculation;
	private String marque;
	private String model;
	private String couleur;
	private int cumulReparation;
	private Boolean disponible;
	private int codeType;
	
	public Voiture(){}

	public Voiture(int noImmatriculation, String marque, String model,
			String couleur, int cumulReparation, Boolean disponible,
			int codeType) {
		super();
		this.noImmatriculation = noImmatriculation;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.cumulReparation = cumulReparation;
		this.disponible = disponible;
		this.codeType = codeType;
	}

	public int getNoImmatriculation() {
		return noImmatriculation;
	}

	public void setNoImmatriculation(int noImmatriculation) {
		this.noImmatriculation = noImmatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getCumulReparation() {
		return cumulReparation;
	}

	public void setCumulReparation(int cumulReparation) {
		this.cumulReparation = cumulReparation;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public int getCodeType() {
		return codeType;
	}

	public void setCodeType(int codeType) {
		this.codeType = codeType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noImmatriculation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (noImmatriculation != other.noImmatriculation)
			return false;
		return true;
	}
	
	
	
}
