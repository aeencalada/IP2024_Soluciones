package muestraprimos1;

import java.util.Scanner;

public class MuestraPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("¿Cuántos números va a ingresar? ");
        n = sc.nextInt();

        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        int cp = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (esPrimo(lista[i])) {
                cp++;
            }
        }

        int[] primos = new int[cp];
        int j = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (esPrimo(lista[i])) {
                primos[j] = lista[i];
                j++;
            }
        }

        primos = ordenarVector(primos);

        System.out.print("Los números primos encontrados en el vector son: ");
        for (int i = 0; i <= cp - 1; i++) {
            if (i == 0 || primos[i] != primos[i - 1]) {
                System.out.print(primos[i] + " ");
            }
        }
        System.out.println();

    }

    // Función que determina si un número es primo
    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num < 2) {
            esPrimo = false;
        } else {
            int c = num - 1;
            while (c >= 2) {
                if (num % c == 0) {
                    esPrimo = false;
                    c = 1;
                } else {
                    c = c - 1;
                }
            }
        }
        return esPrimo;
    }

    // Función que ordena un vector de enteros de menor a mayor
    public static int[] ordenarVector(int[] x) {
        int aux;
        for (int lim = x.length - 1; lim >= 1; lim--) {
            for (int i = 0; i <= lim - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
        return x;
    }

}
