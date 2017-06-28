package ClaveSecretaCajero;

public class Clave 
{
	private String _clave;
	
	public Clave(String clave)
	{	
		_clave = clave;
	}
	
	public boolean esValida()
	{
		return _clave.length() >= 4 && sumaPosicionesPar();
	}

	private boolean sumaPosicionesPar() 
	{
		int pos3 = Integer.parseInt(String.valueOf(_clave.charAt(2)));
		int pos4 = Integer.parseInt(String.valueOf(_clave.charAt(3)));
		
		return esPar(pos3 + pos4);
	}

	private boolean esPar(int n)
	{
		return n%2 == 0;
	}
}
