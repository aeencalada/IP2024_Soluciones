package listanumeros1b;

import java.util.Scanner;

public class ListaNumeros1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        int i = 0;
        while (i <= 4) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
            i++;
        }
        System.out.println("\nLos números que ingresó son: ");
        i = 0;
        while (i <= 4) {
            System.out.println(lista[i]);
            i++;
        }
    }
}
