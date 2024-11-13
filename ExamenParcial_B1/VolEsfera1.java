import java.util.Scanner;

public class VolEsfera1 {

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int radius;
        float pi, volume;

        // Ingreso de datos
        System.out.println("VOLUMEN DE UNA ESFERA");
        System.out.println("=====================");
        System.out.print("\nIngrese el radio de la esfera en centímetros: ");
        radius = sc.nextInt();

        // Cálculos
        pi = (float) 3.141593;
        volume = (float) ((float) 4 / 3 * pi * Math.pow(radius, 3));

        // Salida de resultados
        System.out.println("\nEl volumen de la esfera es " + volume + " cm3");
    }

}
