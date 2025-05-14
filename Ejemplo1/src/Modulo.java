import ProgramaciónObjetos.Profesor;

public class Modulo {
	
	String nombre;
	int nHoras;
	Profesor unProfesor;
	boolean convalidacion;
	
	public Modulo(String nombre, int nºhoras, Profesor unProfesor, boolean convalidacion) {
		super();
		this.nombre = nombre;
		this.nHoras = nºhoras;
		this.unProfesor = unProfesor;
		this.convalidacion = convalidacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNºhoras() {
		return nHoras;
	}
	public void setNºhoras(int nºhoras) {
		this.nHoras = nºhoras;
	}
	public Profesor getUnProfesor() {
		return unProfesor;
	}
	public void setUnProfesor(Profesor unProfesor) {
		this.unProfesor = unProfesor;
	}
	public boolean isConvalidacion() {
		return convalidacion;
	}
	public void setConvalidacion(boolean convalidacion) {
		this.convalidacion = convalidacion;
	}

	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", nºhoras=" + nHoras + ", unProfesor=" + unProfesor + ", convalidacion="
				+ convalidacion + "]";
	}
	
}
