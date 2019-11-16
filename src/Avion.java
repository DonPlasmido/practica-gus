
public class Avion extends Vehiculo {

	public Avion(int velocidadMaxima, int velocidadMinima) {
		super(velocidadMaxima, velocidadMinima);
	}

	private int helice;

	public void setHelice(int helice) {
		this.helice = helice;
	}

	public int getHelice() {
		return this.helice;
	}
}
