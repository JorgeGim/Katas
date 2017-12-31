package FilterArray;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class FilterTest {
	
	LinkedList<Integer> lista = new LinkedList<Integer>();
	
	@Before
	public void inicializarLista() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
	}

	@Test
	public void oddTest() {
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		ret.add(1);
		ret.add(3);
		ret.add(5);
		
		assertEquals(ret, Filter.odd(lista));
	}
	
	@Test
	public void evenTest() {
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		ret.add(2);
		ret.add(4);
		
		assertEquals(ret, Filter.even(lista));
	}
	
	@Test
	public void underTest() {
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		ret.add(1);
		ret.add(2);
		ret.add(3);
		
		assertEquals(ret, Filter.under(lista, 4));
	}
	
	@Test
	public void overTest() {
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		ret.add(5);
		
		assertEquals(ret, Filter.over(lista, 4));
	}
}
