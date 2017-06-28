package JuegoDisparejo;

import java.util.Random;

public class JuegoDisparejo {
	
	public static void jugar()
	{
		Random ran = new Random();
		
		int j1 = ran.nextInt(3);
		int j2 = ran.nextInt(3);
		int j3 = ran.nextInt(3);
		
		if(j1 == j2 && j2 == j3)
		{
			System.out.println("No hubo ganador, las tres monedas son iguales ");
			System.out.println("Monedas: "+j1+","+j2+","+j3);
		}
			
		if(j1 != j2 && j2 == j3)
		{
			System.out.println("Ha ganado el jugador 1 ");
			System.out.println("Monedas: "+j1+","+j2+","+j3);
		}
			
		if(j2 != j1 && j1 == j3)
		{
			System.out.println("Ha ganado el jugador 2 ");
			System.out.println("Monedas: "+j1+","+j2+","+j3);
		}
			
		if(j3 != j1 && j1 == j2)
		{
			System.out.println("Ha ganado el jugador 3 ");
			System.out.println("Monedas: "+j1+","+j2+","+j3);
		}
		
		if(j1 != j2 && j2 != j3 && j1 != j3)
		{
			System.out.println("No hubo ganador, las tres monedas son diferentes ");
			System.out.println("Monedas: "+j1+","+j2+","+j3);
		}
		
	}
}
