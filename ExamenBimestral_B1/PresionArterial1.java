package presionarterial1;

import java.util.Scanner;

public class PresionArterial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        short n, c, grado, b;
        float resultado;

        //Entrada de datos        
        System.out.println("Ingreso de medidas de Presión Arterial");
        System.out.println("======================================");

        System.out.print("\n¿A cuántas personas se midió la presión?: ");
        n = sc.nextShort();

        //Desarrollo del problema
        c = 1;
        b = 0;

        System.out.println("\n");

        while (c <= n) {
            System.out.print("Ingrese la medida de PA de la persona " + c + ": ");
            grado = sc.nextShort();
            if (grado < 80) {
                System.out.println("** HIPOTENSO **");
            } else if (grado <= 119) {
                System.out.println("** NORMAL **");
            } else if (grado <= 139) {
                System.out.println("** PREHIPERTENSO **");
            } else {
                System.out.println("** HIPERTENSO **");
                b = (short) (b + 1);
            }
            c = (short) (c + 1);
        }
        resultado = (float) (b * 100) / n;

        System.out.println("\nPorcentaje de HIPERTENSOS: " + resultado + "%");

    }

}
