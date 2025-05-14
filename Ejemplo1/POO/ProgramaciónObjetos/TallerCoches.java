package ProgramaciónObjetos;

enum TipoCoche{MINI, UTILITARIO, FAMILIAR, DEPORTIVO}
enum TipoSeguro{TERCEROS, TODORIESGO}

public class TallerCoches {
	String Modelo;
	String Color;
	String Matricula;
	TipoCoche unCoche;
	boolean Pintura;
	TipoSeguro unSeguro;
	int AñoFabricación;
	
	public TallerCoches(String modelo, String color, String matricula, TipoCoche unCoche, boolean pintura,
			TipoSeguro unSeguro, int añoFabricación) {
		super();
		Modelo = modelo;
		Color = color;
		Matricula = matricula;
		this.unCoche = unCoche;
		Pintura = pintura;
		this.unSeguro = unSeguro;
		AñoFabricación = añoFabricación;
	}
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public TipoCoche getUnCoche() {
		return unCoche;
	}
	public void setUnCoche(TipoCoche unCoche) {
		this.unCoche = unCoche;
	}
	public boolean isPintura() {
		return Pintura;
	}
	public void setPintura(boolean pintura) {
		Pintura = pintura;
	}
	public TipoSeguro getUnSeguro() {
		return unSeguro;
	}
	public void setUnSeguro(TipoSeguro unSeguro) {
		this.unSeguro = unSeguro;
	}
	public int getAñoFabricación() {
		return AñoFabricación;
	}
	public void setAñoFabricación(int añoFabricación) {
		AñoFabricación = añoFabricación;
	}
	
	@Override
	public String toString() {
		return "Coche: Modelo= " + Modelo + ", Color= " + Color + ", Matricula= " + Matricula + ", Tipo coche= "
				+ unCoche + ", Pintura= " + Pintura + ", Tipo seguro= " + unSeguro + ", AñoFabricación= " + AñoFabricación;
	}
	
}