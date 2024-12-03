package rangosedades1;

import java.util.Scanner;

public class RangosEdades1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        byte n, c, edad, a, b;

        //Entrada de datos        
        System.out.println("Captura de edades");
        System.out.println("=================");

        System.out.print("\n¿De cuántas personas desea registrar la edad?: ");
        n = sc.nextByte();

        //Desarrollo del problema
        c = 1;
        b = 0;
        a = 0;

        System.out.println();

        while (c <= n) {
            System.out.print("Ingrese la edad de la persona " + c + ": ");
            edad = sc.nextByte();
            if (edad <= 12) {
                System.out.println("** NIÑO **");
                a++;
            } else if (edad < 18) {
                System.out.println("** ADOLECENTE **");
                a++;
            } else if (edad < 60) {
                System.out.println("** ADULTO **");
                b++;
            } else {
                System.out.println("** ADULTO MAYOR **");
                b++;
            }
            c = (byte) (c + 1);
        }

        System.out.println("\nResultado final: " + b
                + " mayores de edad y " + a + " menores de edad");

    }

}
