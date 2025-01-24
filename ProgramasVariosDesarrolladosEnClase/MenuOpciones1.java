import java.util.Scanner;

public class MenuOpciones1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, valorAbs;
    byte seleccion;

    System.out.print("Ingrese número entero: ");
    n = sc.nextInt();
    System.out.println("\nOPERACIÓN A REALIZAR: ");
    System.out.println("   1) Determinar si es par");
    System.out.println("   2) Determinar si es múltiplo de 3");
    System.out.println("   3) Calcular valor absoluto");
    System.out.print("Elija una opción (1-3): ");
    seleccion = sc.nextByte();
    switch (seleccion) {
        case 1:
            if (n % 2 == 0) {
                System.out.println("\nEl número " + n + " SI es par");
            } else {
                System.out.println("\nEl número " + n + " NO es par");
            }
            break;
        case 2:
            if (n % 3 == 0) {
                System.out.println("\nEl número " + n + " SI es múltiplo de 3"); 
            } else {
                System.out.println("\nEl número " + n + " NO es múltiplo de 3");
            }
            break;
        case 3:
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