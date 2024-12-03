package calidadaire1;

import java.util.Scanner;

public class CalidadAire1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        short n, c, aqi, b;
        float resultado;

        //Entrada de datos        
        System.out.println("Registro del Índice de calidad de áire (AQI) en ciudades");
        System.out.println("========================================================");

        System.out.print("\n¿De cuantas ciudades va a ingresar la medida de AQI?: ");
        n = sc.nextShort();

        //Desarrollo del problema
        c = 1;
        b = 0;

        System.out.println("\n");

        while (c <= n) {
            System.out.print("Ingrese la medida de AQI para la ciudad " + c + ": ");
            aqi = sc.nextShort();
            if (aqi <= 50) {
                System.out.println("** BUENO **");
            } else if (aqi <= 100) {
                System.out.println("** MODERADO **");
            } else if (aqi <= 150) {
                System.out.println("** INSALUBRE PARA GRUPOS SENSIBLES **");
                b = (short) (b + 1);
            } else {
                System.out.println("** INSALUBRE **");
                b = (short) (b + 1);
            }
            c = (short) (c + 1);
        }
        resultado = (float) (b * 100) / n;

        System.out.println("\nPorcentaje de ciudades insalubres: " + resultado + "%");

    }

}
