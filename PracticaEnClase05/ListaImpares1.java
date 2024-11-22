package listaimpares1;

import java.util.Scanner;

public class ListaImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, contador, impar;

        System.out.print("Ingrese la cantidad de impares a mostrar: ");
        N = sc.nextShort();

        impar = 1;          // Se inicializa con el 1er impar
        contador = 1;
        while (contador <= N) {
            System.out.println(impar);
            impar = (short) (impar + 2);      // Genera el siguiente impar
            contador = (short) (contador + 1);
        }
    }
}
