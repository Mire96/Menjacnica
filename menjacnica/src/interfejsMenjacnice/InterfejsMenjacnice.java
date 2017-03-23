package interfejsMenjacnice;
import java.sql.Date;

import menjacnica.Valuta;

public interface InterfejsMenjacnice {
	
	public void dodavanjeKursaZaDan(String naziv, String skraceni, Date datum, double prodajni, double kupovni, double srednji);
	public void brisanjeKursaZaDan(String naziv, Date datum);
	public Valuta pronadjiKursZaDan(String naziv, Date datum);
}
