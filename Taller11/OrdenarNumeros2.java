package ordenarnumeros2;

import java.util.Scanner;

public class OrdenarNumeros2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ordenamiento de números");
        System.out.println("-----------------------\n");
        System.out.print("¿Cuántos números desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        lista = ordenarVector(lista);

        System.out.print("\nNúmeros ordenados de menor a mayor: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

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
