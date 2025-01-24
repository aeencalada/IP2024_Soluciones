import java.util.Scanner;

public class RitmoCardiaco1a {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		String msg;
		Short rCard;

		// Datos de entrada
		System.out.println("VALIDACIÓN DE LAS PULSACIONES DE UNA PERSONA");
		System.out.println("============================================");

		System.out.print("\nRegistre su pulsaciones por minuto: ");
		rCard = sc.nextShort();

		//Validación
		if (rCard < 60 || rCard > 100) {
			msg = "ANORMAL";
		} else {
			msg = "NORMAL";
		}

		// Resultados
		System.out.println("\nSu ritmo cardiaco es: " + msg);

	}

}