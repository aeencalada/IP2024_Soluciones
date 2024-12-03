package calculopi1a;

import java.util.Scanner;

public class CalculoPi1a {

    public static void main(String[] args) {
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        double constante_pi, elemento;
        int N, c, x;

        // Lectura de tamaño de la serie
        System.out.print("¿Cuántos elementos de la serie va a procesar? ");
        N = sc.nextInt();

        // Inicialización de variables
        constante_pi = 0;
        x = 0;
        c = 1;

        // Cálculo de la constante pi, y muestra del resultado
        while (c <= N) {
            //Calcula elemento
            elemento = Math.pow(-1, x) / (2 * x + 1);
            //Calcula Pi
            constante_pi = constante_pi + elemento;
            x = x + 1;
            c = c + 1;
        }
        constante_pi = 4 * constante_pi;
        
        System.out.println("Constante Pi calculada: " + constante_pi);
    }
}
