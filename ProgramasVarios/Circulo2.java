package circulo2;

import java.util.Scanner;

public class Circulo2 {

    public static double pi = 3.14159265359;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diametro, radio;
        System.out.println("CIRCUNFERENCIA Y ÁREA DE UN CÍRCULO");
        System.out.println("===================================");
        System.out.print("\nIngrese el diametro del círculo en cm: ");
        diametro = sc.nextDouble();
        radio = diametro / 2;
        System.out.printf("\nLa circunferencia del círculo es: %,.2f cm%n",
                Circunferencia(radio));
        System.out.printf("El área del círculo es: %,.2f cm2%n",
                AreaCirculo(radio));
    }

    // Función que calcula el área de un círculo
    public static double AreaCirculo(double radio) {
        double area = pi * Math.pow(radio, 2);
        return area;
    }

    // Función que calcula la circunferencia de un circulo
    public static double Circunferencia(double radio) {
        return (2 * pi * radio);
    }
}
