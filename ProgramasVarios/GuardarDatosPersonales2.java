package guardardatospersonales2;

import java.io.*;
import java.util.Scanner;

public class GuardarDatosPersonales2 {

    public static void main(String[] args) {
        try {
            FileWriter salida = new FileWriter("DatosPersonales2.txt", true);
            PrintWriter pw = new PrintWriter(salida);
            Scanner sc = new Scanner(System.in);
            String nombre;
            int edad;
            System.out.print("¿Cuántas personas desea ingresar? ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                sc.nextLine();
                System.out.print("Nombre Persona " + i + ": ");
                nombre = sc.nextLine();
                System.out.print("Edad Persona " + i + ": ");
                edad = sc.nextInt();
                pw.println(nombre + "," + edad);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        }
    }

}
