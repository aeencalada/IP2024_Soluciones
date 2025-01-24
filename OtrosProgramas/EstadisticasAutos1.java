package estadisticasautos1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticasAutos1 {

    public static void main(String[] args) {
        try {
            File archivo = new File("Autos1.txt");
            Scanner f = new Scanner(archivo);
            String[] auto;
            ArrayList<String> placas = new ArrayList();
            ArrayList<String> marcas = new ArrayList();
            ArrayList<String> modelos = new ArrayList();
            ArrayList<Integer> anios = new ArrayList();
            ArrayList<Float> litros = new ArrayList();
            while (f.hasNextLine()) {
                auto = f.nextLine().split(";");
                placas.add(auto[0]);
                marcas.add(auto[1]);
                modelos.add(auto[2]);
                anios.add(Integer.parseInt(auto[3]));
                litros.add(Float.parseFloat(auto[4]));
            }
            f.close();

            int t_autos = placas.size();
            int t_autos_kia = 0;
            for (int i = 0; i <= placas.size() - 1; i++) {
                if (marcas.get(i).toUpperCase().equals("KIA")) {
                    t_autos_kia++;
                }
            }

            System.out.println("ESTADÍSTICAS AUTOS");
            System.out.println("==================");
            System.out.println("\nTOTAL AUTOS REGISTRADOS: " + t_autos);
            System.out.println("TOTAL AUTOS MARCA KIA: " + t_autos_kia);
            System.out.println("LISTA AUTOS MARCA KIA");

            System.out.println("-------- ------------ ----- ---------- ----------------------------");
            System.out.println("Placa    Modelo       Año   Cilindraje Provincia");
            System.out.println("-------- ------------ ----- ---------- ----------------------------");
            for (int i = 0; i <= placas.size() - 1; i++) {
                if (marcas.get(i).toUpperCase().equals("KIA")) {
                    System.out.printf("%-8s %-12s %-5d %7.2fL   %-30s%n",
                             placas.get(i),
                             modelos.get(i),
                             anios.get(i),
                             litros.get(i),
                             provinciaPlaca(placas.get(i)));
                }
            }
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.getLocalizedMessage());
        }

    }

    public static String provinciaPlaca(String placa) {
        switch (placa.toUpperCase().charAt(0)) {
            case 'A':
                return "Azuay";
            case 'B':
                return "Bolívar";
            case 'U':
                return "Cañar";
            case 'C':
                return "Carchi";
            case 'X':
                return "Cotopaxi";
            case 'H':
                return "Chimborazo";
            case 'O':
                return "El Oro";
            case 'E':
                return "Esmeraldas";
            case 'W':
                return "Galápagos";
            case 'G':
                return "Guayas";
            case 'I':
                return "Imbabura";
            case 'L':
                return "Loja";
            case 'R':
                return "Los Ríos";
            case 'M':
                return "Manabí";
            case 'V':
                return "Morona Santiago";
            case 'N':
                return "Napo";
            case 'S':
                return "Pastaza";
            case 'P':
                return "Pichincha";
            case 'Q':
                return "Orellana";
            case 'K':
                return "Sucumbíos";
            case 'T':
                return "Tungurahua";
            case 'Z':
                return "Zamora Chinchipe";
            case 'Y':
                return "Santa Elena";
            case 'J':
                return "Santo Domingo de los Tsáchilas";
            default:
                return "Indeterminado";
        }

    }

}
