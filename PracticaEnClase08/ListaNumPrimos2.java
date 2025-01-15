package listanumprimos2;

import java.util.Scanner;

public class ListaNumPrimos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el límite del rango de números a buscar: ");
        n = sc.nextInt();
        
        System.out.print("Los primos entre 0 y " + n + " son: ");
        for (int c = 0; c <= n; c++) {
            if (primo(c)){
                System.out.print(c + " ");
            }
        }
        System.out.println();
        
    }

    // Función que determina si un número es primo
    public static boolean primo(int num) {
        boolean esPrimo = false;
        int c;
        if (num >= 2 ){            
            c = num - 1;
            while (num % c != 0) {
                c = c - 1;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }

}
