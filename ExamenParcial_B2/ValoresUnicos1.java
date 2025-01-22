package valoresunicos1;

import java.util.Scanner;

public class ValoresUnicos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim, x, y, ocurrencias;
        System.out.print("Ingrese la dimensión del vector: ");
        dim = sc.nextInt();
        int [] vector = new int[dim];
        for ( x = 0; x <= dim-1 ; x++) {
            System.out.print("Ingrese valor " + (x + 1) + ": ");
            vector[x] = sc.nextInt();
        }
        System.out.print( "Los elementos únicos son: ");
        for ( x = 0; x <= dim-1 ; x ++) {
            ocurrencias = 0;
            for ( y = 0; y <= dim-1 ; y++) {
                if (vector[x] == vector[y]) {
                    ocurrencias++;
                }
            }
            if (ocurrencias < 2) {
                System.out.print(vector[x] + " ");
            }
        }
        System.out.println();
    }   
}