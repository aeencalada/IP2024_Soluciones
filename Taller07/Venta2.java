package venta2;

import java.util.Scanner;

public class Venta2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, c;
        float precio;
        double suma, total;

        System.out.println("COMPRA DE ARTICULOS");
        System.out.println("===================\n");
        System.out.print("Ingrese la cantidad de atículos adquiridos: ");
        N = sc.nextInt();
        suma = 0;
        c = 1;
        while (c <= N) {
            System.out.print("Ingrese el precio del artículo " + c + ": ");
            precio = sc.nextFloat();
            suma = suma + precio;
            c = c + 1;
        }
        total = suma * 1.12;

        System.out.println("\nGracias por su compra!");
        System.out.println("El total a pagar incluido el IVA es: USD " + total);
    }    
}
