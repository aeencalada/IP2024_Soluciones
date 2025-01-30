package maximocomundivisor3;

import java.util.Scanner;

public class MaximoComunDivisor3 {
    public static void main(String[] args) {
        int n1 = leerEnteroPositivo("Ingrese el 1er número: ");
        int n2 = leerEnteroPositivo("Ingrese el 2do número: ");
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
    //Función que lee un valor entero positivo
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean datoValido = false;
        while (!datoValido) {
            System.out.print(mensaje);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num <= 0) {
                    throw new Exception("Valor negativo");
                }
                datoValido = true;
            } catch (Exception e) {
                System.err.println("Dato no válido: " + e.getMessage() + "\n");
            }
        }
        return num;
    }
}
