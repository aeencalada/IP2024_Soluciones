package recorridomatriz1;
 
import java.util.Scanner;
public class RecorridoMatriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short cneg;
        byte nfil, ncol;
        // Definición y creación de la matriz
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        nfil = sc.nextByte();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        ncol = sc.nextByte();        
        int matriz[][] = new int[nfil][ncol];
        // Poblado o llenado de la matriz
        System.out.println("\nIngrese los elementos de la matriz");
        System.out.println("----------------------------------");
        for (byte i = 0; i <= nfil - 1; i++) {
            for (byte j = 0; j <= ncol - 1; j++) {
                System.out.print("+-- Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }        
        // Proceso de convertir y contar negativos
        cneg = 0;
        for (byte i = 0; i <= nfil - 1; i++) {
            for (byte j = 0; j <= ncol - 1; j++) {
                if (matriz[i][j] < 0) {
                    cneg++;
                    matriz[i][j] = matriz[i][j] * (-1);
                }
            }
        }
        // Salida de resultados
        System.out.println("\nSe encontraron " + cneg + " elementos negativos");
        System.out.println("La matriz convertida es: ");
        for (byte i = 0; i <= nfil - 1; i++) {
            for (byte j = 0; j <= ncol - 1; j++) {
                System.out.println("+-- Elemento [" + (i+1) + "," + (j+1) + "]: " + matriz[i][j]);
            }
        }
    }
}


