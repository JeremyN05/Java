import java.util.Scanner;

public class Ejercicios_Figuras3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int altura = 0;
		
		System.out.println("Introduce la altura del triangulo: ");
		
		altura = entrada.nextInt();
		entrada.nextLine();
		
		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < altura - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		entrada.close();

	}
	
}
