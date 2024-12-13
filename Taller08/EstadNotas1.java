package estadnotas1;

import java.util.Scanner;

public class EstadNotas1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        short n, c;
        float sum, prom;

        System.out.print("¿Cuántas notas va a registrar? ");
        n = sc.nextShort();

        float[] notas = new float[n];

        sum = 0;
        System.out.println("\nIngrese la nota de cada estudiante: ");
        for (short i = 0; i < n; i++) {
            System.out.print("+----Estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
            sum += notas[i];
        }

        prom = sum / n;
        c = 0;
        for (short i = 0; i < n; i++) {
            if (notas[i] >= prom) {
                c++;
            }
        }

        System.out.println("\nPromedio: " + prom);
        System.out.println("Estudiantes por arriba de la media: " + c);
        System.out.println("Estudiantes por debajo de la media: " + (n - c));

    }

}
