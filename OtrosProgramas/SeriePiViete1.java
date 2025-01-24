package seriepiviete1;

import java.util.Scanner;

public class SeriePiViete1 {

    public static void main(String[] args) {
        int n = leerEnteroPositivo("Ingrese el número de elementos de la serie: ");
        double pi = 1;
        for (int i = 1; i <= n; i++) {
            pi *= elementoViete(i);
        }
        pi = 2 / pi;
        System.out.println("El valor de pi es: " + pi);

    }

    // Función que lee desde teclaco un número entero positivo
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print(mensaje);
                num = sc.nextInt();
                if (num <= 0) {
                    System.out.print("Valor no válido\n");
                } else {
                    datoValido = true;
                }
            } catch (Exception e) {
                System.out.print("Valor no válido\n");
                sc.next();
            }
        }
        return num;
    }

    public static double elementoViete(int x) {
        double valor;
        if (x == 1) {
            valor = Math.sqrt(1.0 / 2);
        } else {
            valor = Math.sqrt((1.0 / 2) + (1.0 / 2) * elementoViete(x - 1));
        }
        return valor;
    }
}
