package paises1;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Paises1 {

    public static void main(String[] args) {
        try {
            File archivo = new File("data/Paises.csv");
            Scanner entrada = new Scanner(archivo);
            String[] pais;
            ArrayList<String> nombre = new ArrayList();
            ArrayList<String> codigo = new ArrayList();
            ArrayList<Integer> poblacion = new ArrayList();
            ArrayList<Double> superficie = new ArrayList();
            ArrayList<Double> densidad = new ArrayList();
            entrada.nextLine();
            if (!entrada.hasNextLine()) {
                throw new Exception("Archivo vacio");
            }
            while (entrada.hasNextLine()) {
                pais = entrada.nextLine().split(":");
                nombre.add(pais[0]);
                codigo.add(pais[1]);
                poblacion.add(Integer.parseInt(pais[2]));
                superficie.add(Double.parseDouble(pais[3]));
            }
            entrada.close();

            for (int i = 0; i <= nombre.size() - 1; i++) {
                densidad.add(poblacion.get(i) / superficie.get(i));
            }

            int id_pais = -1;
            for (int i = 0; i <= nombre.size() - 1; i++) {
                if (superficie.get(i) > 1000) {
                    if (id_pais < 0) {
                        id_pais = i;
                    } else if (densidad.get(i) > densidad.get(id_pais)) {
                        id_pais = i;
                    }
                }
            }
            if (id_pais >= 0) {
                System.out.print("El país con más de 1000Km2 que es el "
                        + "más densamente poblado es \""
                        + nombre.get(id_pais) + " (" + codigo.get(id_pais)
                        + ")\" con una densidad poblacional de ");
                System.out.printf("%.2f Hab/Km2%n", densidad.get(id_pais));
            } else {
                System.out.println("No hay paises con más de 1000 Km2");

            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR! Datos incompletos");
        } catch (NumberFormatException e) {
            System.out.println("ERROR! Formato de datos erroneo");
        } catch (NoSuchElementException e) {
            System.out.println("ERROR! Archivo vacio");
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }

}
