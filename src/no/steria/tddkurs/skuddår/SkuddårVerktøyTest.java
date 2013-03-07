package no.steria.tddkurs.skuddår;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkuddårVerktøyTest {
	
	SkuddårVerktøy verktøy = new SkuddårVerktøy();
	
	@Test
	public void skal_si_at_år_4_er_skudddår() throws Exception {
		boolean erSkuddår = verktøy.erSkuddår(4);
		
		assertTrue(erSkuddår);
	}
	
	@Test
	public void skal_si_at_år_3_ikke_er_skudddår() throws Exception {
		boolean erSkuddår = verktøy.erSkuddår(3);
		
		assertFalse(erSkuddår);
	}
	
	@Test
	public void skal_si_at_år_100_ikke_er_skuddår() throws Exception {
		boolean erSkuddår = verktøy.erSkuddår(100);
		
		assertFalse(erSkuddår);
	}
	
	@Test
	public void skal_si_at_år_400_er_skuddår() throws Exception {
		boolean erSkuddår = verktøy.erSkuddår(400);
		
		assertTrue(erSkuddår);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void skal_kaste_exception_hvis_år_er_negativt() throws Exception {
		verktøy.erSkuddår(-1);
	}
}
