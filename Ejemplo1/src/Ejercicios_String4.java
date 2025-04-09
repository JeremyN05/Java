import java.util.Scanner;

public class Ejercicios_String4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		
			System.out.println("Introduzca una palabra para saber si es palindroma o no:");
			texto = entrada.nextLine();
			
			int longitud = texto.length();

			
			for (int i = 0; i < longitud/2; i ++) {
				
				if(texto.charAt(i) != texto.charAt(longitud - i - 1)) {
					
					System.out.println("La palabra no es palindroma");
				
				}else {
					
					System.out.println("La palabra es palindroma");
				}
				
			}
			
			entrada.close();
			
	}
}
