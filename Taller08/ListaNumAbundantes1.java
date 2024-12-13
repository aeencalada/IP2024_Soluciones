package listanumabundantes1;

import java.util.Scanner;

public class ListaNumAbundantes1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nat, suma_div;
        System.out.print("Ingrese el límite de abundantes a mostrar: ");
        n = sc.nextInt();
        System.out.print("\nLos números abundantes entre 0 y " + n + " son: ");
        for (nat = 0; nat <= n; nat++) {
            //Validar si nat es abundante
            suma_div = 0;
            for (int c = 1; c < nat; c++) {
                if (nat % c == 0) {
                    suma_div += c;
                }
            }
            if (suma_div > nat) {
                System.out.print(nat + " ");
            }
        }
        System.out.println();
    }
}
