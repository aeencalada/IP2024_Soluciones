package decimalabinario3;

import java.util.Scanner;

public class DecimalABinario3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, cociente;
        String binario = "";

        System.out.println("Convertir decimal a binario");
        System.out.println("---------------------------\n");
        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = sc.nextLong();
            if (num <= 0) {
                System.out.println("\n¡Debe ingresar un entero positivo!\n");
            }
        } while (num <= 0);

        System.out.println("\nEl número " + num
                + " representado en el sistema binario es " + DecToBin(num));

    }

    public static String DecToBin(long numero) {
        String binario;
        if (numero <= 1) {
            binario = "" + numero;
        } else {
            binario = DecToBin(numero / 2) + (numero % 2);
        }
        return binario;
    }
}
