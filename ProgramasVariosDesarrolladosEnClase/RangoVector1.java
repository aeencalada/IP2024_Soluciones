package rangovector1;

import java.util.Scanner;

public class RangoVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números va a ingresar?: ");
        int n = sc.nextInt();
        float[] vector = new float[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextFloat();
        }

        System.out.println("\nEl rango del vector es " + rango(vector));
    }

    // Función que calcula el rango de un vector
    public static float rango(float[] v) {
        float menor = v[0], mayor = v[0];
        for (int i = 1; i <= v.length - 1; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return mayor - menor;
    }

}
