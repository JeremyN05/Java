import java.util.Scanner;

public class Ejercicios_Figuras1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int altura = 0;
		int ancho = 0;
		
		System.out.println("Introduce la altura del rectangulo: ");
		
		altura = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce el ancho del rectangulo");
		ancho = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("La altura es de " + altura );
		System.out.println("El ancho es de " + ancho );
		
		for (int i = 0; i < altura; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				if (i > 0 && i < (altura-1)) {
					
					if ( j > 0 && j < (ancho-1)) {
						
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
