package fr.treeptik.location.pojo;

import java.io.Serializable;

public class Prevoir implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int noContrat;
	private int codeSuplement;
	
	public Prevoir(){}

	public Prevoir(int noContrat, int codeSuplement) {
		super();
		this.noContrat = noContrat;
		this.codeSuplement = codeSuplement;
	}

	public int getNoContrat() {
		return noContrat;
	}

	public void setNoContrat(int noContrat) {
		this.noContrat = noContrat;
	}

	public int getCodeSuplement() {
		return codeSuplement;
	}

	public void setCodeSuplement(int codeSuplement) {
		this.codeSuplement = codeSuplement;
	}
	
	
}
