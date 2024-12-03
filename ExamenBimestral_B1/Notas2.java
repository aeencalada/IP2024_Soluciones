package notas2;

import java.util.Scanner;

public class Notas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables 
        float nota;
        short aprob, n, c;

        System.out.println("Ingreso de notas");
        System.out.println("=================");
        // Entrada de datos 
        System.out.print("\n¿Cuántas notas desea registrar:? ");
        n = sc.nextShort();

        System.out.println();
        //Datos de entrada iniciales
        aprob = 0;
        c = 1;
        //Programacion a la defensiva
        if (n > 0) {
            // Ciclo para ingreso y categorizacion de notas 
            while (c <= n) {
                System.out.print("Ingrese la nota del alumno " + c + " : ");
                nota = sc.nextFloat();
                if (nota < 5) {
                    System.out.println("** DEFICIENTE **");
                } else if (nota < 7) {
                    System.out.println("** REGULAR **");
                } else if (nota < 8.5) {
                    System.out.println("** BUENO **");
                    aprob = (short) (aprob + 1);
                } else {
                    System.out.println("** MUY BUENO **");
                    aprob = (short) (aprob + 1);
                }
                c = (byte) (c + 1);
            }
            System.out.println("\nResultado final: " + aprob
                    + " alumnos aprobados y " + (n - aprob) + " reprobados");
        } else {
            System.out.println("La cantidad que ingresó es incorrecta");
        }
    }

}
