package fr.treeptik.location.pojo;

import java.io.Serializable;

public class Suplements implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codeSuplement;
	private String libelleSupp;
	private int tarifJour;
	
	public Suplements(){}

	public Suplements(int codeSuplement, String libelleSupp, int tarifJour) {
		super();
		this.codeSuplement = codeSuplement;
		this.libelleSupp = libelleSupp;
		this.tarifJour = tarifJour;
	}

	public int getCodeSuplement() {
		return codeSuplement;
	}

	public void setCodeSuplement(int codeSuplement) {
		this.codeSuplement = codeSuplement;
	}

	public String getLibelleSupp() {
		return libelleSupp;
	}

	public void setLibelleSupp(String libelleSupp) {
		this.libelleSupp = libelleSupp;
	}

	public int getTarifJour() {
		return tarifJour;
	}

	public void setTarifJour(int tarifJour) {
		this.tarifJour = tarifJour;
	}
	
	
}
