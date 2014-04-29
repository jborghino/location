package fr.treeptik.location.pojo;

import java.io.Serializable;

public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int codecl;
	private String nomcl;
	private String adrese;
	private String ville;
	
	public Client(){}
	
	public Client(int codecl, String nomcl, String adrese, String ville) {
		super();
		this.codecl = codecl;
		this.nomcl = nomcl;
		this.adrese = adrese;
		this.ville = ville;
	}
	
	public int getCodecl() {
		return codecl;
	}
	public void setCodecl(int codecl) {
		this.codecl = codecl;
	}
	public String getNomcl() {
		return nomcl;
	}
	public void setNomcl(String nomcl) {
		this.nomcl = nomcl;
	}
	public String getAdrese() {
		return adrese;
	}
	public void setAdrese(String adrese) {
		this.adrese = adrese;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
