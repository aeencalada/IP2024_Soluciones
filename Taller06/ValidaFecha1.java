package validafecha1;

import java.util.Scanner;
//Validar fecha (entre 1990 y 2019) considerando años bisiestos

public class ValidaFecha1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int a, m, d;
        int dmax;  // Para almacenar el número de días del mes
        // Ingreso de fecha
        System.out.print("Ingrese el año: ");
        a = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        m = sc.nextInt();
        System.out.print("Ingrese el dia: ");
        d = sc.nextInt();
        // Validar año, mes
        if (a < 1970 || a > 2019 || m <= 0 || m > 12 || d < 1) {
            System.out.println("Fecha Incorrecta");
        } else {
            // Determinar y validar dias del mes
            dmax = 31;
            if (m == 2) {
                if (a % 4 == 0 && !(a % 100 == 0 && a % 400 != 0)) {
                    // Significa que es bisiesto
                    dmax = 29;
                } else {
                    dmax = 28;
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                dmax = 30;
            }
            if (d > dmax) {
                System.out.println("Fecha Incorrecta");
            } else {
                System.out.println("Fecha correcta");
            }
        }
    }
}
