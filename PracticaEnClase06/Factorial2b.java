package factorial2b;

import java.util.Scanner;

public class Factorial2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, factorial;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            N = sc.nextInt();
        } while (N < 0);

        if (N == 0) {
            factorial = 1;
        } else {
            factorial = N;
            for (int c = N - 1; c >= 2; c = c - 1) {
                factorial = factorial * c;
            }
        }

        System.out.println("El factorial de " + N + " es " + factorial);
    }
}
