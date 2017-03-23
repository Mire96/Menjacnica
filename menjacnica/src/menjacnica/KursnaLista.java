package menjacnica;

import java.sql.Date;
import java.util.LinkedList;

import interfejsMenjacnice.InterfejsMenjacnice;

public class KursnaLista implements InterfejsMenjacnice {
	
	private LinkedList<Valuta> lista;
	
	@Override
	public void dodavanjeKursaZaDan(String naziv, String skraceni, Date datum, double prodajni, double kupovni,
			double srednji) {
		Valuta nova = new Valuta(naziv, skraceni, datum, prodajni, kupovni, srednji);
		lista.add(nova);

	}

	@Override
	public void brisanjeKursaZaDan(String naziv, Date datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKursZaDan(String naziv, Date datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
