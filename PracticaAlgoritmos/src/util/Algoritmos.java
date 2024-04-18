package util;

public abstract class Algoritmos {
	
	
	
	/**
	 * Metodo utilizado para obtener el numero fibonacci 
	 * 
	 * @param numero
	 * @return
	 */
	public static int fibonacci(int numero) {
		if(numero == 0) {
			return 0;
		}else if(numero == 1) {
			return 1;
		}else {
			return fibonacci(numero-1) + fibonacci(numero-2);
		}	
	}
	
	public static int factorial(int numero) {
		
		if(numero == 0 || numero == 1) {
			return 1;
		}else {
			int factorial = 1;
			for(int i = 2 ; i <= numero ; i++) {
				factorial = factorial*1;
			}
			return factorial;
		}
		
	}
	
	public static boolean esPrimo(int numero) {
		if (numero <= 1){
			return false;
		}for(int i=2;i<numero;i++) {
	        if(numero%i==0)
	            return false;
	    }
	    return true;	
	}
	
	

}
