package boletoautobus1;

// Boleto de autobús
import java.util.Scanner;

public class BoletoAutobus1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int kmRecorridos;
        String tipoDia;
        double precioBase, pDesc, descTotal, precioFinal;
        System.out.println("BOLETO DE AUTOBUS");
        System.out.println("=================");
        System.out.print("\nIngrese el recorrido en Km: ");
        kmRecorridos = sc.nextInt();
        System.out.print("Seleccione el tipo de día (L o F): ");
        tipoDia = sc.next();
        precioBase = kmRecorridos * 0.05;
        pDesc = 0;
        if (kmRecorridos > 80) {
            pDesc = pDesc + 15;
        }
        if (tipoDia.equals("L")) {
            pDesc = pDesc + 5;
        }
        descTotal = precioBase * pDesc / 100;
        precioFinal = precioBase - descTotal;
        System.out.println("\nEL PRECIO FINAL DEL BOLETO ES: " + precioFinal);
    }
}