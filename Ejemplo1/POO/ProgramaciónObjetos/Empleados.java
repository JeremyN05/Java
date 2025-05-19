package ProgramaciónObjetos;

public class Empleados {
	
	private String nombre;
	private int permanencia;
	private double salario;
	private String clasificacion;
	
	public Empleados(String nombre, int permanencia, double salario) {
		
		this.nombre = nombre;
		this.permanencia = permanencia;
		this.salario = salario;
		 clasificacion = mostrarPermanencia();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPermanencia() {
		return permanencia;
	}
	public void setPermanencia(int permanencia) {
		this.permanencia =permanencia;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) { //Solo actualizo  Salario
		this.salario = salario;
	}
	
	public void setSalario(double salario, int porcentaje) { //Porcentaje y salario
		this.salario = salario;
	}
	
	public void setSalario(int porcentaje) { //Solo Porcentaje
		double tantoPorciento = porcentaje/100;
		this.salario = salario + salario * tantoPorciento;
	}
	
	public String getClasificación() {
		return clasificacion;
	}

	public void setClasificación(String clasificación) {
		this.clasificacion = clasificación;
	}
	
	@Override
	public String toString() {
		return "Empleados [nombre = " + nombre + ", permanencia = " + permanencia + ", salario = " + salario +  ", clasificación = " + clasificacion + "]";
	}
	
	private String mostrarPermanencia() {
		
		if(permanencia <= 3) {
			return clasificacion = " Principiante";
		
		}else if(permanencia > 3 && permanencia < 18) {
			
			return clasificacion = " Intermedio";
			
		}else if(permanencia >= 18) {
			return clasificacion = " Senior";
		}
		return clasificacion;

	}

	
}
