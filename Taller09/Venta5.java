package venta5;

import java.util.Scanner;

public class Venta5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subtotal = 0, iva, total;
        byte n;

        System.out.println("COMPRA DE ARTICULOS");
        System.out.println("===================\n");
        System.out.print("¿Cuántos artículos desea ingresar? ");
        n = sc.nextByte();

        String[] nombres = new String[n];
        int[] cantidades = new int[n];
        float[] precios = new float[n];

        System.out.println();
        for (int i = 0; i <= n - 1; i++) {
            sc.nextLine();
            System.out.println("ARTÍCULO " + (i + 1));
            System.out.print("       |-- Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("       |-- Cantidad: ");
            cantidades[i] = sc.nextInt();
            System.out.print("       |-- Precio unitario: ");
            precios[i] = sc.nextFloat();
            subtotal = subtotal + (cantidades[i] * precios[i]);
        }

        iva = subtotal * 0.12;
        total = subtotal + iva;

        System.out.println("\n\nDETALLE DE COMPRA");
        System.out.println("=================");
        System.out.println("+------+-----------------------------------------"
                + "+--------------+--------------+");
        System.out.println("| Cant | Ítem                                    "
                + "| Precio Unit. | Precio Total |");
        System.out.println("+------+-----------------------------------------"
                + "+--------------+--------------+");
        for (int i = 0; i <= n - 1; i++) {
            System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n",
                    cantidades[i], nombres[i], precios[i],
                    cantidades[i] * precios[i]);
        }

        System.out.println("+------------------------------------------------"
                + "+--------------+--------------+");
        System.out.printf("%42s %20s | %,12.2f |%n", "", "Subtotal",
                subtotal);
        System.out.printf("%42s %20s | %,12.2f |%n", "", "IVA (12%)", iva);
        System.out.printf("%42s %20s | %,12.2f |%n", "", "Total a Pagar",
                total);
        System.out.printf("%63s +--------------+%n", "");
        System.out.println("¡Gracias por su compra!\n");

    }

}
