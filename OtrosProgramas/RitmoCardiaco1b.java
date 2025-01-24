import java.util.Scanner;

public class RitmoCardiaco1b {

	public static void main(String[] args) {
		//Declaración
		Scanner sc = new Scanner(System.in);
		short ritmoC;
		String tipo;

		// Datos de entrada
		System.out.println("VALIDACIÓN DEL RITMO CARDIACO DE PERSONAS ADULTAS");
		System.out.println("=================================================");

		System.out.print("\nIngrese su ritmo cardiaco (pulsaciones por minuto): ");
		ritmoC = sc.nextShort();

		//Validación
		if (ritmoC >= 60 && ritmoC <= 100) {
			tipo = "NORMAL";
		} else {
			tipo = "ANORMAL";
		}

		// Resultados
		System.out.println("\nSu ritmo cardiaco es: " + tipo);

	}

}