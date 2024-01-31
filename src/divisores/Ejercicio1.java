package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner lectura;

	public static void main(String[] args) {
		int numeroUsuario;
		long numDivisores;
		lectura = new Scanner(System.in);
		
		numeroUsuario = lectura.nextInt();
		numDivisores = primeDivisors(numeroUsuario);
		
		System.out.println("Número de divisores: " + numDivisores);
		lectura.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			boolean esDivisor = number%i==0;
			if(esDivisor && esPrimo(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		for(int i=2; i<numero; i++) {
			if(numero%i == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
