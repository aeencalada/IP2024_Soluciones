package promediopares1b;

import java.util.Scanner;

public class PromedioPares1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, contador, par, suma;
        float promedio;

        System.out.print("Ingrese la cantidad de pares a procesar: ");
        N = sc.nextShort();

        suma = 0;
        contador = 1;
        while (contador <= N) {
            par = (short) (contador * 2);  // Se genera el par a partir del contador
            suma += par;
            contador++;
        }
        promedio = (float) suma / N;

        System.out.println("\n Para los " + N
                + " primeros numeros pares, la suma es " + suma
                + " y el promedio es " + promedio);
    }
}
