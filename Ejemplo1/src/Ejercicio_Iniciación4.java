import java.util.Scanner;

public class Ejercicio_Iniciación4 {
	
	public static void main(String[] args) {
		
		int numeros = 0, resultado, digitos, total = 0, temp=0;
		
		String frase = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número > = 0");
		numeros = entrada.nextInt();
		entrada.nextLine();
		
		while(numeros > 0) {

			digitos = 0;

			resultado = 0;

			temp = numeros;

			while (temp > 0){

				resultado += temp % 10;

				digitos += 1;

				temp /= 10;

			}

			if (resultado == digitos) {

				frase += numeros + " + ";

				total += numeros ;

			}

			System.out.println("Introduce otro número:");

			numeros = entrada.nextInt();

		}

		frase += numeros + " = ";

		System.out.println("El resultado es: " + frase + total);

		

		entrada.close();

	}

}
