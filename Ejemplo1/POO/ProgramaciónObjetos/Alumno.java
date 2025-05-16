package ProgramaciónObjetos;

import java.util.Arrays;

enum Sexo{MASCULINO, FEMENINO}

public class Alumno {

	String dni;
	String nombre;
	String apellidos;
	String fechaNac;
	Sexo unSexo;
	boolean repetidor;
	Modulo [] unModulos;
	
	public Alumno(String dni, String nombre, String apellidos, String fechaNac, Sexo unSexo, boolean repetidor, Modulo[] unModulos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.unSexo = unSexo;
		this.repetidor = repetidor;
		this.unModulos = unModulos;
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
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Sexo getUnSexo() {
		return unSexo;
	}
	public void setUnSexo(Sexo unSexo) {
		this.unSexo = unSexo;
	}
	public boolean isRepetidor() {
		return repetidor;
	}
	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}
	public Modulo[] getUnModulos() {
		return unModulos;
	}
	public void setUnModulos(Modulo[] unModulos) {
		this.unModulos = unModulos;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac
				+ ", unSexo=" + unSexo + ", repetidor=" + repetidor + ", unModulos=" + Arrays.toString(unModulos) + "]";
	}
}
