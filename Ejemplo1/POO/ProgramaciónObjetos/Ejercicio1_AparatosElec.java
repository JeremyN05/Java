package ProgramaciónObjetos;

public class Ejercicio1_AparatosElec {

	public static void main(String[] args) {
		
		AparatosElec bombilla = new AparatosElec(100, false, 0 );
		AparatosElec radiador = new AparatosElec(2000, false, 0);
		AparatosElec plancha = new AparatosElec(1200, false, 0);
		
		System.out.println(AparatosElec.calcularConsumo(bombilla.getConsumo(), radiador.getConsumo(), plancha.getConsumo()));
	}

}
