package listanumeros1;

import java.util.Scanner;

public class ListaNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        System.out.println("\nLos números que ingresó son: ");
        for (int i = 0; i <= 4; i++) {
            System.out.println(lista[i]);
        }
    }
}
