package sueldomasalto1;

import java.util.Scanner;

public class SueldoMasAlto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = sc.nextInt();
        String[] nombres = new String[n];
        float[] sueldos = new float[n];
        //Ingreso de datos de los empleados
        System.out.println("\nIngrese nombre y sueldo de cada empleado: ");
        for (int i = 0; i <= n - 1; i++) {
            sc.nextLine(); // Lee el salto de línea de la lectura anterior
            System.out.println("Empleado " + (i + 1) + ": ");
            System.out.print("+--Nombre: ");
            nombres[i] = sc.nextLine();
            //sc.nextLine();
            System.out.print("+--Sueldo: ");
            sueldos[i] = sc.nextFloat();
        }
        //Determinar el sueldo más alto
        float sueldoMasAlto = sueldos[0];
        for (int i = 1; i <= n - 1; i++) {
            if (sueldos[i] > sueldoMasAlto) {
                sueldoMasAlto = sueldos[i];
            }
        }
        //Listar sueldo más alto y empleados que lo ganan
        System.out.println("\nEl sueldo más alto es: " + sueldoMasAlto);
        System.out.println("\nQuienes ganan el sueldo más alto son: ");
        for (int i = 0; i <= n - 1; i++) {
            if (sueldos[i] == sueldoMasAlto) {
                System.out.println(nombres[i]);
            }
        }
    }

}
