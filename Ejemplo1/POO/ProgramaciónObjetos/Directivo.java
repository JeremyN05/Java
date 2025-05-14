package ProgramaciónObjetos;

	enum Turno{MAÑANA, TARDE}

public class Directivo {
	
	String dni;
	String nombre;
	String apellidos;
	double salario;
	boolean salesiano;
	Turno unTurno;
	
	public Directivo(String dni, String nombre, String apellidos, double salario, boolean salesiano, Turno unTurno) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.salesiano = salesiano;
		this.unTurno = unTurno;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isSalesiano() {
		return salesiano;
	}
	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}
	public Turno getUnTurno() {
		return unTurno;
	}
	public void setUnTurno(Turno unTurno) {
		this.unTurno = unTurno;
	}
	
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", salesiano=" + salesiano + ", unTurno=" + unTurno + "]";
	}
	
}
