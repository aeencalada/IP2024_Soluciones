package porcentajepares1;

import java.util.Scanner;
public class PorcentajePares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte N, c_pares;
        float p_pares;
                       
        System.out.print("¿Cuántos números va a ingresarr? ");
        N = sc.nextByte();
        
        int numeros[] = new int[N];
        
        for (byte i = 0; i <= N - 1; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nLista de pares ingresados: ");
        c_pares = 0;
        for (byte i = 0; i <= N - 1; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                c_pares++;
            }
        }
        p_pares = (float) c_pares / N * 100;
        
        System.out.println("\nPorcentaje pares: " + p_pares + "%");        
    }   
}

