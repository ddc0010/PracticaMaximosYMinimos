package Clases;

public class Maximos {
	
	/**
	 * Metodo que devuelve el valor maximo de dos numeros enteros positivos
	 * 
	 * @param num1 Primer numero entero
	 * @param num2 Segundo numero entero 
	 * @return El valor maximo de los dos numeros 
	 * @throws IllegalArgumentException Si alguno de los valores pasados por parámetro es menor que cero
	 */
	
	public static int MaximoDe2EnterosPositivos(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Los numeros deben ser mayores o iguales que cero");
		}
		
		int max = num1;
		if (num2 > max) {
			max = num2; 
		}
		return max;
	}
	
	/**
	 * Metodo que devuelve el valor maximo de tres numeros enteros positivos
	 * 
	 * @param num1 Primer numero entero
	 * @param num2 Segundo numero entero 
	 * @param num3 Tercer numero entero
	 * @return El valor maximo de los dos numeros 
	 * @throws IllegalArgumentException Si alguno de los valores pasados por parámetro es menor que cero
	 */
	public static int MaximoDe3EnterosPositivos(int num1, int num2, int num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			throw new IllegalArgumentException("Los numeros deben ser mayores o iguales que cero");
		}
		int max = num1; 
		if (num2 > max) {
			max = num2; 
		}
		if (num3 > max) {
			max = num3;
		}
		return max;
		
	}

}
