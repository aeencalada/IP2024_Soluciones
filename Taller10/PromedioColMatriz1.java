package promediocolmatriz1;

import java.util.Scanner;

public class PromedioColMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, menor, suma;
        float promedio;
        System.out.print("Ingrese el número de filas: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        m = sc.nextInt();
        int[][] matriz = new int[n][m];
        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int j = 0; j <= m - 1; j++) {
            suma = 0;
            menor = matriz[0][j];
            for (int i = 0; i <= n - 1; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                suma += matriz[i][j];
            }
            promedio = (float) suma / n;
            System.out.println("Columna " + (j+1) + ": promedio = " + promedio
                    + ", valor más bajo = " + menor);
        }

    }

}
