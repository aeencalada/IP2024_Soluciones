package paresimpares1;

import java.util.Scanner;

public class ParesImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N , c_par, c_impar; 
        float p_par, p_impar;
        
        System.out.print("¿Cuántos números desea ingresar? ");
        N = sc.nextShort();
        // Definición y dimensionamiento del vector
        int numeros[] = new int[N];
        // Población de vector
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        //Calcular % pares e impares
        c_par = 0;
        c_impar = 0;
        for (int i = 0; i <= N - 1; i++) {
            if (numeros[i] % 2 == 0) {
                c_par = (short) (c_par + 1);
            } else {
                c_impar = (short) (c_impar + 1);
            }
        }
        p_par = (float)c_par / N * 100;
        p_impar = (float)c_impar / N * 100;
        
        System.out.println("El " + p_par + "% de números son pares y el " + 
                p_impar + "% son impares");
        
    }
    
}
