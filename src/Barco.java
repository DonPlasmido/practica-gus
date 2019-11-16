
public class Barco extends Vehiculo {

	public Barco(int velocidadMaxima, int velocidadMinima) {
		super(velocidadMaxima, velocidadMinima);
	}

	private int eslora;

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public int getEslora() {

		return this.eslora;

	}
}
