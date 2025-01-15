package decimalabinario2;

import java.util.Scanner;

public class DecimalABinario2 {

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
        String binario = "";
        long cociente = numero;
        while (cociente > 1) {
            binario = (cociente % 2) + binario;
            cociente = cociente / 2;
        }
        binario = cociente + binario;
        return binario;
    }
}
