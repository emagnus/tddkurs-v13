package no.steria.tddkurs.bibliotek;

import java.util.ArrayList;
import java.util.List;

public class BibliotekApp {

	private final BokDatabase db;

	public BibliotekApp(BokDatabase db) {
		this.db = db;
	}
	
	public List<Bok> getAlleBøker() {
		return db.getAlleBøker();
	}

	public List<Bok> getBøkerSomBegynnerMed(String begynnerMed) {
		List<Bok> alleBøker = db.getAlleBøker();
		List<Bok> resultat = new ArrayList<>();
		for (Bok bok : alleBøker) {
			if(bok.getTittel().startsWith(begynnerMed)) {
				resultat.add(bok);
			}
		}
		return resultat;
	}

}
