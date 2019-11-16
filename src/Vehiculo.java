
public class Vehiculo {

	private int velocidadMinima;
	private int velocidadMaxima;
	private String color;
	private Boolean arrancado = false;
	private int pasajeros;
	private String tipo;

	public Vehiculo(int velocidadMaxima, int velocidadMinima) {

		this.velocidadMaxima = velocidadMaxima;
		this.velocidadMinima = velocidadMinima;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;

	}

	public void arrancar() {
		this.arrancado = true;
	}

	public void apagar() {
		this.arrancado = false;
	}

	public int getPasajeros() {
		return this.pasajeros;
	}

	public void imprimirDatos() {

		int pasajeros = 88;
		pasajeros += 2;

		System.out.print("Mis valores son: ");
		System.out.print("\n");
		System.out.print("Tipo: " + tipo);
		System.out.print("\n");
		System.out.print("velocidadMinima: " + velocidadMinima);
		System.out.print("\n");
		System.out.print("velocidadMaxima: " + velocidadMaxima);
		System.out.print("\n");
		System.out.print("color: " + color);
		System.out.print("\n");
		System.out.print("arrancado: " + arrancado);
		System.out.print("\n");

		System.out.println("pasajeros: " + this.pasajeros);
		System.out.print("pasajeros mock : " + pasajeros);

		System.out.print("\n");

	}

}
