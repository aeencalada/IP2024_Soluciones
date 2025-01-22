package guardarnombres2;

import java.io.*;
import java.util.Scanner;

public class GuardarNombres2 {

    public static void main(String[] args) {
        try {
            FileWriter salida = new FileWriter("Nombres2.txt");
            PrintWriter pw = new PrintWriter(salida);
            Scanner sc = new Scanner(System.in);
            String nombre;
            int n;
            System.out.print("¿Cuántos nombres desea ingresar? ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el nombre " + i + ": ");
                nombre = sc.nextLine();
                pw.println(nombre);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        }

    }

}
