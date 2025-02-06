// Listar los números cubos NO abundantes existentes entre N y M

package listaenrango2;

import java.util.Scanner;

public class ListaEnRango2 {

    public static void main(String[] args) {
        int n, m, cc;
        n = leerLimiteRango("Ingrese el valor inicial del rango a buscar: ", 0);
        m = leerLimiteRango("Ingrese el valor final del rango a buscar: ", n);

        cc = 0;
        for (int i = n; i <= m; i++) {
            if (esCubo(i) && !abundante(i)) {
                cc++;
                if (cc == 1) {
                    System.out.print("\nLos números cubos no abundantes entre "
                            + n + " y " + m + " son: " + i);
                } else {
                    System.out.print(", " + i);
                }
            }
        }
        if (cc == 0) {
            System.out.print("\nNo existen números cubos no abundantes entre "
                    + n + " y " + m);
        }
        System.out.println();
    }

    public static int leerLimiteRango(String mensaje, int desde) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean datoValido = false;
        while (!datoValido) {
            System.out.print(mensaje);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num < desde) {
                    throw new Exception("Debe ser mayor o igual a " + desde);
                }
                datoValido = true;
            } catch (NumberFormatException e) {
                System.err.println("Dato no válido: Debe ser valor entero\n");
            } catch (Exception e) {
                System.err.println("Dato no válido: " + e.getMessage() + "\n");
            }
        }
        return num;
    }

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

    public static boolean esCubo(int num) {
        int c;
        c = 0;
        while (Math.pow(c, 3) < num) {
            c++;
        }
        return Math.pow(c, 3) == num;
    }

}
