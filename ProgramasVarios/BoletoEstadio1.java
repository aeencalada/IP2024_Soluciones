package boletoestadio1;

import java.util.Scanner;

public class BoletoEstadio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero;
        float precio = 30;
        byte edad;
        System.out.print("Ingrese la edad: ");
        edad = sc.nextByte();
        System.out.print("Ingrese el género de la perona (M/F): ");
        genero = sc.next();
        if (genero.equals("F")) {
            precio = (float) (precio * 0.5);
        }
        System.out.println("El precio a pagar por la entrada es: " 
                + precio);
    }
}
