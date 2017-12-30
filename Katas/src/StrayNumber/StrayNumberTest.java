package StrayNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrayNumberTest {

	@Test
	public void strayNumberTest() {
		
		int distinto = 2;
		int[] lista = new int[] {1,1,1,2,1};
		assertEquals(distinto, StrayNumber.stray(lista));
	}
	
	@Test
	public void strayNumberBordeTest() {
		
		int distinto = 1;
		int[] lista = new int[]{1,2,2,2};
		assertEquals(distinto, StrayNumber.stray(lista));
	}
	
	@Test
	public void strayNumberBorde2Test() {
		
		int distinto = 17;
		int[] lista = new int[]{3,3,3,17};
		assertEquals(distinto, StrayNumber.stray(lista));
	
	}

}
