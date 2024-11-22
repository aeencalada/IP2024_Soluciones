package listaimpares2;

import java.util.Scanner;

public class ListaImpares2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, impar;

        System.out.print("Ingrese el límite de impares a mostrar: ");
        N = sc.nextShort();

        impar = 1;          // Se inicializa con el 1er impar
        while (impar <= N) {
            System.out.println(impar);
            impar = (short) (impar + 2);      // Genera el siguiente impar
        }
    }
}
