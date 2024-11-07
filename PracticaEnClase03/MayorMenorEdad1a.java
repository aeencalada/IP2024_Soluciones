import java.util.Scanner;

public class MayorMenorEdad1a {
	public static void main (String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short anioNac, anioAct, edad;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
		anioNac = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioAct = sc.nextShort();

		// Proceso y muestra de datos
		edad = (short)(anioAct - anioNac);

		if (edad >= 18) {
			System.out.println("\nUsted es MAYOR de edad");
		} else {
			System.out.println("\nUsted es MENOR de edad");
		}

	}
}

