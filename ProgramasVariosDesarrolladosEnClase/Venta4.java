package venta4;

import java.util.Scanner;

public class Venta4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        double precio1, precio2, precio3, subtotal, iva, total;
        int cantidad1, cantidad2, cantidad3;

        System.out.println("COMPRA DE ARTICULOS");
        System.out.println("===================\n");
        System.out.print("ARTÍCULO 1 |----- Nombre: ");
        nombre1 = sc.nextLine();
        System.out.print("           |----- Cantidad: ");
        cantidad1 = sc.nextInt();
        System.out.print("           |----- Precio unitario: ");
        precio1 = sc.nextFloat();
        System.out.print("\nARTÍCULO 2 |----- Nombre: ");
        sc.nextLine();
        nombre2 = sc.nextLine();
        System.out.print("           |----- Cantidad: ");
        cantidad2 = sc.nextInt();
        System.out.print("           |----- Precio unitario: ");
        precio2 = sc.nextFloat();
        System.out.print("\nARTÍCULO 3 |----- Nombre: ");
        sc.nextLine();
        nombre3 = sc.nextLine();
        System.out.print("           |----- Cantidad: ");
        cantidad3 = sc.nextInt();
        System.out.print("           |----- Precio unitario: ");
        precio3 = sc.nextFloat();

        subtotal = (cantidad1 * precio1 + cantidad2 * precio2
                + cantidad3 * precio3);
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
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n", cantidad1,
                nombre1, precio1, cantidad1 * precio1);
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n", cantidad2,
                nombre2, precio2, cantidad2 * precio2);
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n", cantidad3,
                nombre3, precio3, cantidad3 * precio3);
        System.out.println("+------------------------------------------------"
                + "+--------------+--------------+");
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "Subtotal",
                subtotal);
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "IVA (12%)", iva);
        System.out.printf("| %46s | %12s | %,12.2f |%n", "", "Tot. Pagar",
                total);
        System.out.println("+------------------------------------------------"
                + "+--------------+--------------+");
        System.out.println("Gracias por su compra!\n");
    }
}
