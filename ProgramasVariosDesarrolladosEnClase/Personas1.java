package personas1;

import java.io.*;
import java.util.Scanner;

public class Personas1 {

    public static void main(String[] args) {
        try {
            File archivo = new File("data/Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                System.out.println(persona[2]);
            }
            f.close();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
