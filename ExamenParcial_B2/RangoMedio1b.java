package rangomedio1b;

import java.util.Scanner;

public class RangoMedio1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, cont;
        float mayor, menor, rango, rango_medio;

        System.out.print("¿Cuántos valores va a ingresar? : ");
        n = sc.nextShort();
        float[] numeros = new float[n];

        System.out.println("\nIngrese los valores");
        System.out.println("-------------------");
        for (short i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + " : ");
            numeros[i] = sc.nextFloat();
        }

        mayor = numeros[0];
        menor = numeros[0];
        for (short i = 0; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        rango = mayor - menor;
        rango_medio = (mayor + menor) / 2;

        cont = 0;
        for (short i = 0; i < n; i++) {
            if (numeros[i] >= rango_medio) {
                cont++;
            }
        }

        System.out.println("\nRESULTADOS");
        System.out.println("==========\n");
        System.out.printf("%-30s %8.2f%n", "Rango:", rango);
        System.out.printf("%-30s %8.2f%n", "Rango Medio (RM):", rango_medio);
        System.out.printf("%-30s %8d%n", "# Elementos por arriba del RM:", cont);
        System.out.printf("%-30s %8d%n", "# Elementos inferiores al RM:", n - cont);

    }
}
