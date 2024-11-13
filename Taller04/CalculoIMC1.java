import java.util.Scanner;

public class CalculoIMC1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        String nombre;
        int pesoKg;
        float estaturaM;
        float IMC;   // Índice de Masa Corporal
        // Título     
        System.out.println("CÁLCULO DEL IMC");
        System.out.println("===============");
        // Ingreso de datos
        System.out.print("\nIngrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su peso en Kg: ");
        pesoKg = sc.nextInt();
        System.out.print("Ingrese su estatura en metros: ");
        estaturaM = sc.nextFloat();
        // Cálculo de IMC     
        IMC = (float)(pesoKg / Math.pow(estaturaM, 2));
        // Muestra de resultados     
        System.out.println("\nEl IMC de " + nombre + " es igual a: " + IMC);
    }
}
