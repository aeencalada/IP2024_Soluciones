package ordenarnumeros1;

import java.util.Scanner;

public class OrdenarNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux;
        System.out.println("Ordenamiento de números");
        System.out.println("-----------------------\n");
        System.out.print("¿Cuántos números desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        for (int lim = n - 1; lim >= 1; lim--) {
            for (int i = 0; i <= lim - 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                }
            }
        }

        System.out.println("\nNúmeros ordenados de menor a mayor: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(lista[i]);

        }

    }
}
