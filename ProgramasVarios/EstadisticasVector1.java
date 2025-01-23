package estadisticasvector1;

import java.util.Scanner;

public class EstadisticasVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean datovalido = false;
        
        do {
            try {
                System.out.print("Ingrese el tamaño del vector: ");
                n = sc.nextInt();
                if (n < 0) {
                    throw new Exception ("Debe ingresar un entero positivo!");
                }
                datovalido = true;
            } catch (InputMismatchException error) {
                System.err.println("ERROR: Debe ingresar un número entero!");
                sc.nextLine();
            } catch (Exception error) {
                System.err.println("ERROR: " + error.getMessage());
            }
        } while (!datovalido);
        
        int[] vector = new int[n];

        System.out.println();
        for (int i = 0; i <= n - 1; i++) {
            datovalido = false;
            do {
                try {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    vector[i] = sc.nextInt();
                    datovalido = true;
                } catch (Exception error) {
                    System.err.println("ERROR: Debe ingresar un número entero!");
                    sc.nextLine();
                }
            } while (!datovalido);
        }
        
        mostrarVector(vector);
        System.out.println("\nEl promedio del vector es: " + promedioVector(vector));
        System.out.println("\nEl rango del vector es: " + rangoVector(vector));
    }

    //Procedimiento que muestra el contenido de un vector
    public static void mostrarVector(int[] x) {
        System.out.print("\nContenido del vector: [ ");
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }

    //Función que calcula la sumatoria de los elementos del vector
    public static float promedioVector(int x[]) {
        int suma = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            suma += x[i];
        }
        return (float) suma / x.length;
    }

    // Función que calcula el rango de un vector
    public static int rangoVector(int[] v) {
        int menor = v[0], mayor = v[0];
        for (int i = 1; i <= v.length - 1; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return mayor - menor;
    }

}