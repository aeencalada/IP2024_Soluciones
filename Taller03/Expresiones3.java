// Solución solo del caso 3
public class Expresiones3 {
    public static void main (String[] args){
        // Declaración de variables
        double espacio_min_kB;
        double espacio_min_TB;
        double espacio_total_TB;
        double espacio_total_EB;

        float tam_fotos_hd_GB;
        float tam_fotos_sd_GB;
        float tam_videos_GB;
        float total_MS;     // Cantidad de Memory Sticks

        // Cálculos Problema 2
        espacio_min_kB = 356000 * 2180;
        espacio_min_TB = espacio_min_kB / 1024 / 1024 / 1024;
        espacio_total_TB = espacio_min_TB * 60 * 24 * 365 * 10;
        espacio_total_EB = espacio_total_TB / 1024 / 1024;

        // Cálculos Problema 3
        tam_fotos_hd_GB = (float) 500 * 64 / 1024;
        tam_fotos_sd_GB = (float) 2000 * 8300 / 1024 / 1024;
        tam_videos_GB = 50 * 4;
        total_MS = ( tam_fotos_hd_GB + tam_fotos_sd_GB + tam_videos_GB ) / 32;

        // SALIDAS
        // Problema 2
        System.out.println("UNIDADES DE ALMACENAMIENTO");
        System.out.println("==========================");
        System.out.println("\nProblema 2:");
        System.out.println("Si en promedio en todo el mundo se envían 356 mil tweets por");
        System.out.println("minuto y cada tweet en promedio pesa 2180 kB. ¿De cuánto espacio ");
        System.out.println("de almacenamiento debe disponer la compañía Twitter Inc. para" + 
                           "almacenar los tweets que se escribirán en los próximos 10 años?\n");
        System.out.println("Twitter requiere en total " + espacio_total_EB + 
                           " EB para almacenar los tweets de los próximos 10 años");        

        // Problema 3
        System.out.println("\nProblema 3:");
        System.out.print("Un fotógrafo utiliza una cámara de alta definición para capturar");
        System.out.print(" fotos panorámicas en excursiones a reservas naturales. Para ");
        System.out.println("almacenar las fotos lleva Memory Sticks de 32GB cada una. " + 
                         "¿Cuántos Memory Stick debe llevar para almacenar 500 fotos de " + 
                         "alta definición de 64MB cada una, 2000 fotos de mediana " +
                         "definición de 8300KB cada una y 50 videos de 4GB cada uno?\n");
        System.out.println("El fotógrafo debe llevar " + total_MS + " Memory Sticks");

    }
}
