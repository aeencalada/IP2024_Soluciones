package edadexacta1;

import java.util.Scanner;

public class EdadExacta1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio_nac, anio_act;
        byte mes_nac, dia_nac, mes_act, dia_act, edad_anios, edad_meses, edad_dias;
        System.out.println("Cálculo de la edad exacta de una persona");
        System.out.println("----------------------------------------\n");
        System.out.print("Ingrese Año de Nacimiento: ");
        anio_nac = sc.nextInt();
        System.out.print("Ingrese Mes de Nacimiento: ");
        mes_nac = sc.nextByte();
        System.out.print("Ingrese Dia de Nacimiento: ");
        dia_nac = sc.nextByte();
        System.out.print("Ingrese Año Actual: ");
        anio_act = sc.nextInt();
        System.out.print("Ingrese Mes Actual: ");
        mes_act = sc.nextByte();
        System.out.print("Ingrese Dia Actual: ");
        dia_act = sc.nextByte();

        if (dia_act < dia_nac) {
            dia_act = (byte) (dia_act + 30);
            mes_act = (byte) (mes_act - 1);
        }

        if (mes_act < mes_nac) {
            mes_act = (byte) (mes_act + 12);
            anio_act = anio_act - 1;
        }

        if (anio_act < anio_nac) {
            System.out.println("\nError, la fecha de nacimiento es mayor a la fecha actual");
        } else {
            edad_anios = (byte) (anio_act - anio_nac);
            edad_meses = (byte) (mes_act - mes_nac);
            edad_dias = (byte) (dia_act - dia_nac);
            System.out.println("\nSu edad exacta es " + edad_anios + " años con "
                    + edad_meses + " meses y " + edad_dias + " días");
        }

    }

}
