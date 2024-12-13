package estadnotas1;

import java.util.Scanner;
public class EstadNotas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte N, arr_prom, deb_prom;
        float suma, promedio;
        
        System.out.print("¿Cuántas notas va a registrar? ");
        N = sc.nextByte();
        
        float notas[] = new float[N];
        
        suma = 0;
        for (byte i = 0; i <= N - 1; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            notas[i] = sc.nextFloat();
            suma = suma + notas[i];
        }
        
        promedio = suma / N;
        
        arr_prom = 0;
        for (byte i = 0; i < N; i++) {
            if (notas[i] >= promedio) {
                arr_prom++;
            }
        }
        deb_prom = (byte)(N - arr_prom);
        
        System.out.println("\nNota promedio: " + promedio);
        System.out.println("Estudiantes por arriba de la media: " + arr_prom);
        System.out.println("Estudiantes por debajo de la media: " + deb_prom);
    }
    
}

