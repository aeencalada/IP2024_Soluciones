package negativosenmatriz1;

import java.util.Scanner;

public class NegativosEnMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numFil, numCol;
        byte c;
        short[][] matriz;
        
        System.out.print("Número de filas de la matriz: ");
        numFil = sc.nextByte();
        System.out.print("Número de columnas de la matriz: ");
        numCol = sc.nextByte();
        
        matriz = new short[numFil][numCol];
        
        // Llenado de la matriz
        System.out.println("Ingrese la matriz a evaluar: ");
        for (byte i = 0; i <= numFil-1; i++) {
            for (byte j = 0; j <= numCol-1; j++) {
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextShort();
            }
        }
        
        // Conteo y conversión de negativos
        c = 0;
        for (byte i = 0; i <= numFil-1; i++) {
            for (byte j = 0; j <= numCol-1; j++) {
                if (matriz[i][j] < 0) {
                    c++;
                    matriz[i][j] = (short) (matriz[i][j] * (-1));
                }
            }
        }
        
        // Salida de resultados
        System.out.println("\nSe encontraron " + c + " elementos negativos");
        System.out.println("Matriz convertida: ");
        for (byte i = 0; i <= numFil-1; i++) {
            for (byte j = 0; j <= numCol-1; j++) {
                System.out.println("Elemento [" + (i+1) + "," + (j+1) + "]: " + matriz[i][j]);
            }
        }        

    }
    
}
