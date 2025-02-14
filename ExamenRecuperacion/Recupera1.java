package recupera1;

import java.util.Scanner;

public class Recupera1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador, denominador, N; 
        float suma;
        
        System.out.print("Ingrese la cantidad de elementos a procesar: ");
        N = sc.nextInt();
        
        denominador = 2;
        suma = 0;
        for (numerador = 1; numerador <= N; numerador++) {
            suma = suma + (float) numerador / denominador;
            denominador = numerador + denominador;
        }
        
        System.out.printf("El resultado de la sucesión es: %.4f%n", suma);
    }
    
}
