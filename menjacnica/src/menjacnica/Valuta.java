package menjacnica;

import java.sql.Date;

public class Valuta {
	private String naziv;
	private String skraceni;
	private Date datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceni() {
		return skraceni;
	}
	public void setSkraceni(String skraceni) {
		this.skraceni = skraceni;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
}
