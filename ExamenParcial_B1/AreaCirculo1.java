import java.util.Scanner;

public class AreaCirculo1 {

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int radio;
        float pi, area;

        //Ingreso de datos
        System.out.println("AREA DE UN CIRCULO");
        System.out.println("==================");
        System.out.print("\nIngrese el radio del circulo en milimetros: ");
        radio = sc.nextInt();

        // Calculos
        pi = (float) 3.141593;
        area = (float) (pi * Math.pow(radio, 2));

        // Salida de resultados
        System.out.println("\nEl area del circulo es " + area + " mm2");
    }

}
