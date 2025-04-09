
public class Ejemplo_Java {

	public static void main(String[] args) {
		
		String fragmentoNombreAlumnos = "Victor";
		String[] nombreAlumnos = {"Antonio", "Marta", "Victor Hugo", "David"};
		
		int resultado = contarUsuarios(fragmentoNombreAlumnos, nombreAlumnos);
		System.out.println("Total resultados: " + resultado);
	}
	
	private static int contarUsuarios(String fragmentoNombreAlumnos, String[] nombreAlumnos) {
		boolean encontrado = false;
		int totalEncontrados = 0;
		
		for (String nombreAlumnoActual : nombreAlumnos) {
			if(nombreAlumnoActual.contains(fragmentoNombreAlumnos)) {
				encontrado = true;
			}
			
			if(encontrado) {
				totalEncontrados++;
				encontrado = false;
			}
		}
		
		return totalEncontrados;
	}

}
