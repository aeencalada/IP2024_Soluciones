package factorial1;

// Cálculo del Factorial
import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, c;
        long factorial;
        
        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        factorial = 1;
        c = 2;
        while (c <= numero) {
            factorial = factorial * c;
            c = c + 1;
        }
        System.out.println("\nEl factorial de " + numero + " es " + factorial);
    }
    
}
