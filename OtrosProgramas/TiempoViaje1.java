import java.util.Scanner;

public class TiempoViaje1 {

	public static void main(String[] args) {
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		short distancia_Km, velocidad_Km_h;
		float tiempo_min;

		// Entrada de datos
		System.out.println("Cálculo del tiempo de viaje");
		System.out.println("---------------------------");

		System.out.print("\nIngrese la distancia recorrida en Km: ");
		distancia_Km = sc.nextShort();
		System.out.print("Ingrese la veocidad del viaje en Km/h: ");
		velocidad_Km_h = sc.nextShort();

		// Cálculo duración del viaje en minutos
		tiempo_min = (float) distancia_Km / velocidad_Km_h * 60;

		// Muestra de resultados
		System.out.println("\nLa duración del viaje será " + tiempo_min + " minutos");

	}

}