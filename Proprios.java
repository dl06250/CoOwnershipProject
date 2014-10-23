package com.fontOrme.bean;

public class Proprios {
	private long id;
	private String nom="";
	private String prenom="";
	
	public Proprios(){};
	
	public Proprios(long id, String nom, String prenom){
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Proprios [id="+id+", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
}
