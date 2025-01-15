package sumatoriamatriz3;

import java.util.Scanner;

public class SumatoriaMatriz3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Suma de elementos sobre diagonal de matriz");
        System.out.println("==========================================\n");
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = sc.nextInt();
        int[][] matriz = leerMatrizCuadrada(n);
        System.out.println("\nSumatoria sobre diagonal principal: "
                + sumaSobreDiagonal(matriz));
    }

    // Función que lee una matriz cuadrada
    public static int[][] leerMatrizCuadrada(int tamano) {
        Scanner sc = new Scanner(System.in);
        int[][] arreglo = new int[tamano][tamano];
        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i <= tamano - 1; i++) {
            for (int j = 0; j <= tamano - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                arreglo[i][j] = sc.nextInt();
            }
        }
        return arreglo;
    }

    // Función que calcula la suma de elementos sobre diagonal principal
    public static int sumaSobreDiagonal(int[][] x) {
        int suma = 0;
        for (int i = 0; i <= x.length - 2; i++) {
            for (int j = i + 1; j <= x.length - 1; j++) {
                suma = suma + x[i][j];
            }
        }
        return suma;
    }
}
