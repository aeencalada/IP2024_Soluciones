package ciudades1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Ciudades1 {

    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("data/ciudades1.txt");
            PrintWriter pw = new PrintWriter(archivo);
            
            pw.println("Quito");
            pw.println("Cuenca");
            pw.println("Loja");
            
            pw.close();
            
        } catch (Exception e) {
            System.err.println("ERROR: " + e.toString());
        }
    }    
}
