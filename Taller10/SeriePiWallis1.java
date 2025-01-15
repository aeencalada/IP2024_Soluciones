package seriepiwallis1;

import java.util.Scanner;

public class SeriePiWallis1 {

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        double pi, serie, val_ele;
        int n, c, num, den;
        // Entrada de datos
        System.out.print("Ingrese el número de elementos de la serie: ");
        n = sc.nextInt();
        // Inicialización
        serie = 1;
        num = 0;
        den = 1;
        c = 1;
        // Generación de la serie
        while (c <= n) {
            if (c % 2 == 0 ) {
                den = den + 2;
            } else {
                num = num + 2;
            }
            val_ele = (double) num / den;
            serie = serie * val_ele;
            c =  c + 1;
        }
        pi = serie * 2;         // Despejando Pi
        System.out.println("Valor de Pi obtenido: " + pi);
    }
}