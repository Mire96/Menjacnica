package menjacnica;

import java.sql.Date;

public class Valuta {
	private String naziv;
	private String skraceni;
	private Date datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	
	public Valuta(String naziv, String skraceni, Date datum, double prodajni, double kupovni, double srednji) {
		super();
		this.naziv = naziv;
		this.skraceni = skraceni;
		this.datum = datum;
		this.prodajni = prodajni;
		this.kupovni = kupovni;
		this.srednji = srednji;
	}
	
	
	@Override
	public String toString() {
		return "Valuta " + naziv + ", skraceni naziv " + skraceni + ", na datum" + datum + " ima prodajni kurs: " + prodajni
				+ ", kupovni kurs: " + kupovni + "i srednji kurs: " + srednji;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceni == null) ? 0 : skraceni.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (skraceni == null) {
			if (other.skraceni != null)
				return false;
		} else if (!skraceni.equals(other.skraceni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new RuntimeException("Naziv je null");
		}
		this.naziv = naziv;
	}
	public String getSkraceni() {
		return skraceni;
	}
	public void setSkraceni(String skraceni) {
		if (skraceni == null) {
			throw new RuntimeException("Skraceni naziv je null");
		}
		this.skraceni = skraceni;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		if (datum == null) {
			throw new RuntimeException("Datum je null");
		}
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni == 0) {
			throw new RuntimeException("Uneseni prodajni kurs je 0");
		}
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni == 0) {
			throw new RuntimeException("Uneseni kupovni kurs je 0");
		}
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji == 0) {
			throw new RuntimeException("Uneseni srednji kurs je 0");
		}
		this.srednji = srednji;
	}
	
	
}
