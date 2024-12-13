package promediopares1;

// Promedio de los N primeros números pares
import java.util.Scanner;

public class PromedioPares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, c, x;
        int suma;
        float promedio;
        // Entrada de datos
        System.out.print("Ingrese la cantidad de pares a promediar: ");
        N = sc.nextShort();
        // Proceso
        suma = 0;
        x = 1;
        c = 1;
        while (c <= N) {
            if (x % 2 == 0) {
                suma = suma + x;
                c = (short) (c + 1);
            }
            x = (short)(x + 1);
        }
        promedio = (float) suma / N;
        // Salida
        System.out.println("\nEl promedio de los " + N
                + " primeros números pares es " + promedio);
    }
}
