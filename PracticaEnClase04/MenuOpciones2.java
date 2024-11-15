package menuopciones2;

import java.util.Scanner;
public class MenuOpciones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, valorAbs;
        char seleccion;
        System.out.print("Ingrese número entero: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("\nOPERACIÓN A REALIZAR: ");
        System.out.println("   A) Determinar si es par");
        System.out.println("   B) Determinar si es múltiplo de 3");
        System.out.println("   C) Calcular valor absoluto");
        System.out.print("Elija una opción (A, B, o C): ");
        seleccion = sc.nextLine().charAt(0);
        switch (seleccion) {
            case 'A','a':
                if (n % 2 == 0) {
                    System.out.println("\nEl número " + n + " SI es par");
                } else {
                    System.out.println("\nEl número " + n + " NO es par");
                }
                break;
            case 'B','b':
                if (n % 3 == 0) {
                    System.out.println("\nEl número " + n + " SI es múltiplo de 3");
                } else {
                    System.out.println("\nEl número " + n + " NO es múltiplo de 3");
                }
                break;
            case 'C','c':
                valorAbs = n;
                if (n < 0) {
                    valorAbs = n * (-1);
                }
                System.out.println("\nValor absoluto de " + n + " es: " + valorAbs);
                break;
            default:
                System.out.println("\nOpción incorrecta!");
        }
    }
}
