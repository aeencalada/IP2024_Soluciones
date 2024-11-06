package boletoestadio2;

import java.util.Scanner;

public class BoletoEstadio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char genero;
        float precio = 30;
        System.out.println("Ingrese el género de la perona (M/F): ");
        genero = sc.next().charAt(0);
        if (genero == 'F') {
            precio = (float)(precio * 0.5);
        }
        System.out.println("El precio a pagar por la entrada es: " 
                + precio);
    }
}
