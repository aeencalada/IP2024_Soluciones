package negativosenmatriz1;

import java.util.Scanner;

public class NegativosEnMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        System.out.println("Ingrese los elementos de la matriz [fila, columna]");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Elemento [" + (i + 1) + ","
                        + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int c = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * -1;
                    c++;
                }
            }
        }
        System.out.println("\nSe encontraron " + c + " elementos negativos");
    }
}
