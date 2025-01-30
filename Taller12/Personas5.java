package personas5;

import java.io.*;
import java.util.*;

public class Personas5 {
    // Programa que lee archivo de datos personales y calcula 
    // la edad promedio solo de mujeres
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
            if (nombres.isEmpty()){
                throw new Exception("Archivo vacio");
            }
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (edades.get(i) < 0) {
                    throw new Exception("Datos contienen edades negativas");
                }
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio: " + media);
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ERROR: Datos incompletos o mal estructurados");
        } catch (NumberFormatException e) {
            System.err.println("ERROR: Formato de números incorrecto");
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
