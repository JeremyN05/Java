import java.util.Scanner;

public class Ejercicios_Iniciación2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int digitos = 0;
		
		System.out.println("Introduzca un número: ");
		numero = entrada.nextInt();
		entrada.nextLine();
		
		while (numero > 0) {
			
			numero = numero / 10;
			
			digitos++;
		
		}
		
		System.out.println("El número tiene " + digitos + " digito/s");
		
		entrada.close();

	}
}
