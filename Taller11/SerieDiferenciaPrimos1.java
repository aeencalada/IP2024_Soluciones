package seriediferenciaprimos1;

import java.util.Scanner;

public class SerieDiferenciaPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int anterior;           //Para primo anterior
        int siguiente;          //Para primo siguiente
        int diferenciaPrimos;
        int c;                  //Para contar elementos encontrados
        System.out.print("Ingrese los elementos a mostrar de la serie: ");
        n = sc.nextByte();
        anterior = 2;
        siguiente = anterior + 1;
        c = 0;
        System.out.println("\nLos " + n + " primeros elementos de la serie son: ");
        while (c < n) {
            if (primo(siguiente)) {
                diferenciaPrimos = siguiente - anterior;
                System.out.print(diferenciaPrimos + " ");
                anterior = siguiente;
                c++;
            }
            siguiente++;
        }
        System.out.println();
    }

    // Función que determina si un número es primo
    public static boolean primo(int num) {
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
