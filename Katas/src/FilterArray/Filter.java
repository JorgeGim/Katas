package FilterArray;

import java.util.LinkedList;

public class Filter {

	
	public Filter() {
		
	}
	
	public static LinkedList<Integer> even (LinkedList<Integer> lista){
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		
		for(Integer n: lista) {
			if(n%2 == 0) {
				ret.add(n);
			}
		}
		
		return ret;
	}
	
	public static LinkedList<Integer> odd (LinkedList<Integer> lista){
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		
		for(Integer n: lista) {
			if(n%2 != 0) {
				ret.add(n);
			}
		}
		
		return ret;
	}
	
	public static LinkedList<Integer> under (LinkedList<Integer> lista, int tope){
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		
		for(int i=0; i<tope-1; i++) {
			
			ret.add(lista.get(i));
		}
		
		return ret;
	}
	
	public static LinkedList<Integer> over (LinkedList<Integer> lista, int desde){
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		
		for(int i=desde; i<lista.size(); i++) {
			
			ret.add(lista.get(i));
		}
		
		return ret;
	}
}
