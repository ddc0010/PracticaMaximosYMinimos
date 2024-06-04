package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Maximos;

class TestMaximos {

	@Test
	public void MaximoDe2Numeros() {
		int num1 = 4; 
		int num2 = 6;
		int maximoEsperado = 6;
		int maximoObtenido = Maximos.MaximoDe2EnterosPositivos(num1, num2);
	}
	
	@Test
	public void MaximoDe3Numeros() {
		int num1 = 1; 
		int num2 = 2; 
		int num3 = 3;
		int maximoEsperado = 3;
		int maximoObtenido = Maximos.MaximoDe3EnterosPositivos(num1,num2,num3);
	}

}
