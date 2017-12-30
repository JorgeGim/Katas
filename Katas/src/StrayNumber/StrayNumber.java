package StrayNumber;

public class StrayNumber {
	
	public static int stray(int[] lista) {
		
		int distinto = 0;
		
		for(int i=0; i<lista.length; i++) {
			if(esElDistinto(lista[i], lista)) {
				distinto = lista[i];
			}
		}
		
		return distinto;
	}

	private static boolean esElDistinto(int num, int[] lista) {
		
		int cont = 0;	
		for(int i=0; i<lista.length; i++) {
			
			if(num != lista[i]) {
				cont ++;
			}
		}
		
		return cont > 1;
	}
}
