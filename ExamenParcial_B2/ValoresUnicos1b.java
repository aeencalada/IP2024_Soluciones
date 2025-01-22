package valoresunicos1b;

import java.util.Scanner;

public class ValoresUnicos1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String repetido;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        System.out.print("\nLos elementos que no se repiten son: ");
        for (int i = 0; i <= n - 1; i++) {
            repetido = "N";
            for (int p = 0; p <= n - 1; p++) {
                if (p != i && lista[p] == lista[i]) {
                    repetido = "S";
                }
            }
            if (repetido.equals("N")) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println();
    }
}
