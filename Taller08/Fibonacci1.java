package fibonacci1;

import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        int fib_anterior, fib_nuevo, proximo;
        System.out.print("Ingrese los elementos fibonacci a mostrar: ");
        n = sc.nextByte();
        fib_anterior = 0;
        System.out.print("\nSerie fibonacci: " + fib_anterior);
        fib_nuevo = 1;
        for (int c = 2; c <= n; c = c + 1) {
            System.out.print(" " + fib_nuevo);
            proximo = fib_anterior + fib_nuevo;
            fib_anterior = fib_nuevo;
            fib_nuevo = proximo;
        }
        System.out.println();
    }
}
