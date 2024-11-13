import java.util.Scanner;

public class DuracionViaje1 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short distancia_NM, velocidad_NM_h;
		float tiempo_dias;

		// Entrada de datos
		System.out.println("Cálculo de la duración de viaje en barco");
		System.out.println("----------------------------------------");

		System.out.print("\nIngrese la distancia recorrida en NM: ");
		distancia_NM = sc.nextShort();
		System.out.print("Ingrese la velocidad del viaje en NM/h: ");
		velocidad_NM_h = sc.nextShort();

		// Cálculo duración del viaje en días
		tiempo_dias = (float) distancia_NM / velocidad_NM_h / 24;

		// Muestra de resultados
		System.out.println("\nLa duración del viaje será " + tiempo_dias + " dias");

	}

}