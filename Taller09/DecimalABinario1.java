package decimalabinario1;

import java.util.Scanner;

public class DecimalABinario1 {

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

        cociente = num;
        while (cociente > 1) {
            binario = (cociente % 2) + binario;
            cociente = cociente / 2;                //División entera
        }
        binario = cociente + binario;

        System.out.println("\nEl número " + num
                + " representado en el sistema binario es " + binario);

    }
}
