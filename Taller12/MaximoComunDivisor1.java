package maximocomundivisor1;

import java.util.Scanner;

public class MaximoComunDivisor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el 1er número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el 2do número: ");
        int n2 = sc.nextInt();
        System.out.println("\nEl máximo común divisor es: "
                + mcd(n1, n2));
    }

    //Función que calcula el máximo común divisor de 2 número enteros positivos
    public static int mcd(int m, int n) {
        int residuo;
        residuo = m % n;
        while (residuo > 0) {
            m = n;
            n = residuo;
            residuo = m % n;
        }
        return n;
    }
}
