package calculopi1;

import java.util.Scanner;

public class CalculoPi1b {

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        double total_pi, siguiente_ele;
        int tam_serie, x;

        // Entrada del tamaño de la serie
        System.out.print("Indique la cantidad de elementos de la serie a procesar: ");
        tam_serie = sc.nextInt();

        // Inicialización de variables
        x = 0;
        total_pi = 0;

        // Proceso para calcular Pi
        while (x < tam_serie) {
            // Calcula siguiente elemento
            siguiente_ele = Math.pow(-1, x) / (2 * x + 1);
            x = x + 1;
            // Actualiza el valor de Pi
            total_pi = total_pi + siguiente_ele;
            if (x == tam_serie) {
                total_pi = total_pi * 4;
            }
        }
        
        // Presentación del resultado
        System.out.println("El valor de Pi obtenido es: " + total_pi);
    }
}
