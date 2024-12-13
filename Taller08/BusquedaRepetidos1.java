package busquedarepetidos1;

import java.util.Scanner;

public class BusquedaRepetidos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cr = 0;
        System.out.print("¿Cuántos valores desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            if (lista[i] == lista[n - 1]) {
                cr++;
            }
        }
        System.out.print("El último elemento " + lista[n - 1] + ", se repite "
                + cr + " veces en las posiciones ");
        for (int i = 0; i <= n - 1; i++) {
            if (lista[i] == lista[n - 1]) {
                System.out.print((i + 1) + ", ");
            }
        }
        System.out.println();
    }
}
