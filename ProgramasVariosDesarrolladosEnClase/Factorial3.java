package factorial3;

// Cálculo del Factorial
import java.util.Scanner;

public class Factorial3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        System.out.println("\nEl factorial de " + numero + " es "
                + factorial(numero));
    }

    // Función que calcula el factorial de un número con recursividad
    public static long factorial(int x) {
        long fact;
        if (x == 0) {
            // Se termina la recursión
            fact = 1;
        } else {
            // Se llama a si misma la función con el parámetro restado en 1
            fact = x * factorial(x - 1);
        }
        return fact;
    }
}
