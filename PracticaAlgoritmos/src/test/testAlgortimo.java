package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class testAlgortimo {

	@Test
	public void testPrimo() {
		
		boolean esperado;
		boolean obtenido;
		for(int i = 0 ; i < 101 ; i++) {
			if(Algoritmos.esPrimo(i) == true) {
				esperadno = true;
				obtenido = Algoritmos.esPrimo(i);
				assertEquals(esperando,obtenido);
			}
			else {
				
			}
		}
		
		for(int i = 0 ; i < 101 ; i++) {
			
			if(Algoritmos.factorial(i))
		}
	}

	@Test
	public void testFibonacci() {
		int numero = 5;

		int resultado = Algoritmos.fibonacci(numero);

		assertEquals(5, resultado);
	}

	public void testFactorial() {
        
        int numero = 3; 

        int resultado = Algoritmos.factorial(numero);

        assertEquals(6, resultado); 
	

}
