package seriepi2;

import java.util.Scanner;

public class SeriePi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum, pi, val;

        System.out.print("Ingrese el límete n de la sumatoria a procesar: ");
        n = sc.nextInt();

        sum = 0;
        for (int i = 0; i <= n; i++){
            val = (float) (Math.pow(-1, i) / (2 * i + 1));
            sum = sum + val;
        }

        pi = sum * 4;

        System.out.println("El valor de Pi es " + pi);
    }
}
