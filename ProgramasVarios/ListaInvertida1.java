package listainvertida1;

import java.util.Scanner;

public class ListaInvertida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        System.out.println("\nLa lista invertida es: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}
