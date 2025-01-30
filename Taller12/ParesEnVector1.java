package paresenvector1;

import java.util.Scanner;

public class ParesEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números va a ingresar?: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("\n" + contarPares(vector)
                + " elementos del vector son números pares");
    }

    // Función que cuenta los pares de un vector
    public static int contarPares(int[] v) {
        int contador = 0;
        for (int i = 0; i <= v.length - 1; i++) {
            if (v[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

}
