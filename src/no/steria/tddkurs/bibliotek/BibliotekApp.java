package no.steria.tddkurs.bibliotek;

import java.util.ArrayList;
import java.util.List;

public class BibliotekApp {

	private final BokDatabase db;

	public BibliotekApp(BokDatabase db) {
		this.db = db;
	}
	
	public List<Bok> getAlleB�ker() {
		return db.getAlleB�ker();
	}

	public List<Bok> getB�kerSomBegynnerMed(String begynnerMed) {
		List<Bok> alleB�ker = db.getAlleB�ker();
		List<Bok> resultat = new ArrayList<>();
		for (Bok bok : alleB�ker) {
			if(bok.getTittel().startsWith(begynnerMed)) {
				resultat.add(bok);
			}
		}
		return resultat;
	}

}
