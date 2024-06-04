package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Minimos;

class TestMinimos {

	@Test
	public void MinimoDe2Numeros() {
		int num1 = 10; 
		int num2 = 4;
		int minimoEsperado = 4;
		int minimoObtenido = Minimos.MinimoDe2EnterosPositivos(num1, num2);
	}
	
	@Test
	public void MinimoDe3Numeros() {
		int num1 = 9; 
		int num2 = 3; 
		int num3 = 7;
		int minimoEsperado = 3;
		int minimoObtenido = Minimos.Minimode3EnterosPositivos(num1,num2,num3);
	}

}
