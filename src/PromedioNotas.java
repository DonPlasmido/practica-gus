import java.util.Scanner;

public class PromedioNotas {

	private static Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int nota1, nota2, nota3, promedio; 
		System.out.print("Ingrese la primera nota: ");
		nota1 = teclado.nextInt();
		System.out.print("Ingrese la segunda nota: ");
		nota2 = teclado.nextInt();
		System.out.print("Ingrese la tercera nota: ");
		nota3 = teclado.nextInt();
		promedio = nota1 + nota2 + nota3/3;
		
		if (promedio >= 7){
			System.out.print("El alumno está aprobado con nota");
			}
			else 
				if (promedio >= 4) {
			System.out.print("El alumnno aprobó justo");	}
			else {
				if (promedio <4)
				System.out.print("El alumno está suspendido");
				
			}
			
			
			
			
			
		
		
		
		
	}

}
