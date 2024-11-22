package duraciondescarga1;

import java.util.Scanner;

public class DuracionDescarga1 {

    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        float tamanio;
        short velocidad;
        int tiempoSegundos, tiempoMinutos, tiempoHoras;

        // Entrada de datos
        System.out.println("Cálculo del tiempo de descarga de un archivo");
        System.out.println("--------------------------------------------");

        System.out.print("\nIngrese el tamaño del archivo en GB: ");
        tamanio = sc.nextFloat();
        System.out.print("Ingrese la velocidad efectiva de descarga en Mbps: ");
        velocidad = sc.nextShort();

        // Cálculo tamaño en Mb
        tamanio = tamanio * 8 * 1024;

        // Cálculo de la duración de descarga
        tiempoSegundos = (int) (tamanio / velocidad);
        tiempoHoras = tiempoSegundos / 3600;
        tiempoSegundos = tiempoSegundos % 3600;
        tiempoMinutos = tiempoSegundos / 60;
        tiempoSegundos = tiempoSegundos % 60;

        // Muestra de resultados
        System.out.println("\nLa descarga del archivo durará: "
                + tiempoHoras + " horas "
                + tiempoMinutos + " minutos "
                + tiempoSegundos + " segundos"
        );

    }

}
