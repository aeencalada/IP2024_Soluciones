package listaimpares1b;

import java.util.Scanner;

public class ListaImpares1b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short N, contador, numNat;

        System.out.print("Ingrese la cantidad de impares a mostrar: ");
        N = sc.nextShort();

        numNat = 1;     // Con numNat recorremos los números naturales
        contador = 1;
        while (contador <= N) {
            if (numNat % 2 == 1) {          // Significa que numNat es impar
                System.out.println(numNat);
                contador = (short) (contador + 1);  // Cuenta solo cuando encuentra un impar
            }
            numNat = (short) (numNat + 1);
        }
    }
}
