package mult3pares1;

import java.util.Scanner;

public class Mult3Pares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, c;
        System.out.print("Ingrese la cantidad de elementos a mostrar: ");
        n = sc.nextInt();
        x = 0;
        c = 0;
        while (c < n) {
            x = x + 2;
            if (x % 3 != 0) {
                System.out.println(x);
                c = c + 1;
            }
        }
    }
}
