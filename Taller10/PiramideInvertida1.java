package piramideinvertida1;

import java.util.Scanner;

public class PiramideInvertida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte alt;
        String linea;
        System.out.print("Ingrese la altura de la pirámide: ");
        alt = sc.nextByte();
        System.out.println("\nPirámide:\n");
        for (short a = alt; a >= 1; a--) {
            linea = "";
            for (short b = 1; b <= a * 2 - 1; b++) {
                linea = linea + "*";
            }
            System.out.printf("%" + (alt + a - 1) + "s\n", linea);
        }
    }

}
