package fr.treeptik.location.pojo;

import java.io.Serializable;

public class TypeVoiture implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codeType;
	private String descriptionType;
	private int places;
	private int prixJour;
	
	public TypeVoiture(){}

	public TypeVoiture(int codeType, String descriptionType, int places,
			int prixJour) {
		super();
		this.codeType = codeType;
		this.descriptionType = descriptionType;
		this.places = places;
		this.prixJour = prixJour;
	}

	public int getCodeType() {
		return codeType;
	}

	public void setCodeType(int codeType) {
		this.codeType = codeType;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public int getPrixJour() {
		return prixJour;
	}

	public void setPrixJour(int prixJour) {
		this.prixJour = prixJour;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
