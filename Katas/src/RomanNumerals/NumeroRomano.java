package RomanNumerals;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class NumeroRomano 
{
	
	private Map<Integer, String> diccionario;
	
	public NumeroRomano()
	{
		diccionario = new TreeMap<Integer, String> (Collections.reverseOrder());
		diccionario.put(1, "I");
		diccionario.put(4, "IV");
		diccionario.put(5, "V");
		diccionario.put(9, "IX");
		diccionario.put(10, "X");
		diccionario.put(40, "XL");
		diccionario.put(50, "L");
		diccionario.put(90, "XC");
		diccionario.put(100, "C");
		diccionario.put(400, "CD");
		diccionario.put(500, "D");
		diccionario.put(900, "CM");
		diccionario.put(1000, "M");
	}
	
	public String convertir(int num)
	{
		
		if(num <= 0 || num > 4000)
			throw new IllegalArgumentException("Se intento convertir un número inválido " + num);
		
		StringBuilder ret = new StringBuilder();
		
		for(Integer key : diccionario.keySet())
		{
			while(num >= key)
			{
				num -= key;
				ret.append(diccionario.get(key));
			}
		}
		return ret.toString();
	}
}
