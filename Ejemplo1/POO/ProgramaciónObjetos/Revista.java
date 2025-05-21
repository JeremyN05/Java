package ProgramaciónObjetos;

public class Revista extends Articulos {
	
	int edicion;

	public Revista(int id, String titulo, boolean disponible, int edicion) {
		super(id, titulo, disponible);
		this.edicion = edicion;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	@Override
	public String toString() {
		return "Revista [edicion=" + edicion + "id:" + id + "titulo:" + titulo + "disponible:" + disponible + "]";
	}
	
}
