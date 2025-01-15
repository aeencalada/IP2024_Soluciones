package provincias2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Provincias2 {
    public static void main(String[] args) {
        try {
            File archivo = new File("data/provincias.txt");
            Scanner sc = new Scanner(archivo);
            String[] provincia;
            int suma;
            float media;
            ArrayList<String> nombresProv = new ArrayList();
            ArrayList<Byte> cantonesProv = new ArrayList();
            
            while (sc.hasNextLine()) {
                provincia = sc.nextLine().split(",");
                nombresProv.add(provincia[0]);
                cantonesProv.add(Byte.parseByte(provincia[1]));                
            }
            sc.close();
            
            suma = 0;
            for (int i = 0; i <= nombresProv.size() - 1;i++) {
                System.out.println("Viva " + nombresProv.get(i) + " y sus " 
                        + cantonesProv.get(i) + " cantones!" );
                suma += cantonesProv.get(i);
            }
            media = (float) suma / nombresProv.size();
            
            System.out.printf("\nEn promedio son %.2f cantones por provincia%n",media);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}