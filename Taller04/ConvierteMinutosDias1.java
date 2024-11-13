import java.util.Scanner;

public class ConvierteMinutosDias1 {

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int total_minutos, dias, horas, resto_minutos;
        // Titulo
        System.out.println("Conversión de minutos a días, horas y minutos");
        System.out.println("=============================================");
        // Entrada de datos
        System.out.print("\nIngrese la cantidad total de minutos: ");
        total_minutos = sc.nextInt();
        // Cálculos
        dias = total_minutos / 1440;
        resto_minutos = total_minutos % 1440;
        horas = resto_minutos / 60;
        resto_minutos = resto_minutos % 60;
        // Presentación de resultados
        System.out.println("\n" + total_minutos + " minutos equivale a: "
                + dias + " días, "
                + horas + " horas, "
                + resto_minutos + " minutos\n");
    }
}
