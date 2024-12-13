package listanumprimos1;

import java.util.Scanner;

public class ListaNumPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte ele_mostrar, encontrados;
        int num, c;
        char esPrimo;
        System.out.print("Ingrese la cantidad de primos a mostrar: ");
        ele_mostrar = sc.nextByte();
        System.out.print("\nLista números primos:");
        encontrados = 0;
        num = 2;
        while (encontrados < ele_mostrar) {
            esPrimo = 'S';
            c = num - 1;
            while (c >= 2) {
                if (num % c == 0) {
                    esPrimo = 'N';
                }
                c = c - 1;
            }
            if (esPrimo == 'S') {
                System.out.print(" " + num);
                encontrados = (byte) (encontrados + 1);
            }
            num = num + 1;
        }
        System.out.println();
    }
}
