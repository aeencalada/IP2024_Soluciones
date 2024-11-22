package validadivisor1;

// Validar si un número es divisor de otro
import java.util.Scanner;

public class ValidaDivisor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingrese el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        if (n1 % n2 == 0) {
            System.out.println("\nEl número " + n2 + " es divisor de " + n1);
        } else if (n2 % n1 == 0) {
            System.out.println("\nEl número " + n1 + " es divisor de " + n2);
        } else {
            System.out.println("\nLos números no son divisibles");
        }
    }
}
