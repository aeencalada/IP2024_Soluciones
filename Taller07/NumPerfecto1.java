package numperfecto1;

import java.util.Scanner;

public class NumPerfecto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, c, suma;
        System.out.println("Validar si un número es perfecto");
        System.out.println("--------------------------------\n");
        System.out.print("Ingrese un número entero: ");
        num = sc.nextInt();
        suma = 0;
        c = num - 1;
        while (c >= 1) {
            if (num % c == 0) {
                suma = suma + c;
            }
            c = c - 1;
        }
        if (suma == num) {
            System.out.println("\nEl número " + num + " es perfecto");
        } else {
            System.out.println("\nEl número " + num + " no es perfecto");
        }
    }
}
