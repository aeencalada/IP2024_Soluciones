package invertirvector1;

import java.util.Scanner;

public class InvertirVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, aux;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        int[] vector = new int[n];
        for (i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        i = 0;
        j = n - 1;
        while (i < j) {
            aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            i++;
            j--;
        }
        System.out.println("\nVector invertido: ");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(vector[i]);
        }
    }
}
