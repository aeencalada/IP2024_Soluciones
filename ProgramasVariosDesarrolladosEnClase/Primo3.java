package primo3;

//Número primo
import java.util.Scanner;

public class Primo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        boolean esPrimo;
        System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();
        esPrimo = false;
        if (n >= 2 ){            
            c = n - 1;
            while (n % c != 0) {
                c = c - 1;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }        
        if (esPrimo) {
            System.out.println("\nEl número " + n + " es primo.");
        } else {
            System.out.println("\nEl número " + n + " no es primo.");
        }

    }
}
