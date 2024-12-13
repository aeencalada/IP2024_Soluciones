package venta3;

public class Venta3 {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        double precio1, precio2, precio3, subtotal, iva, total;
        int cantidad1, cantidad2, cantidad3;

        nombre1 = "Televisor LG";
        cantidad1 = 4;
        precio1 = 765.87;
        nombre2 = "Computador Asus";
        cantidad2 = 10;
        precio2 = 2324.56;
        nombre3 = "Juego de Sala";
        cantidad3 = 7;
        precio3 = 655.99;

        subtotal = (cantidad1 * precio1 + cantidad2 * precio2
                + cantidad3 * precio3);
        iva = subtotal * 0.12;
        total = subtotal + iva;

        System.out.println("DETALLE DE COMPRA");
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
