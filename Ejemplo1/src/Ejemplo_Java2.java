import java.util.Scanner;

public class Ejemplo_Java2 {

	public static void main(String[] args) {

		String nombre[] = new String[20];
		String apellido[] = new String[25];
		int edad[] = new int[25];
		String Alumnos[] = new String[100];
		int numeroAlumnos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el número de alumnos a ingresar: ");
		numeroAlumnos = entrada.nextInt();
		 entrada.nextLine();
		
		for (int i = 0; i < numeroAlumnos; i++) {
			
			System.out.println("Introduzca el nombre (Cadena) del alumno " + i);
		
			nombre[i] = entrada.nextLine();
			
			System.out.println("Introduzca el apellido (Cadena) del alumno " + i);
		
			apellido[i] = entrada.nextLine(); //nextLine sirve para limpiar el buffer de entrada.
		
			System.out.println("Introduzca la edad (Número entero) del alumno " + i);
		
			edad[i] = entrada.nextInt();
			 entrada.nextLine();
			
		}
		
		for (int i = 0; i < numeroAlumnos ; i++) {
			
			Alumnos[i] = nombre[i] + " " + apellido[i] + " " + edad[i];
			
			System.out.println( Alumnos[i] + "\n");
			
		}
		
		entrada.close();
		
	}

}
