import java.util.Scanner;

public class Ejercicios_Iniciación3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		int suma = 0;
		
		System.out.println("Introduzca números hasta un número negativo o 0 para detener el programa");
		numeros = entrada.nextInt();
		entrada.nextLine();
		
		while(numeros > 0) {
			
			suma = suma + numeros;
			
			System.out.println("Introduzca números hasta un número negativo o 0 para detener el programa");
			numeros = entrada.nextInt();
			entrada.nextLine();
			
		}
		
		System.out.println("Los números introducidos son: " + numeros);
		System.out.println("La suma de todos los números es: " + suma);
		
		entrada.close();

	}
	
}
