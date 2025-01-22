package ocurrenciasenvector1;

import java.util.Scanner;

public class OcurrenciasEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ocurrencias en vector");
        System.out.println("---------------------\n");
        System.out.print("¿Cuántos números desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.print("\nVector ingresado: ");
        mostrarVector(lista);
        listarRepeticiones(lista);
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

    public static void listarRepeticiones(int[] x) {
        x = ordenarVector(x);
        int valor, ocurrencias;
        System.out.println("\nValor   Ocurrencias");
        System.out.println("-----   -----------");
        valor = x[0];
        ocurrencias = 1;
        for (int i = 1; i <= x.length - 1; i++) {
            if (x[i] == valor) {
                ocurrencias = ocurrencias + 1;
            } else {
                System.out.printf("%5d   %11d%n", valor, ocurrencias);
                valor = x[i];
                ocurrencias = 1;
            }
        }
        System.out.printf("%5d   %11d%n", valor, ocurrencias);
    }

    public static void mostrarVector(int[] x) {
        System.out.print("[ ");
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }
}
