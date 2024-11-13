import java.util.Scanner;

public class TiempoDescarga1 {

	public static void main(String[] args) {
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		int tamanio_MB, tamanio_Mb;
		short velocidad;
		float tiempoDescarga;

		// Entrada de datos
		System.out.println("Cálculo del tiempo de descarga de un archivo");
		System.out.println("--------------------------------------------");

		System.out.print("\nIngrese el tamaño del archivo en MB: ");
		tamanio_MB = sc.nextInt();
		System.out.print("Ingrese la velocidad de descarga en Mbps: ");
		velocidad = sc.nextShort();

		// Cálculo tamaño en Mb
		tamanio_Mb = tamanio_MB * 8;

		// Cálculo duración descarga en minutos
		tiempoDescarga = (float) tamanio_Mb / velocidad / 60;

		// Muestra de resultados
		System.out.println("\nLa descarga del archivo durará: " + tiempoDescarga + " minutos");

	}

}