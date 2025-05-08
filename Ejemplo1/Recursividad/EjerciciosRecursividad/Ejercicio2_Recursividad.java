package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio2_Recursividad {
	
	private static int potencia(int base, int exponente, int resultado, int contador) {
		
		if(exponente <= 0) {
			return contador;
		}
		
		contador = exponente;
		exponente--;
		return resultado = base * potencia(base, exponente, resultado, contador);
		
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int base = 0;
		int exponente = 0;
		int resultado = 0;
		int contador = 0;
		
		System.out.println("Introduzca la base");
		base = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el exponente");
		exponente = entrada.nextInt();
		entrada.nextLine();
		
		resultado = potencia(base, exponente, resultado, contador);
		System.out.println("El resultado es: " + resultado);
		
		entrada.close();
	}

}
