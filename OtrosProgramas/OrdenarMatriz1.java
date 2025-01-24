package ordenarmatriz1;

import java.util.Scanner;

public class OrdenarMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;                //filas
        int m;                //Columnas
        int t;                //Total elementos
        int c;                //Contador elementos vector
        int x;                //Variable auxiliar
        //Definir tamaño de la matriz
        System.out.print("Ingrese el número de filas de la matriz: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        m = sc.nextInt();
        int[][] matriz = new int[n][m];   //matriz (arreglo bidimensional)
        t = n * m;
        int[] vector = new int[t];        //vector (arreglo lineal)
        //Ingresar elementos a la matriz
        System.out.println("\nIngrese los valores de la matriz [fila, columna]");
        System.out.println("------------------------------------------------");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1)
                        + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        //Mostrar matriz original
        System.out.println("\nMatriz original: ");
        dibujarMatriz(matriz);
        //Guardar elementos en vector
        c = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                vector[c] = matriz[i][j];
                c++;
            }
        }
        //Ordenar vector
        vector = ordenarVector(vector);
        //Guardar elementos ordenados en matriz
        c = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                matriz[i][j] = vector[c];
                c++;
            }
        }
        //Mostrar matriz ordenada
        System.out.println("\nMatriz ordenada: ");
        dibujarMatriz(matriz);
    }

    // Función que ordena un vector de menor a mayor
    public static int[] ordenarVector(int[] x) {
        int aux;
        for (int lim = x.length - 1; lim >= 1; lim--) {
            for (int i = 0; i <= lim - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
        return x;
    }

    // Procedimiento que imprime una matriz en forma de cuadrícula
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
