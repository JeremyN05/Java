package ProgramaciónObjetos;

public class AparatosElec {
	
	int consumo;
	boolean estado;
	int consumoMaximo;
	
	public AparatosElec(int consumo, boolean estado, int consumoMaximo) {
		super();
		this.consumo = consumo;
		this.estado = estado;
		this.consumoMaximo = consumoMaximo;
		
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	public int getConsumoMaximo() {
		return consumoMaximo;
	}

	public void setConsumoMaximo(int consumoMaximo) {
		this.consumoMaximo = consumoMaximo;
	}

	@Override
	public String toString() {
		return "AparatosElec [consumo=" + consumo + ", estado=" + estado + ", consumoMaximo=" + consumoMaximo + "]";
	}
	
	public void encendido() {
		
		this.estado = true;
		
		consumoMaximo += consumo;
		
	}
	
	public void apagado() {
		
		this.estado = false;
		
		consumoMaximo -= consumo;
		
	}
	
	public int calcularConsumo(int bombilla, int radiador, int plancha) {
		
		consumoMaximo = bombilla + radiador + plancha;
		
		return consumoMaximo;
	}
	
}
