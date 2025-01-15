package listafactorial1b;

import java.util.Scanner;

public class ListaFactorial1b {

    public static long factorial(int num) {
        long fact = 1;
        for (int c = 2; c <= num; c++) {
            fact *= c;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de pares a procesar: ");
        n = sc.nextShort();
        System.out.print("El factorial de los " + n + " primeros pares son: ");
        for (int c = 1; c <= n; c++) {
            System.out.print(factorial(c * 2) + " ");
        }
        System.out.println();
    }

}
