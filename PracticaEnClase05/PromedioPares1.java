package promediopares1;

import java.util.Scanner;

public class PromedioPares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, contador, par, suma;
        float promedio;

        System.out.print("Ingrese la cantidad de pares a procesar: ");
        N = sc.nextShort();

        par = 2;
        suma = 0;
        contador = 1;
        while (contador <= N) {
            suma = (short) (suma + par);     // Se puede escribir suma += par
            par += 2;
            contador++;
        }
        promedio = (float) suma / N;

        System.out.println("\n Para los " + N
                + " primeros numeros pares, la suma es " + suma
                + " y el promedio es " + promedio);
    }
}
