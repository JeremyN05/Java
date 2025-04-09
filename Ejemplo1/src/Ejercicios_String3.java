import java.util.Scanner;

public class Ejercicios_String3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int contador_Palabras = 0;
		
		System.out.println("Introduzca un texto u oración: ");
		palabra = entrada.nextLine();
		
		for(int i = 0; i < palabra.length(); i++){
			
			char caracter = palabra.charAt(i);
			
			if(caracter == ' '){
				
				contador_Palabras++;
			}
		}
		
		System.out.println("El texto contiene " + contador_Palabras + " " + "palabra/s");
		
		entrada.close();
		
	}

}
