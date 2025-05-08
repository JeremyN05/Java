package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio5_Recursividad {
	
	public static int convertidor(int numero, int resultado) {
		
		if(numero == 0) {
			return resultado;
		
		}
		
		resultado += numero % 2;
		
		System.out.print(resultado);
		
		return resultado = convertidor(numero / 2, resultado);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int resultado = 0;
		
		System.out.println("Ingrese un número para obtener su equivalente en binario:");
		numero = entrada.nextInt();
		
		resultado = convertidor(numero, resultado);
		
		entrada.close();
	}

}
