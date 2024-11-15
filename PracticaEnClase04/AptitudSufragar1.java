package aptitudsufragar1;

import java.util.Scanner;
public class AptitudSufragar1 {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        short anioAct, anioNac;
        byte edad;
        // Entrada de datos
        System.out.print("Ingrese su año de nacimiento: ");
        anioNac = sc.nextShort();
        System.out.print("Ingrese el año actual: ");
        anioAct = sc.nextShort();
        System.out.println();        
        // Proceso
        edad = (byte) (anioAct - anioNac);
        if (edad < 0) {
            System.out.println("Datos incorrectos: "
                    + "El año de nacimiento no puede ser mayor al año actual");
        } else if (edad < 16) {
            System.out.println("Usted NO puede votar");
        } else if (edad < 18) {
            System.out.println("Usted puede votar OPCIONALMENTE");
        } else if (edad < 65) {
            System.out.println("Usted debe votar OBLIGATORIAMENTE");
        } else {
            System.out.println("Usted puede votar OPCIONALMENTE");
        }
    }
}
