package guardarnombres1;

import java.io.*;

public class GuardarNombres1 {

    public static void main(String[] args) {
        try {
            FileWriter salida = new FileWriter("Nombres1.txt");
            PrintWriter pw = new PrintWriter(salida);
            String nombre1 = "Juan Pérez";
            String nombre2 = "Ana Gálvez";
            pw.println(nombre1);
            pw.println(nombre2);
            pw.close();            
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        }

    }

}
