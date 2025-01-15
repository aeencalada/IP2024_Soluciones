package potencia1;

import java.util.Scanner;

public class Potencia1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        System.out.println("Resultado: " + potencia(base, exponente));

    }

    // Función que calcula una potencia usando recursividad
    public static long potencia(int x, int y) {
        long p;
        if (y == 0) {
            p = 1;
        } else {
            p = x * potencia(x, y - 1);
        }
        return p;
    }
}
