package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio3_Recursividad {
	
	private static int numeroInvertido(int numero, int resultado) {
		
		if (numero == 0) {
			return numero;
		}
		
		resultado = numero % 10;
		
		System.out.print(resultado);
		
		return numeroInvertido(numero / 10, resultado);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int resultado = 0;
		
		System.out.println("Introduzca el número");
		numero = entrada.nextInt();
		
		numero = numeroInvertido(numero, resultado);
		
		entrada.close();
	}

}
