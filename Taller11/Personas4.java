package personas4;

import java.io.*;
import java.util.*;

public class Personas4 {

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
            System.out.println("Listado personas de más de 50 años");
            System.out.println("==================================");
            System.out.println("Nombre               Edad");
            System.out.println("-------------------  ----");
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (edades.get(i) > 50) {
                    System.out.printf("%-20s %-2d%n", nombres.get(i), 
                            edades.get(i));
                }
            }
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.getLocalizedMessage());
        }
    }
}
