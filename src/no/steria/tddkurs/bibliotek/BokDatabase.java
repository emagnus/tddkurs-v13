package no.steria.tddkurs.bibliotek;

import java.util.List;

public interface BokDatabase {

	List<Bok> getAlleB�ker();
	boolean harBok(Bok bok);
}
