package app;

import java.util.Arrays;
import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		int[] resultadoFibonacci = new int[5];
		int[] resultadoFactorial = new int[5];
		boolean[] resultadoPrimo = new boolean[5];

		for (int i = 0; i < numeros.length; i++) {
			int a = (int) (Math.random()*10);
			numeros[i] = a;
		}
		
		for (int i = 0; i < 5; i++) {

			int b = numeros[i];

			int fibo = Algoritmos.fibonacci(b);

			resultadoFibonacci[i] = fibo;

		}
		for (int i = 0; i < numeros.length; i++) {

			int b = numeros[i];

			int facto = Algoritmos.factorial(b);

			resultadoFactorial[i] = facto;

		}
		for (int i = 0; i < numeros.length; i++) {

			int b = numeros[i];

			resultadoPrimo[i] = Algoritmos.esPrimo(b);

		}

	}

}
