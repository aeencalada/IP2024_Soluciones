package sumatoriamatriz1;

import java.util.Scanner;

public class SumatoriaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0;
        System.out.println("Suma de elementos sobre diagonal de matriz");
        System.out.println("==========================================\n");
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i < j) {
                    suma = suma + matriz[i][j];
                }
            }
        }
        System.out.println("\nSumatoria sobre diagonal principal: " + suma);

    }

}
