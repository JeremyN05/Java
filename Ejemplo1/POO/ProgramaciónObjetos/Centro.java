package ProgramaciónObjetos;

import java.util.Scanner;

public class Centro {

	public static void main(String[] args) {
		
		Modulo[] arrayModulos = new Modulo[2];
	
		Profesor P01 = new Profesor("23189763L", "Juan", "Valdes", 2000, 2, true);
		Profesor P02 = new Profesor("26739164G", "Jacob", "Navarro", 1500, 1, false);
		
		Administracion A01 = new Administracion("84723045C", "Lucía", "Torres", 1500, "Bachillerato de ciencias", 5);
		Administracion A02 = new Administracion("67294015F", "Malcom", "Suarez", 1500, "Bachillerato de letras", 2);
		
		Directivo D01 = new Directivo("67832456E", "Pblovs", "Villar", 2500, true, Turno.MAÑANA);
		Directivo D02 = new Directivo("67389257V", "Marta", "Rodriguez", 2500, false, Turno.TARDE);
		
		System.out.println(P01.toString());
		System.out.println(P02.toString());
		
		System.out.println();
		
		System.out.println(A01.toString());
		System.out.println(A02.toString());
		
		System.out.println();
		
		System.out.println(D01.toString());
		System.out.println(D02.toString());
		
		arrayModulos[0] = new Modulo("DAM", 300, P01, false);
		arrayModulos[1] = new Modulo("Telecomunicaciones", 300, P02, true);
		
		Alumno Al01 = new Alumno("78323647C", "Manuela", "Gutierrez", "02-11-2000", Sexo.MASCULINO, false, arrayModulos);
		Alumno Al02 = new Alumno("30583957Y", "Jorge", "Quintanilla", "11-02-2001", Sexo.MASCULINO, false, arrayModulos);
		
		System.out.println(Al01.toString());
		System.out.println(Al02.toString());
	}
	
	

}
