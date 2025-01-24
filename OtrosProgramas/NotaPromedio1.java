import java.util.Scanner;

public class NotaPromedio1 {

	public static void main(String[] args) {
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, nota5, promedio;

		// Entrada de datos
		System.out.println("\nNOTA PROMEDIO");
		System.out.println("-------------\n");
		System.out.print("Ingrese nota del estudoante 1: ");
		nota1 = sc.nextFloat();
		System.out.print("Ingrese nota del estudoante 2: ");
		nota2 = sc.nextFloat();
		System.out.print("Ingrese nota del estudoante 3: ");
		nota3 = sc.nextFloat();
		System.out.print("Ingrese nota del estudoante 4: ");
		nota4 = sc.nextFloat();
		System.out.print("Ingrese nota del estudoante 5: ");
		nota5 = sc.nextFloat();

		// Cálculo de la nota promedio
		promedio = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5;

		// Muestra de resultados
		System.out.println("\nLa nota promedio es: " + promedio);

	}

}