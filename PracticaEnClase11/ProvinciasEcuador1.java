package provinciasecuador1;

import java.io.*;
import java.util.Scanner;

public class ProvinciasEcuador1 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File archivo = new File("data/ProvinciasEcuador.txt");
            Scanner entrada = new Scanner(archivo);
            String[] provincia;
            if (!entrada.hasNextLine()) {
                throw new Exception("Archivo vacio");
            }
            System.out.println("PROVINCIA            POBLACION    AREA (Km2)");
            System.out.println("-------------------- ------------ ----------");
            while (entrada.hasNextLine()) {
                provincia = entrada.nextLine().split(":");
                if (provincia[0].length() > 20) {
                    provincia[0] = provincia[0].substring(0, 20);
                }
                System.out.printf("%-20s %,12d %,10d%n", provincia[0],
                        Integer.parseInt(provincia[1]),
                        Integer.parseInt(provincia[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos están incompletos");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! Formato de datos incorrecto");
        } catch (Exception e) {
            System.out.println("\nERROR! " + e.getMessage());
        } finally {
            System.out.println("\nGRACIAS POR USAR EL PROGRAMA");
        }
    }

}
