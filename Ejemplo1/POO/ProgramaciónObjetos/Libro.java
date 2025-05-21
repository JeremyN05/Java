package ProgramaciónObjetos;

public class Libro extends Articulos{
	
	String autor;

	public Libro(int id, String titulo, boolean disponible, String autor) {
		super(id, titulo, disponible);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Libro [autor:" + autor + "id:" + id + "titulo:" + titulo + "disponible:" + disponible + "]";
	}
	
}
