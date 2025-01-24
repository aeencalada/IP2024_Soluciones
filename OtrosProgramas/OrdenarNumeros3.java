package ordenarnumeros3;

import java.util.Scanner;

public class OrdenarNumeros3 {

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

        lista = ordenarVector(lista, n - 1);

        System.out.print("\nNúmeros ordenados de menor a mayor: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    // Función que ordena un vector con llamadas recursivas
    // El parámetro inicio indica la posisión a la que se debe mover el menor
    // elemento en cada llamada recursiva
    public static int[] ordenarVector(int[] x, int posfinal) {
        int aux;
        if (posfinal == 0) {
            return x;
        } else {
            for (int i = 0; i <= posfinal - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
            return ordenarVector(x, posfinal - 1);
        }
    }
}
