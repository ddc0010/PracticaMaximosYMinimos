package Clases;

public class Minimos {
	
	/**
	 * Metodo que devuelve el valor minimo de dos numeros enteros positivos
	 * 
	 * @param num1 Primer numero entero
	 * @param num2 Segundo numero entero 
	 * @return El valor minimo de los dos numeros 
	 * @throws IllegalArgumentException Si alguno de los valores pasados por parámetro es menor que cero
	 */
	public static int MinimoDe2EnterosPositivos(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("Los numeros deben ser mayores o iguales que cero");
		}
		int min = num1; 
		if (num2 < min) {
			min = num2; 
		}
		return min;
	}
	
	/**
	 * Metodo que devuelve el valor minimo de tres numeros enteros positivos
	 * 
	 * @param num1 Primer numero entero
	 * @param num2 Segundo numero entero 
	 * @param num3 Tercer numero entero 
	 * @return El valor minimo de los tres numeros 
	 * @throws IllegalArgumentException Si alguno de los valores pasados por parámetro es menor que cero
	 */
	public static int Minimode3EnterosPositivos(int num1, int num2, int num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0 ) {
			throw new IllegalArgumentException("Los numeros deben ser mayores o iguales que cero");
		}
		int min = num1; 
		if(num2 < min) {
			min = num2;
		}
		if(num3 < min) {
			min = num3;
		}
		return min;
	}

}
