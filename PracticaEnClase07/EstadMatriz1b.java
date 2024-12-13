package estadmatriz1b;

import java.util.Scanner;
public class EstadMatriz1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte nfil, ncol;
        short c_pares, s_pares, c_impares, s_impares, s_ultimacol;
        float p_pares, p_impares, p_general;
        // Ingresar el tamaño de la matriz
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        nfil = sc.nextByte();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        ncol = sc.nextByte();
        // Deefinir y dimensionar matriz
        int matriz[][] = new int[nfil][ncol];
        // Poblado de la matriz
        System.out.println("\nIngrese los elementos de la matriz");
        System.out.println("----------------------------------");
        for (byte i = 0; i <= nfil - 1; i++) {
            for (byte j = 0; j <= ncol - 1; j++) {
                System.out.print("+-- Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        // Proceso para calcular las estadísticas
        c_pares = 0; s_pares = 0; c_impares = 0; s_impares = 0; s_ultimacol = 0;
        for (byte i = 0; i <= nfil - 1; i++) {
            for (byte j = 0; j <= ncol - 1; j++) {
                if (matriz[i][j] % 2 == 0) {    // Significa que es par
                    c_pares++;
                    s_pares += matriz[i][j];
                } else {                        // Significa que es impar
                    c_impares++;
                    s_impares += matriz[i][j];
                }
            }
            s_ultimacol += matriz[i][ncol - 1];
        }
        p_pares = (float) s_pares / c_pares;
        p_impares = (float) s_impares / c_impares;
        p_general = (float) (s_pares + s_impares) / (nfil * ncol);
        // Mostrar resultados
        System.out.println("\nPromedio pares: " + p_pares);
        System.out.println("Promedio impares: " + p_impares);
        System.out.println("Promedio general: " + p_general);
        System.out.println("Sumatoria última columna: " + s_ultimacol);
    }
}

