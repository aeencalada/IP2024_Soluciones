package potencia2;

import java.util.Scanner;

public class Potencia2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        System.out.printf("\nResultado: %.5f%n", potencia(base, exponente));
    }

    // Función que calcula una potencia usando recursividad
    public static double potencia(int x, int y) {
        double p;
        if (y == 0) {
            p = 1;
        } else if (y < 0) {
            p = 1 / potencia(x, y * (-1));
        } else {
            p = x * potencia(x, y - 1);
        }
        return p;
    }
}
