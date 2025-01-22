package fibonacci2;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte pos;
        System.out.print("Ingrese la posición del fibonacci a mostrar: ");
        pos = sc.nextByte();
        System.out.println("\nEl fibonacci en la posición " + pos + " es el "
                + fibonacci(pos));

    }

    // Función que retorna el n-ésimo número de la sucesión fibonacci
    public static int fibonacci(int x) {
        int fib;
        if (x == 1) {
            fib = 0;
        } else if (x == 2) {
            fib = 1;
        } else {
            fib = fibonacci(x - 2) + fibonacci(x - 1);
        }
        return fib;
    }
}
