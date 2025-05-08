package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio4_Recursividad {
	
	private static boolean binario(int numero) {
		
		int resultado = numero % 10;
		
		if (numero == 0) {		
			return true;
		}
		
		if (resultado != 0 && resultado != 1) {
			return false;
		}
		
		return binario(numero / 10);
		
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número para saber si es binario");
		
		numero = entrada.nextInt();
		
		boolean esTrue = binario(numero);
		
		if(esTrue == true) {
			System.out.println("El numero " + numero + " es binario");
		
		}else {
			System.out.println("El número " + numero + " no es binario");
		}

		entrada.close();
	}

}
