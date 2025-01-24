package analisistemperaturas1;

import java.util.Scanner;

public class AnalisisTemperaturas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dias[] = new String[7];
        float tMin[] = new float[7];
        float tMax[] = new float[7];
        float medias[] = new float[7];
        float tmayor, tmenor, tbuscar;
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";
        System.out.println("INGRESE LAS TEMPERATURAS DIARIAS EN ºC");
        System.out.println("--------------------------------------");
        for (int i = 0; i <= 6; i++) {
            do {
                System.out.println("Temperaturas del día " + dias[i]);
                System.out.print("Mínima: ");
                tMin[i] = sc.nextFloat();
                System.out.print("Máxima: ");
                tMax[i] = sc.nextFloat();
                if (tMin[i] > tMax[i]) {
                    System.out.println("ERROR! la temperatura máxima no puede "
                            + "ser menor a la mínima");
                }
            } while (tMin[i] > tMax[i]);
            medias[i] = (tMin[i] + tMax[i]) / 2;
        }
        tmayor = tMax[0];
        tmenor = tMin[0];
        for (int i = 0; i <= 6; i++) {
            if (tMax[i] > tmayor) {
                tmayor = tMax[i];
            }
            if (tMin[i] < tmenor) {
                tmenor = tMin[i];
            }
        }
        System.out.println("\nRESULTADOS");
        System.out.println("----------");
        System.out.println("Temperatura media por día:");
        for (int i = 0; i <= 6; i++) {
            System.out.println(dias[i] + ": " + medias[i] + " ºC");
        }
        System.out.print("\nLa temperatura más baja fue de " + tmenor
                + " ºC y se regitró el(los) día(s): ");
        for (int i = 0; i <= 6; i++) {
            if (tMin[i] == tmenor) {
                System.out.print(dias[i] + ", ");
            }
        }
        System.out.print("\n\nLa temperatura más alta fue de " + tmayor
                + " ºC y se regitró el(los) día(s): ");
        for (int i = 0; i <= 6; i++) {
            if (tMax[i] == tmayor) {
                System.out.print(dias[i] + ", ");
            }
        }
        System.out.print("\n\nIngrese la temperatura a buscar: ");
        tbuscar = sc.nextFloat();
        System.out.print("\nDía(s) en que la temperatura media róndo en +/- 2ºC"
                + " los " + tbuscar + " grados: ");
        for (int i = 0; i <= 6; i++) {
            if (tbuscar <= medias[i] + 2 && tbuscar >= medias[i] - 2) {
                System.out.print(dias[i] + ", ");
            }
        }
        System.out.println();
    }
}
