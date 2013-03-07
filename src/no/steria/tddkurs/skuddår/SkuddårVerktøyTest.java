package no.steria.tddkurs.skudd�r;

import static org.junit.Assert.*;

import org.junit.Test;

public class Skudd�rVerkt�yTest {
	
	Skudd�rVerkt�y verkt�y = new Skudd�rVerkt�y();
	
	@Test
	public void skal_si_at_�r_4_er_skuddd�r() throws Exception {
		boolean erSkudd�r = verkt�y.erSkudd�r(4);
		
		assertTrue(erSkudd�r);
	}
	
	@Test
	public void skal_si_at_�r_3_ikke_er_skuddd�r() throws Exception {
		boolean erSkudd�r = verkt�y.erSkudd�r(3);
		
		assertFalse(erSkudd�r);
	}
	
	@Test
	public void skal_si_at_�r_100_ikke_er_skudd�r() throws Exception {
		boolean erSkudd�r = verkt�y.erSkudd�r(100);
		
		assertFalse(erSkudd�r);
	}
	
	@Test
	public void skal_si_at_�r_400_er_skudd�r() throws Exception {
		boolean erSkudd�r = verkt�y.erSkudd�r(400);
		
		assertTrue(erSkudd�r);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void skal_kaste_exception_hvis_�r_er_negativt() throws Exception {
		verkt�y.erSkudd�r(-1);
	}
}
