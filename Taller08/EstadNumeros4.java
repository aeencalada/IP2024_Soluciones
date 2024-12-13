package estadnumeros4;

import java.util.Scanner;

public class EstadNumeros4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num, c, suma, mayor, menor, cpos, cneg;
        float promedio;
        System.out.print("¿Cuántos números desea ingresar?: ");
        N = sc.nextInt();
        suma = 0; mayor = 0; menor = 0; cpos = 0; cneg = 0;
        for (c = 1 ; c <= N ; c = c + 1) {
            System.out.print("Ingrese el valor " + c + ": ");
            num = sc.nextInt();
            suma = suma + num;
            if (c == 1 || num > mayor) {
                mayor = num;
            }
            if (c == 1 || num < menor) {
                menor = num;
            }
            if ( num > 0 ) {
                cpos = cpos + 1;
            } else if (num < 0) {
                cneg = cneg + 1;
            } 
        }
        promedio = (float) suma / N;
        System.out.println("\nLa media aritmética de los " + N + " números es: "
                + promedio);
        System.out.println("El mayor de los números ingresados es: " + mayor);
        System.out.println("El menor de los números ingresados es: " + menor);
        System.out.println("Cantidad de positivos: " + cpos);
        System.out.println("Cantidad de negativos: " + cneg);
    }
}
