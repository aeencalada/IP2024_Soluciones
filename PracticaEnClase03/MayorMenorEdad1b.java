import java.util.Scanner;
public class MayorMenorEdad1b {
	public static void main (String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short anioNac, anioAct, edad;
		String mensaje;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
		anioNac = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioAct = sc.nextShort();

		// Proceso
		edad = (short)(anioAct - anioNac);

		if (edad >= 18) {
			mensaje = "MAYOR";
		} else {
			mensaje = "MENOR";
		}

		// Salida o muestra de datos
		System.out.println("\nUsted es " + mensaje + " de edad");

	}
}

