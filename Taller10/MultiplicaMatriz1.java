package multiplicamatriz1;

import java.util.Scanner;

public class MultiplicaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, num, f, c;
        System.out.print("Ingrese el número de filas: ");
        m = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        n = sc.nextInt();
        int[][] matriz = new int[m][n];
        System.out.println("\nIngrese los valores de la matriz [fila, columna]");
        System.out.println("------------------------------------------------");
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1)
                        + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nIngrese el número por el que se va a"
                + " multiplicar la matriz: ");
        num = sc.nextInt();

        System.out.println("\nMatriz original:");
        dibujarMatriz(matriz);

        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                matriz[i][j] = matriz[i][j] * num;
            }
        }

        System.out.println("\nMatriz resultante:");
        dibujarMatriz(matriz);

    }

    // Función que imprime una matriz en forma de cuadrícula
    public static void dibujarMatriz(int[][] arreglo) {
        for (int i = 0; i <= arreglo.length - 1; i++) {
            for (int j = 0; j <= arreglo[0].length - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= arreglo[0].length - 1; j++) {
                System.out.printf("| %3d ", arreglo[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= arreglo[0].length - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");
    }

}
