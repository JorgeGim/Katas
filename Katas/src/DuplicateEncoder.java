
public class DuplicateEncoder {
	
	public static String encoder(String palabra) {
		
		String ret = "";
		for(int i=0; i<palabra.length(); i++) {
			if(cantApariciones(palabra.charAt(i), palabra) == 1) {
				char caracter = palabra.charAt(i);
				caracter = '(';
				ret = ret + caracter;
			}else if(cantApariciones(palabra.charAt(i), palabra) > 1) {
				char caracter = palabra.charAt(i);
				caracter = ')';
				ret = ret + caracter;
			}
		}
		
		return ret;
	}

	private static int cantApariciones(char caracter, String palabra) {
		
		int cont = 0;
		
		for(int i=0; i<palabra.length(); i++) {
			if(palabra.charAt(i) == caracter) {
				cont++;
			}
		}
		
		return cont;
	}
}
