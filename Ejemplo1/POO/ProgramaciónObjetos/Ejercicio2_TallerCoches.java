package ProgramaciónObjetos;

public class Ejercicio2_TallerCoches {

	public static void main(String[] args) {
		
		TallerCoches[] arrayCoches = new TallerCoches[8];
		
		arrayCoches[0] = new TallerCoches("Mazada 6e", "Rojo", "1456RTD", TipoCoche.UTILITARIO, true, TipoSeguro.TODORIESGO, 2025);
		arrayCoches[1] = new TallerCoches("Citroen  C5 X", "Gris", "8764FGC", TipoCoche.FAMILIAR, false, TipoSeguro.TERCEROS, 2022);
		arrayCoches[2] = new TallerCoches("MUSTANG 5.0 V8 GT", "Negro", "4521FMG", TipoCoche.DEPORTIVO, true, TipoSeguro.TODORIESGO, 2017);
		arrayCoches[3] = new TallerCoches("MINI Cooper S", "Negro", "2345MNC", TipoCoche.MINI, false, TipoSeguro.TERCEROS, 2017);
		arrayCoches[4] = new TallerCoches("Seat Ibiza FR", "Azul", "1123FRS", TipoCoche.UTILITARIO, false, TipoSeguro.TERCEROS, 2021);
		arrayCoches[5] = new TallerCoches("Peugeot 508 SW", "Blanco", "3345TRH", TipoCoche.FAMILIAR, true, TipoSeguro.TODORIESGO, 2024);
		arrayCoches[6] = new TallerCoches("BMW M4 Coupe", "Amarillo", "5567BMW", TipoCoche.DEPORTIVO, true, TipoSeguro.TODORIESGO, 2022);
		arrayCoches[7] = new TallerCoches("Fiat 500", "Rojo", "7788FAT", TipoCoche.MINI, false, TipoSeguro.TERCEROS, 2018);
		
		for(int i = 0; i < arrayCoches.length; i++) {
			System.out.println(arrayCoches[i].toString());
		}
		
		System.out.println();
		
		System.out.println("Coches Deportivos: ");
		ImprimirDeportivos(arrayCoches);
		
		System.out.println();
		
		System.out.println("Coches con el año de creación par: ");
		ImprimirCocheAñoPar(arrayCoches);
		
	}
	
	private static void ImprimirDeportivos(TallerCoches[]array) {
		
		for(int i = 0; i < array.length; i++){
		
			if(array[i].unCoche == TipoCoche.DEPORTIVO) {
				
				System.out.println(array[i].toString());
				
			}
		}
	}
	
	private static void ImprimirCocheAñoPar(TallerCoches[]array) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].AñoFabricación % 2 == 0) {
				System.out.println(array[i].toString());
			}
			
		}
		
	}

}
