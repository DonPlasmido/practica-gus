import java.util.Scanner;



public class Ejemplo1 {
	
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
	StringBuffer mensaje;
	int edad;
	String nombre;
	int edad2;
	String nombre1;
	
	
	System.out.print("Como te llamas: ");
	nombre = teclado.nextLine();
	System.out.print("Cuantos a�os tienes:");
	edad = teclado.nextInt();
	
	
	System.out.println("Dime el nombre de la otra persona ");
	nombre1 = teclado.nextLine();
	System.out.print("Y su edad");
	edad2 = teclado.nextInt();
	
	System.out.println(nombre + " tiene " + edad + " a�os" );
	System.out.println(nombre1 + " tiene " + edad2 + "a�os");

	mensaje = new StringBuffer (nombre);
	if (edad<edad2){
		mensaje.append(" es " + (edad2 - edad)); 
		mensaje.append("a�os mas joven que" + edad2);
	}
	else 
			if(edad > edad2) {
				mensaje.append(" es " + (edad - edad2));
				mensaje.append("a�os mayot que " + edad2);
				}
			else 
				mensaje.append("tiene la misma edad que " + edad2);
	
	System.out.print("mensaje");
		
	
	teclado.close();
		
		
		
		
		
	}
		
}
	
	
	
	
	

	