package cuentaprimos2;

import java.util.Scanner;

public class CuentaPrimos2 {

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

        System.out.println("De los elementos ingresados " + cp + " son primos ");
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
}
