package estadnumeros2;

import java.util.Scanner;

public class EstadNumeros2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int c, cp, cn;  // Contadores
        float suma_p, suma_n, suma;   // Sumatorias
        float promedio_p, promedio;   // Promedios
        System.out.println("Ingrese números enteros positivos y negativos "
                + "(para terminar digite 0): ");
        num = 1;
        suma_p = 0;
        suma_n = 0;
        cp = 0;
        cn = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num > 0) {
                cp = cp + 1;
                suma_p = suma_p + num;
            } else if (num < 0) {
                cn = cn + 1;
                suma_n = suma_n + num;
            }
        }
        c = cp + cn;
        suma = suma_p + suma_n;
        promedio_p = suma_p / cp;
        promedio = suma / c;

        System.out.println("\nCantidad de números ingresados: " + c);
        System.out.println("Cantidad de números positivos " + cp);
        System.out.println("Cantidad de números negativos " + cn);
        System.out.println("Promedio global: " + promedio);
        System.out.println("Promedio de números positivos " + promedio_p);
    }
}
