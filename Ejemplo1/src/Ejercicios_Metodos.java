import java.util.Scanner;

public class Ejercicios_Metodos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;
		
		mostrarMenu(opcion);
				
		entrada.close();
	}
	
	private static void mostrarMenu(int opcion){
		
		Scanner Menu = new Scanner(System.in);
		
		System.out.println("Que quiere hacer");
		System.out.println("1 - Rectangulo sin relleno");
		System.out.println("2 - Rectangulo con relleno");
		System.out.println("3 - Triangulo rectangulo sin relleno");
		System.out.println("4 - Triangulo rectangulo con relleno");
		System.out.println("5 - Triangulo equilátero");
		System.out.println("6 - Salir");
		
		opcion = Menu.nextInt();
		Menu.nextLine();
		
		do {
			switch (opcion) {
		
			case 1:
				RectanguloSinRelleno();
				break;
		
			case 2:	
				RectanguloRelleno();
				break;
		
			case 3:
				TrianguloRectanguloSinRelleno();
				break;
			
			case 4:
				TrianguloRectanguloRelleno();
				break;
			
			case 5:
				TrianguloEquilatero();
				break;
			
			case 6:
				System.out.println("Saliendo...");
				break;
			
			default:
				System.out.println("Opción no válida, no existe la opción " + opcion);
				break;
			}
		}while(opcion > 0);
		
		Menu.close();
	
	}
	
	static void RectanguloSinRelleno() {
		
			Scanner Rectangulo = new Scanner(System.in);
			
			int altura = 0;
			int ancho = 0;
			
			System.out.println("Introduce la altura del rectangulo: ");
			
			altura = Rectangulo.nextInt();
			Rectangulo.nextLine();
			
			System.out.println("Introduce el ancho del rectangulo");
			ancho = Rectangulo.nextInt();
			Rectangulo.nextLine();
			
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
			
			Rectangulo.close();
		
	}
	
	static void RectanguloRelleno() {
		
		Scanner RecRelleno = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		int base =  RecRelleno.nextInt();
		System.out.print("Introduce la altura: ");
		int altura =  RecRelleno.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
						System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		 RecRelleno.close();

	}
	
	static void TrianguloRectanguloSinRelleno() {
		
		Scanner TriRec = new Scanner(System.in);
		
		int altura = 0;
		
		System.out.println("Introduce la altura del triangulo: ");
		
		altura = TriRec.nextInt();
		TriRec.nextLine();
		
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
		
		TriRec.close();
		
	}
	
	static void TrianguloRectanguloRelleno() {
		
		Scanner TriRecRelle = new Scanner(System.in);
		
		System.out.print("Introduce la altura: ");
		int altura = TriRecRelle.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < i+1; j++) {
					System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		TriRecRelle.close();
		
	}
	
	static void TrianguloEquilatero() {
		
		Scanner TriEqui = new Scanner(System.in);
		
		int altura = 0;
		
		System.out.println("Introduce la altura del triangulo: ");
		
		altura = TriEqui.nextInt();
		TriEqui.nextLine();
		
		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < altura - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		TriEqui.close();
	}

}
