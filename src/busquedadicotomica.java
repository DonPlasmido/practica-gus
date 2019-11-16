
import java.util.Scanner;

public class busquedadicotomica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codigo;
		int[] codigos = new int[] { 28, 35, 36, 40, 89, 103, 150 };
		String[] islas = new String[] { "Tenerife", "La Gomera", "El Hierro", "La Palma", "Gran Canaria",
				"Fuerteventura", "Lanzarote" };
		int izq;
		int der;
		int medio;
		
		
		System.out.println("Codigo Isla ");
		codigo = teclado.nextInt();
		
		
		izq = 0;
		der = codigos.length - 1;
		medio = (der + izq) / 2;
		
		
	
		while (codigos[medio] != codigo && izq < der) {
			if (codigo < codigos[medio]) {
				der = medio - 1;
			} else {
				izq = medio + 1;
			}
			medio = (der + izq) / 2;
		}
		if (codigos[medio] == codigo) {
			System.out.println(" El codigo " + codigo + " pertence a la isla " + islas[medio]);
		} else {
			System.out.println("El codigo no pertence a ninguna isla");

			teclado.close();
		}
	}

}
