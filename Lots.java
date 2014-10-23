package com.fontOrme.bean;

public class Lots {
	private long lot_id = 0;
	private int lot_numero = 0;
	private double lot_surface = 0;
	private double lot_tantieme = 0;
	private String lot_libelle = "";
	private Proprios proprio = null;
	
	public Lots(){
		
	}
	
	public Lots(long id, int numero, double surface, double tantieme, String libelle, Proprios proprio){
		this.lot_id = id;
		this.lot_numero = numero;
		this.lot_surface = surface;
		this.lot_tantieme = tantieme;
		this.lot_libelle = libelle;
		this.setProprio(proprio);
	}

	public long getLot_id() {
		return lot_id;
	}

	public void setLot_id(long lot_id) {
		this.lot_id = lot_id;
	}

	public int getLot_numero() {
		return lot_numero;
	}

	public void setLot_numero(int lot_numero) {
		this.lot_numero = lot_numero;
	}

	public double getLot_surface() {
		return lot_surface;
	}

	public void setLot_surface(double lot_surface) {
		this.lot_surface = lot_surface;
	}

	public double getLot_tantieme() {
		return lot_tantieme;
	}

	public void setLot_tantieme(double lot_tantieme) {
		this.lot_tantieme = lot_tantieme;
	}

	public String getLot_libelle() {
		return lot_libelle;
	}

	public void setLot_libelle(String lot_libelle) {
		this.lot_libelle = lot_libelle;
	}

	public Proprios getProprio() {
		return proprio;
	}

	public void setProprio(Proprios proprio) {
		this.proprio = proprio;
	}

	@Override
	public String toString() {
		return "Lots [lot_numero=" + lot_numero + ", lot_surface="
				+ lot_surface + ", lot_tantieme=" + lot_tantieme
				+ ", lot_libelle=" + lot_libelle
				+ ", propriétaire=" + proprio + "]";
	}
	
	

}
