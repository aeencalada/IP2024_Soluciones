package convertidortemp1;

import java.util.Scanner;
public class ConvertidorTemp1 {
    public static void main(String[] args) {
        // Definir objetos y variables
        Scanner sc = new Scanner(System.in);
        float grados, conversion;
        String unidad;

        // Entrada de datos
        System.out.print("Ingrese el valor de la temperatura: ");
        grados = sc.nextFloat();
        sc.nextLine();
        System.out.print("Ingrese la unidad de medida (C/F): ");
        unidad = sc.nextLine();

        // Proceso
        if (unidad.equals("F") || unidad.equals("f")) {
            conversion = (float) 5 / 9 * (grados - 32);
            //conversion = 5.0 / 9 * (grados - 32);
            System.out.println("\nLa temperatura convertida a Celsius es: "
                    + conversion + " grados");
        } else {    // Se asume que si la unidad no es F entonces es C
            conversion = (float) 9 / 5 * grados + 32;
            System.out.println("\nLa temperatura convertida a Fahrenheit es: "
                    + conversion + " grados");
        }
    }
}
