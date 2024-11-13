import java.util.Scanner;

public class CapacidadEsfera1 {

    public static void main(String[] args) {
        // Sección de declaraciones
        Scanner sc = new Scanner(System.in);
        int diameter;
        float radius, capacity;

        // Entrada de datos
        System.out.println("CAPACIDAD DE UNA ESFERA");
        System.out.println("=======================");
        System.out.print("\nIngrese el diámetro de la esfera en milímetros: ");
        diameter = sc.nextInt();

        // Proceso
        radius = diameter / 2;
        capacity = (float) ((float) 4 / 3 * 3.141593 * Math.pow(radius, 3));

        // Muestra de datos
        System.out.println("\nLa capacidad de la esfera es " + capacity + " mm3");
    }

}
