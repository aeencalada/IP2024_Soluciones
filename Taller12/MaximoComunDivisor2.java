package maximocomundivisor2;

import java.util.Scanner;

public class MaximoComunDivisor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el 1er número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el 2do número: ");
        int n2 = sc.nextInt();
        System.out.println("\nEl máximo común divisor es: "
                + mcd(n1, n2));
    }

    //Función que calcula el máximo común divisor de 2 número enteros positivos
    public static int mcd(int m, int n) {
        int respuesta;
        if (m % n == 0) {
            respuesta = n;
        } else {
            respuesta = mcd(n, m % n);
        }
        return respuesta;
    }
}
