package menjacnica;

import java.sql.Date;
import java.util.LinkedList;

import interfejsMenjacnice.InterfejsMenjacnice;

public class KursnaLista implements InterfejsMenjacnice {
	
	private LinkedList<Valuta> lista;
	
	@Override
	public void dodavanjeKursaZaDan(String naziv, String skraceni, Date datum, double prodajni, double kupovni,
			double srednji) {
		lista.add(new Valuta(naziv, skraceni, datum, prodajni, kupovni, srednji));

	}

	@Override
	public void brisanjeKursaZaDan(String naziv, Date datum) {
		for (int i = 0; i < lista.size(); i++) {
			if( (lista.get(i).getNaziv() == naziv) && lista.get(i).getDatum().equals(datum)){
				lista.remove(i);
				return;
			}
		}

	}

	@Override
	public Valuta pronadjiKursZaDan(String naziv, Date datum) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNaziv() == naziv && lista.get(i).getDatum().equals(datum))
				return lista.get(i);
		}
		System.out.println("Trazena valuta za taj datum ne postoji.");
		return null;
	}

}
