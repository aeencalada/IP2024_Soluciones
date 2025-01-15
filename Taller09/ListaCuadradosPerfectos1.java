package listacuadradosperfectos1;

import java.util.Scanner;

public class ListaCuadradosPerfectos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.print("Ingrese el límite inferior: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el límite superior: ");
        int b = sc.nextInt();
        System.out.println("\nLos cuadrados perfectos entre " + a + " y "
                + b + " son:");
        for (int num = a; num <= b; num++) {
            c = 1;
            while (Math.pow(c, 2) < num) {
                c++;
            }
            if (Math.pow(c, 2) == num) {
                // Significa que num es cuadrado perfecto
                System.out.println(num);
            }
        }

    }

}
