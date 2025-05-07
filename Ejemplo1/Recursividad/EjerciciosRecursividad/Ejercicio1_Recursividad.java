package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio1_Recursividad {
	
	private static int ContarDigitos(int numero, int contador) {

		if (numero == 0 ) {
			return contador;
		}
		
		contador++;
		numero /= 10;
		
		return ContarDigitos(numero, contador);
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		
		System.out.println("Introduzca un número para saber cuantos dígitos tiene");
		numero = entrada.nextInt();
		entrada.nextLine();
		
		contador = ContarDigitos(numero, contador);
		
		System.out.println("hay " + contador + " dígitos");
		
		entrada.close();
		
	}
	
}
