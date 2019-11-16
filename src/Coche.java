
public class Coche extends Vehiculo {

	
	
	public Coche(int velocidadMaxima, int velocidadMinima) {
		super(velocidadMaxima, velocidadMinima);
	}

	private int puertas;
	
	// esto es una prueba
	
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;		
	}
	
	public int  getPuertas() {
		return this.puertas;		
	}
	

	
	
	
}
