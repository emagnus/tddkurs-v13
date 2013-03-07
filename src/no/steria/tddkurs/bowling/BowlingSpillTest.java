package no.steria.tddkurs.bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingSpillTest {

	@Test
	public void skal_gi_totalt_0_poeng_for_bare_bomkast() throws Exception {
		BowlingSpill spill = new BowlingSpill();
		
		for (int i = 0; i < 10; i++) {
			spill.spillRunde(0, 0);
		}
		
		assertEquals(0, spill.getPoengsum());
	}
}
