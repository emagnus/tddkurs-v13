package no.steria.tddkurs.bibliotek;

import java.util.Arrays;
import java.util.List;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BibliotekAppTest {
	
	private static final Bok bokA = new Bok("A", "Per", 20);
	private static final Bok bokB = new Bok("B", "Peer", 20);
	private static final Bok bokBB = new Bok("Basdasd", "Peer", 20);
	private static final Bok bokC = new Bok("C", "Peeer", 20);
	private static final Bok bokD = new Bok("D", "Peeeer", 20);
	
	List<Bok> alleBøker = Arrays.asList(bokA, bokB, bokBB, bokC, bokD);

	BokDatabase db = Mockito.mock(BokDatabase.class);
	
	@Before
	public void setup() {
		Mockito.when(db.getAlleBøker()).thenReturn(alleBøker);
	}
	
	@Test
	public void skal_hente_alle_bøker() throws Exception {
		BibliotekApp app = new BibliotekApp(db);
		
		List<Bok> bøker = app.getAlleBøker();
		
		Assertions.assertThat(bøker).contains(bokA, bokB, bokC, bokD);
		
	}
	
	@Test
	public void skal_finne_bøker_som_begynner_med_b() throws Exception {
		BibliotekApp app = new BibliotekApp(db);
		
		List<Bok> bøker = app.getBøkerSomBegynnerMed("B");
		
		Assertions.assertThat(bøker).hasSize(2).containsExactly(bokB, bokBB);
	}
}
