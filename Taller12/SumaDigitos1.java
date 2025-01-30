package sumadigitos1;

import java.util.Scanner;

public class SumaDigitos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();

        System.out.println("\nLa suma de los dígitos del " + numero + " es "
                + sumarDigitos(numero));
    }

    // Funcion que obtiene la suma de los dígitos de un número
    public static int sumarDigitos(int x) {
        int suma;
        if (x < 10) {
            suma = x;
        } else {
            suma = x % 10 + sumarDigitos(x / 10);
        }
        return suma;
    }
}
