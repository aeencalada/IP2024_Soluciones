package listafactorial1c;

import java.util.Scanner;

public class ListaFactorial1c {

    public static long factorial(int num) {
        long fact = 1;
        for (int c = 2; c <= num; c++) {
            fact *= c;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, par;
        System.out.print("Ingrese la cantidad de pares a procesar: ");
        n = sc.nextShort();
        System.out.print("El factorial de los " + n + " primeros pares son: ");
        par = 0;
        for (int c = 1; c <= n; c++) {
            par += 2;
            System.out.print(factorial(par) + " ");
        }
        System.out.println();
    }

}
