package leerarchivo2;

import java.io.*;
import java.util.Scanner;

public class LeerArchivo2 {

    public static void main(String[] args) {
        try {
            File archivo = new File("Notas.txt");
            Scanner f = new Scanner(archivo);
            double suma = 0;
            while (f.hasNextDouble()) {
                suma += f.nextDouble();
            }
            f.close();
            System.out.println("La suma total es " + suma);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

    }

}
