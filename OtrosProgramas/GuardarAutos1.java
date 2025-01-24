package guardarautos1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarAutos1 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String placa, marca, modelo;
            int anio;
            float litros;
            int edad;
            FileWriter salida = new FileWriter("Autos1.txt", true);
            PrintWriter pw = new PrintWriter(salida);
            int n = leerEnteroPositivo("¿Cuántos autos desea registrar? ");
            for (int i = 1; i <= n; i++) {
                System.out.println("\nAUTOMOVIL " + i + ": ");
                System.out.print("- Placa: ");
                placa = sc.nextLine();
                System.out.print("- Marca: ");
                marca = sc.nextLine();
                System.out.print("- Modelo: ");
                modelo = sc.nextLine();
                System.out.print("- Año: ");
                anio = Integer.parseInt(sc.nextLine());
                System.out.print("- Litros: ");
                litros = Float.parseFloat(sc.nextLine());
                pw.println(placa + ";" + marca + ";" + modelo + ";" + anio
                        + ";" + litros);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        }
    }

    // Función que lee desde teclaco un número entero positivo
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print(mensaje);
                num = sc.nextInt();
                if (num <= 0) {
                    System.out.print("Valor no válido\n");
                } else {
                    datoValido = true;
                }
            } catch (Exception e) {
                System.out.print("Valor no válido\n");
                sc.next();
            }
        }
        return num;
    }

}
