package RomanNumerals;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class NumeroRomanoTest 
{
	
	private static NumeroRomano romano;
	
	@BeforeClass
	public static void setUp()
	{
		romano = new NumeroRomano();
	}
	
	@Test
	public void nroDiezTest()
	{
		assertEquals("X",romano.convertir(10));
	}
	
	@Test
	public void nroVeinteTest()
	{
		assertEquals("XX",romano.convertir(20));
	}
	
	@Test
	public void nroNueveTest()
	{
		assertEquals("IX",romano.convertir(9));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nroCeroTest()
	{
		romano.convertir(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nroFueraRangoTest()
	{
		romano.convertir(5000);
	}
	
	

}
