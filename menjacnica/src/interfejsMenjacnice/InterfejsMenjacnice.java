package interfejsMenjacnice;
import java.sql.Date;

import menjacnica.Valuta;

public interface InterfejsMenjacnice {
	
	public void dodavanjeKursaZaDan(double prodajni, double kupovni, double srednji, Date datum);
	public void brisanjeKursaZaDan(Date datum);
	public Valuta pronadjiKursZaDan(Date datum);
}
