package calculadora1;

import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        char operacion;
        float resultado;

        System.out.println("Costo de entrada a un partido de futbol");
        System.out.println("---------------------------------------\n");

        System.out.print("Ingrese el valor 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el valor 2: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese la operación a realizar "
                + "(+ , - , * , / , %): ");
        sc.nextLine();
        operacion = sc.nextLine().charAt(0);

        switch (operacion) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = (float) n1 / n2;
                break;
            case '%':
                resultado = n1 % n2;
                break;
            default:
                resultado = 0;
                operacion = ' ';
        }

        if (operacion == ' ') {
            System.out.println("\nOperación incorrecta!");
        } else {
            System.out.println("\n" + n1 + " " + operacion + " " + n2 
                    + " = " + resultado);
        }
    }

}
