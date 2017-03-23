package menjacnica;

import java.sql.Date;
import java.util.LinkedList;

import interfejsMenjacnice.InterfejsMenjacnice;

public class KursnaLista implements InterfejsMenjacnice {
	
	private LinkedList<Valuta> lista;
    
	@Override
	public void dodavanjeKursaZaDan(double prodajni, double kupovni, double srednji, Date datum) {
		

	}

	@Override
	public void brisanjeKursaZaDan(Date datum) {
		

	}

	@Override
	public Valuta pronadjiKursZaDan(Date datum) {
		
		return null;
	}

}
