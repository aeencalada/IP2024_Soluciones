package leerarchivo1;

import java.io.*;
import java.util.Scanner;

public class LeerArchivo1 {

    public static void main(String[] args) {
        try {
            File archivo = new File("MiArchivo.txt");
            Scanner f = new Scanner(archivo);
            while (f.hasNextLine()) {
                System.out.println("Hola " + f.nextLine());
            }
            f.close();
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.getMessage());
        }

    }

}
