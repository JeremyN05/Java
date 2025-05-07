package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio2_Recursividad {
	
	private static int potencia(int base, int exponente, int resultado) {
		
		if(base == 0 || exponente == 0) {
			return 1;
		}
		
		resultado = base + exponente;
		
		return resultado;
		
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int base = 0;
		int exponente = 0;
		int resultado = 0;
		
		System.out.println("Introduzca la base");
		base = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el exponente");
		exponente = entrada.nextInt();
		entrada.nextLine();
		
		resultado = potencia(base, exponente, resultado);
		System.out.println("El resultado es: " + resultado);
		
		entrada.close();
	}

}
