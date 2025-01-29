package valoresunicos1c;

import java.util.Scanner;

public class ValoresUnicos1c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean unico;
        int tamano;
        System.out.print("Ingrese la longitud del vector: ");
        tamano = sc.nextInt();
        int arreglo[] = new int[tamano];
        for (int i = 0; i <= tamano - 1; i++){
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        System.out.print("Los valores que no se duplican son: ");
        for (int i = 0; i <= tamano - 1; i++){
            unico = true;
            for (int j = 0; j <= tamano - 1; j++){
                if ((i != j) && (arreglo[j] == arreglo[i])){
                    unico = false;
                }
            }
            if (unico){
                System.out.print(arreglo[i] + " ");
            }
        }
    }   
}