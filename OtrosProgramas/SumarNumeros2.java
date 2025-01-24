package sumarnumeros2;

import java.util.Scanner;

public class SumarNumeros2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingrese el primer número ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número ");
        n2 = sc.nextInt();
        System.out.println("La suma es: " + sumar(n1, n2));
    }

    // Función que suma dos números
    public static int sumar(int x, int y) {
        int s;
        s = x + y;
        return s;
    }
}
