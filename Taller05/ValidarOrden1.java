import java.util.Scanner;

public class ValidarOrden1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Validar orden de 3 números");
        System.out.println("==========================\n");
        
        System.out.print("Ingrese el valor 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el valor 2: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el valor 3: ");
        n3 = sc.nextInt();

        if (n1 <= n2 && n2 <= n3) {
            System.out.println("\nLos números se ingresaron en orden ascendente");
        } else {
            System.out.println("\nLos números no se ingresaron en orden ascendente");
        }

    }

}
