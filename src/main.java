import java.util.Scanner;

public class main {

	private static Scanner teclado;
	private static Scanner teclado2;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		int num1, num2, total;
		Operaciones misOperaciones = new Operaciones();
		Operaciones misOperaciones2 = new Operaciones();

		int i = 100;

		while (i > 0) {
			System.out.println("El valor de 'i' es: " + i);

			if (i >= 50) {
				System.out.println("No he llegado a la mitad");
			} else {
				if (i >= 10) {
					System.out.println("Ya pase  la mitad");

				} else {
					System.out.println("Ya casi acabo");
				}

			}

			i = i - 1;
		}

		int k = 10;

		do {
			System.out.println("entreeee");
			k = k - 1;
		} while (k > 0);

		System.out.println("FIN");

		for (int j = 100; j >= 0; j--) {
			System.out.println("El valor de 'j' es: " + j);
		}

		teclado2 = new Scanner(System.in);
		int suma, valor, promedio;
		suma = 0;
		for (int f = 1; f <= 10; f++) {

			System.out.print("Ingrese valor: ");
			valor = teclado2.nextInt();
			suma = suma + valor;
		}

		System.out.print("La suma es: ");
		System.out.println(suma);
		promedio = suma / 10;
		System.out.print("El promedio es: ");
		System.out.println(promedio);

		Barco barco = new Barco(0, 10);
		Avion avion = new Avion(0, 900);
		Coche coche = new Coche(0, 200);

		barco.setTipo("barco");
		avion.setTipo("avión");
		coche.setTipo("coche");

		barco.setPasajeros(200);
		avion.setPasajeros(20);
		coche.setPasajeros(5);

		barco.arrancar();

		System.out.println("--Impresion Barco--");
		barco.imprimirDatos();

		System.out.print("\n");
		System.out.println("--Impresion Avión---");
		avion.imprimirDatos();

		System.out.print("\n");
		System.out.println("--Impresion Coche--");
		coche.imprimirDatos();

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");

		coche.setPuertas(5);
		System.out.print("Puertas: ");
		System.out.println(coche.getPuertas());

		barco.setEslora(300);
		System.out.print("Eslora: ");
		System.out.println(barco.getEslora());

		avion.setHelice(4);
		System.out.print("Helices: ");
		System.out.println(avion.getHelice());

		System.out.print("Introduce el primer numero: ");
		num1 = teclado2.nextInt();

		System.out.print("Introduce el segundo numero: ");
		num2 = teclado2.nextInt();

		total = misOperaciones.suma(num1, num2);

		System.out.print("El resultado es: " + total);
		System.out.print("\nEl resultado2 es: " + misOperaciones2.resta(1000, 100));

		teclado.close();
	}

}
