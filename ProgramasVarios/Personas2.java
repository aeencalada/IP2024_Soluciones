package personas2;

import java.io.*;
import java.util.*;

public class Personas2 {

    public static void main(String[] args) {
        try {
            File archivo = new File("data/Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);
                edades.add(Integer.parseInt(persona[2]));
            }
            f.close();
            int suma = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                suma += edades.get(i);
            }
            double media = (double) suma / edades.size();
            System.out.println("Promedio: " + media);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
