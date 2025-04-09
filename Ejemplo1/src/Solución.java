public class Solución {

	public static void main(String[] args) {
		int notas[] = {4, 6, 8, 1, 10};
		
		int s = 0;

		
		for (int i = 0; i < 5; i++) {
			
			if(notas[i] < 5) {

				s++;
			}
			
		}
		
		if (s > 0) {
			System.out.print("Hay alumnos suspensos " + s);
		}else System.out.print("No hay alumnos suspensos");

	}

}
