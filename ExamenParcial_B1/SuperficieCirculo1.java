import java.util.Scanner;

public class SuperficieCirculo1 {

    public static void main(String[] args) {
        // Sección de declaraciones
        Scanner sc = new Scanner(System.in);
        int diametro;
        float radio, superficie;

        // Entrada de datos
        System.out.println("SUPERFICIE DE UN CIRCULO");
        System.out.println("========================");
        System.out.print("\nIngrese el diámetro del círculo en milímetros: ");
        diametro = sc.nextInt();

        // Proceso
        radio = (float) diametro / 2;
        superficie = (float) (3.141593 * Math.pow(radio, 2));

        // Muestra de datos
        System.out.println("Superficie del cirulo " + superficie + " mm2");

    }

}
