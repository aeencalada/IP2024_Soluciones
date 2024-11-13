import java.util.Scanner;

public class Circulo1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        float diametro, radio, circunferencia, area;
        // Titulo
        System.out.println("CIRCUNFERENCIA Y ÁREA DE UN CÍRCULO");
        System.out.println("===================================");
        // Ingreso de datos
        System.out.print("\nIngrese el diametro del círculo en cm: ");
        diametro = sc.nextFloat();
        // Cálculos
        radio = diametro / 2;
        circunferencia = (float)(2 * 3.1416 * radio);
        area = (float)(3.1416 * Math.pow(radio, 2));
        // Presentación de resultados
        System.out.println("\nLa circunferencia del círculo es "
                + circunferencia + " cm, y el área es " + area + " cm2\n");
    }
}
