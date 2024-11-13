import java.util.Scanner;

public class CalculoIMC2 {

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
        System.out.println("\nTabla IMC*");
        System.out.println("+----------------+------------------+");
        System.out.println("| Valor del IMC  | Estado           |");
        System.out.println("+----------------+------------------+");
        System.out.println("| Menos de 18.49 | Infra Peso       |");
        System.out.println("| 18.50 a 24.99  | Peso Normal      |");
        System.out.println("| 25 a 29.99     | Sobre Peso       |");
        System.out.println("| 30 a 34.99     | Obesidad Leve    |");
        System.out.println("| 35 a 39.99     | Obesidad Media   |");
        System.out.println("| 40 o más       | Obesidad Mórbida |");
        System.out.println("+----------------+------------------+");
        System.out.println("*Clasificación de la OMS de acuerdo con el IMC\n");
    }
}
