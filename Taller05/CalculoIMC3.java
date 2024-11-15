import java.util.Scanner;

public class CalculoIMC3 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        String nombre, categoria;
        int pesoKg;
        float estaturaM;
        double IMC;   // Índice de Masa Corporal
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
        // Cálculo de IMC y categoría
        IMC = pesoKg / Math.pow(estaturaM, 2);
        if (IMC < 18.49) {
            categoria = "INFRA PESO";
        } else if (IMC < 25) {
            categoria = "PESO NORMAL";
        } else if (IMC < 30) {
            categoria = "SOBRE PESO";
        } else if (IMC < 35) {
            categoria = "OBESIDAD LEVE";
        } else if (IMC < 40) {
            categoria = "OBESIDAD MEDIA";
        } else {
            categoria = "OBESIDAD MÓRBIDA";
        }
        // Muestra de resultados     
        System.out.println("\nEl IMC de " + nombre + " es igual a " + IMC);
        System.out.println("Que corresponde a la categoría de " 
                + categoria + "\n");
    }
}
