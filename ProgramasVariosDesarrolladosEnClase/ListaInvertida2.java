package listainvertida2;

import java.util.Scanner;

public class ListaInvertida2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("¿Cuántos números desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        System.out.println("\nLa lista invertida es: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}
