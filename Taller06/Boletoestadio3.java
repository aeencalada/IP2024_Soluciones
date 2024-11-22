package boletoestadio3;

import java.util.Scanner;

public class Boletoestadio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char zona, genero;
        byte edad;
        float precio, pDesc;

        System.out.println("Costo de entrada a un partido de futbol");
        System.out.println("---------------------------------------\n");

        System.out.println("Zonas del estadio:");
        System.out.println("   A - Palco");
        System.out.println("   B - Tribuna");
        System.out.println("   C - Preferencia");
        System.out.println("   D - General");
        System.out.print("Ingrese la zona del estadio a la que va a asistir "
                + "(A-D): ");
        zona = sc.nextLine().charAt(0);
        System.out.print("Ingrese la edad del asistente: ");
        edad = sc.nextByte();
        sc.nextLine();
        System.out.print("Ingrese el género del asistente (M/F): ");
        genero = sc.nextLine().charAt(0);

        
        switch (zona) {
            case 'A':
                precio = 35;
                break;
            case 'B':
                precio = 25;
                break;
            case 'C':
                precio = 20;
                break;
            case 'D':
                precio = 10;
                break;
            default:
                precio = 0;
        }
        pDesc = 0;
        if (genero == 'F' && edad < 13) {
            pDesc = (float) 0.5;
        } else if (genero == 'M' && edad < 13) {
            pDesc = (float) 0.4;
        } else if (genero == 'F') {
            pDesc = (float) 0.25;
        }

        precio = precio - precio * pDesc;

        System.out.println("\nEl precio final de la entrada es $" + precio);
    }
}
