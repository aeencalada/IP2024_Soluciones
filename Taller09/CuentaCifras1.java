package cuentacifras1;

import java.util.Scanner;

public class CuentaCifras1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifras = 0;
        long num, cociente;

        System.out.println("Contador de cifras");
        System.out.println("------------------\n");
        do {
            System.out.print("Ingrese número entero positivo: ");
            num = sc.nextLong();
            if (num <= 0) {
                System.out.println("\n¡Debe ingresar un entero positivo!\n");
            }
        } while (num <= 0);
        
        cociente = num;        
        while (cociente > 0) {
            cifras = cifras + 1;
            cociente = cociente / 10;
        }
        
        System.out.println("\nEl número " + num + " tiene " + cifras + " cifras");
        
    }
    
}
