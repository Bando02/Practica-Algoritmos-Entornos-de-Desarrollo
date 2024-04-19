package app;
import java.util.Arrays;
import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
	int[]numeros = new int[5];
	int[]resultadoFibonacci = new int[5];
	int[]resultadoFactorial = new int[5];
	boolean[]resultadoPrimo = new boolean[5];
	int a = 0;
	int b = 0;
	int fibo = 0;
	int facto = 0;
	
	
	for(int i = 0 ; i < 5 ; i++) {
	
		a = (int)Math.random();
		
		numeros[i] = a;		
	}
	for(int i = 0 ; i<5 ; i++) {
		
		
		b = numeros[i];
		
		fibo = Algoritmos.fibonacci(b);
		
		resultadoFibonacci[i] = fibo;
		
	}
	for(int i = 0 ; i<5 ; i++) {
		
		
		b = numeros[i];
		
		facto = Algoritmos.factorial(b);
		
		resultadoFactorial[i] = facto;
		
	}
	for(int i = 0 ; i<5 ; i++) {
				
		b = numeros[i];
		
		resultadoPrimo[i] = Algoritmos.esPrimo(b);
		
		 
		
	}

		
		
	}

}
