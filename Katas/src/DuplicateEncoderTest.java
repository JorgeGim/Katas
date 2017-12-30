import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateEncoderTest {

	@Test
	public void sinRepetidosTest() {
		
		String ret = "(((";
		assertEquals(ret, DuplicateEncoder.encoder("din"));
	}
	
	@Test
	public void repetidosTest() {
		
		String ret = "()()()";
		assertEquals(ret, DuplicateEncoder.encoder("recede"));
	}
	
	@Test
	public void cadenaCaracteresTest() {
		
		String ret = "))(";
		assertEquals(ret, DuplicateEncoder.encoder("((@"));
	}
}
