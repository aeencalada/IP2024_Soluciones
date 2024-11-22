package listaimpares1c;

import java.util.Scanner;

public class ListaImpares1c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, contador, impar;

        System.out.print("Ingrese la cantidad de impares a mostrar: ");
        N = sc.nextShort();

        contador = 1;
        while (contador <= N) {
            impar = (short)(contador * 2 - 1);  // Calcula impar a partir del contador
            System.out.println(impar);
            contador = (short) (contador + 1);
        }
    }
}
