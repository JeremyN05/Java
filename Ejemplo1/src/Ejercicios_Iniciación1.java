import java.util.Scanner;

public class Ejercicios_Iniciación1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int Cantidad_Numeros = 0;
		int Numeros[] = new int[100];
		int ContadorMax = 0;
		int ContadorMin = 0;
		int max = Numeros[0];
		int min = Numeros[0];
		
		System.out.println("Introduzca la cantidad de números a introducir: ");
		Cantidad_Numeros = entrada.nextInt();
		entrada.nextLine();
		
		for (int i = 0; i < Cantidad_Numeros; i++) {
			
			System.out.println("Introduzca el número " + i);
			Numeros[i] = entrada.nextInt();
			entrada.nextLine();
		}
		
		for (int i = 0; i < Cantidad_Numeros; i++){
			
			System.out.println(Numeros[i]);
		}
		
		for (int i = 1; i < Cantidad_Numeros; i++) {
			
			if(Numeros[i] > max) {
				max = Numeros[i];
			
			}else if(Numeros[i] < min) {
				
				min = Numeros[i];
				
			}
		}
		
		for (int i = 0 ; i < Cantidad_Numeros; i++) {
			
			if(Numeros[i] == max) {
				ContadorMax++;

			}else if( min == Numeros[i]) {
				ContadorMin++;
				
			}
		}
		System.out.println("El mayor número de todos aparece " + ContadorMax);
		System.out.println("El menor número de todos aparece " + ContadorMin);

		entrada.close();

	}

}
