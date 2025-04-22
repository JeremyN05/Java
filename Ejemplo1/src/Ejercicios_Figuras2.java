import java.util.Scanner;

public class Ejercicios_Figuras2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int altura = 0;
		
		System.out.println("Introduce la altura del triangulo: ");
		
		altura = entrada.nextInt();
		entrada.nextLine();
		
		for (int i = 0; i < altura; i++) {
			for(int j = 0; j < i + 1; j++) {
				
				if(i > 0 && i < altura-1) {
					
					if(j > 0 && j < i) {
						System.out.print("  ");
						
					}else {
						System.out.print("* ");
					}
				
				}else {
					System.out.print("* ");
				}
			}
			System.out.println("  ");
		}
		
		entrada.close();
	}
}
