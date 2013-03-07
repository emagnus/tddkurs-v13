package no.steria.tddkurs.bibliotek;

import java.util.List;

public interface BokDatabase {

	List<Bok> getAlleBøker();
	boolean harBok(Bok bok);
}
