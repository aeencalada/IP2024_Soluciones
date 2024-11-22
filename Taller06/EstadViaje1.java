package estadviaje1;

// Estadísticas de viaje
import java.util.Scanner;

public class EstadViaje1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int recoKm, recoM;
        double tiempoH, consumoG, consumoL, rendimiento, tiempoS, velocidad;
        // Titulo
        System.out.println("ESTADÍSTICAS DE VIAJE");
        System.out.println("=====================");
        // Ingreso de datos
        System.out.print("\nIngrese los Km recorridos : ");
        recoKm = sc.nextInt();
        System.out.print("Ingrese la duración del viaje en horas: ");
        tiempoH = sc.nextDouble();
        System.out.print("Ingrese los galones consumidos: ");
        consumoG = sc.nextDouble();
        // Cálculo de rendimiento
        consumoL = consumoG * 3.785;
        rendimiento = recoKm / consumoL;
        // Cálculo de velocidad
        recoM = recoKm * 1000;
        tiempoS = tiempoH * 3600;
        velocidad = recoM / tiempoS;
        // Presentación de resultados
        System.out.println("\nEl rendimiento del auto fue de: "
                + rendimiento + " Km/lt");
        System.out.println("La velocidad media del viaje fue de: "
                + velocidad + " m/s\n");
    }
}
