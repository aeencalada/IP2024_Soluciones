package primo4;

import java.util.Scanner;

public class Primo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();
        if (primo(n)) {
            System.out.println("\nEl número " + n + " es primo.");
        } else {
            System.out.println("\nEl número " + n + " no es primo.");
        }
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
