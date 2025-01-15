package listanumabundantes2;

import java.util.Scanner;

public class ListaNumAbundantes2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nat;
        System.out.print("Ingrese el límite de abundantes a mostrar: ");
        n = sc.nextInt();
        System.out.print("\nLos números abundantes entre 0 y " + n + " son: ");
        for (nat = 0; nat <= n; nat++) {
            //Validar si nat es abundante
            if (abundante(nat)) {
                System.out.print(nat + " ");
            }
        }
        System.out.println();
    }
    // Función que determina si un número es abundante o no
    public static boolean abundante(int x) {
        int suma_div = 0;
        for (int c = 1; c < x; c++) {
            if (x % c == 0) {
                suma_div += c;
            }
        }
        if (suma_div > x) {
            return true;
        } else {
            return false;
        }

    }
}
