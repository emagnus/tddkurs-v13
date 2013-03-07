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
	
	List<Bok> alleB�ker = Arrays.asList(bokA, bokB, bokBB, bokC, bokD);

	BokDatabase db = Mockito.mock(BokDatabase.class);
	
	@Before
	public void setup() {
		Mockito.when(db.getAlleB�ker()).thenReturn(alleB�ker);
	}
	
	@Test
	public void skal_hente_alle_b�ker() throws Exception {
		BibliotekApp app = new BibliotekApp(db);
		
		List<Bok> b�ker = app.getAlleB�ker();
		
		Assertions.assertThat(b�ker).contains(bokA, bokB, bokC, bokD);
		
	}
	
	@Test
	public void skal_finne_b�ker_som_begynner_med_b() throws Exception {
		BibliotekApp app = new BibliotekApp(db);
		
		List<Bok> b�ker = app.getB�kerSomBegynnerMed("B");
		
		Assertions.assertThat(b�ker).hasSize(2).containsExactly(bokB, bokBB);
	}
}
