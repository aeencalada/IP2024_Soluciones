package estadnumeros3;

import java.util.Scanner;
public class EstadNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N, contador;
        int valor, suma, mayor;
        float promedio;

        System.out.print("¿Cuántos números va a ingresar? ");
        N = sc.nextByte();

        suma = 0;
        mayor = 0;
        contador = 1;
        while (contador <= N) {
            System.out.print("Ingrese el valor " + contador + ": ");
            valor = sc.nextInt();
            if (valor > mayor) {
                mayor = valor;
            }
            suma = suma + valor;
            contador++;
        }
        promedio = (float) suma / N;

        System.out.println("\nLa media aritmética de los " + N
                + " números es " + promedio);
        System.out.println("El mayor de los números ingresados es "
                + mayor);
    }
}
