package ProgramaciónObjetos;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Ejemplo_Objetos p1 = new Ejemplo_Objetos(55, 1.8, 85, false, "aguda");
		
		System.out.println(p1.toString());//devuelve una cadena y la imprime
		
		System.out.println("La altura de esta persona es: " + p1.getAltura());
		
		Ejemplo_Objetos p2 = new Ejemplo_Objetos(29);
		
		System.out.println("La edad de esta persona es: " + p2.toString());
		
		p2.setAltura(3.5);
		p2.setPeso(55);
		p2.setPelo(true);
		p2.setVoz("Metalica");
		
		System.out.println(p2.toString());

	}

}
