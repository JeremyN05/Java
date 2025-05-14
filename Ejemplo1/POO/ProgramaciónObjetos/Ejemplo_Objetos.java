package ProgramaciónObjetos;

public class Ejemplo_Objetos {

	int edad;
	double altura;
	double peso;
	boolean pelo;
	String voz;
	
	public Ejemplo_Objetos(int edad, double altura, double peso, boolean pelo, String voz) {
		super();
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pelo = pelo;
		this.voz = voz;
	}
	
	public Ejemplo_Objetos(int edad) {
		super();
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	public double getAltura() {
		return altura;
	}
		
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
		
	public void setPeso(double peso) {
		this.peso = peso;
	}
		
	public boolean isPelo() {
		return pelo;
	}
		
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
		
	public String getVoz() {
		return voz;
	}
	
	public void setVoz(String voz) {
		this.voz = voz;
	}
	
	@Override
	public String toString() {/*Sirve para devolver el contenido de las funciones en forma de mensaje.*/
		return "Ejemplo_Objetos [edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", pelo=" + pelo + ", voz="
				+ voz + "]";
	}

}
