package ProgramaciónObjetos;

public class Articulos {
	
	int id;
	String titulo;
	boolean disponible;
	
	public Articulos(int id, String titulo, boolean disponible) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.disponible = disponible;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "Articulos [id=" + id + ", titulo=" + titulo + ", disponible=" + disponible + "]";
	}
}
