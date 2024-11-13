import java.util.Scanner;

public class DownloadDuration1 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		int tamanio_GB, tamanio_Mb;
		short velocidad_Mbps;
		float tiempoDescarga_h;

		// Entrada de datos
		System.out.println("Cálculo del tiempo de descarga de un video");
		System.out.println("------------------------------------------");

		System.out.print("\nIngrese el tamaño del video en GB: ");
		tamanio_GB = sc.nextInt();
		System.out.print("Ingrese la velocidad de descarga en Mbps: ");
		velocidad_Mbps = sc.nextShort();

		// Cálculo tamaño en Mb
		tamanio_Mb = tamanio_GB * 1024 * 8;

		// Cálculo duración descarga en horas
		tiempoDescarga_h = (float) tamanio_Mb / velocidad_Mbps / 3600;

		// Muestra de resultados
		System.out.println("\nLa descarga del archivo durará: " + tiempoDescarga_h + " horas");

	}

}