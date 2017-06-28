package ClaveSecretaCajero;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaveTest {

	@Test
	public void claveValidaTest() //happy path 
	{
		Clave clave = new Clave("24356");
		assertTrue(clave.esValida());
	}
	
	@Test
	public void claveInvalidaLenghtTest()
	{
		Clave clave = new Clave("234");
		assertFalse(clave.esValida());
	}
	
	@Test
	public void claveInvalidaSumaParTest()
	{
		Clave clave = new Clave("34474");
		assertFalse(clave.esValida());
	}
}
