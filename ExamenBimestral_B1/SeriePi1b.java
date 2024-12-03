package seriepi1b;

import java.util.Scanner;

public class SeriePi1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        double val_pi, val_ele;
        short n, c, x;
        
        //Ingreso de datos
        System.out.print("Ingrese el número de elementos de la serie: ");
        n = sc.nextShort();
        
        //Valores iniciales
        val_pi = 3;
        x = 2;
        c = 2;
        
        //Generación de Pi
        while (c <= n){
            //Calcula elemento
            val_ele = (4 / (double)(x * (x + 1) * (x + 2)));
            //Acumula Pi
            if (c % 2 == 0) {
                val_pi = (val_pi + val_ele);
            } else {
                val_pi = (val_pi - val_ele);
            }
            x = (short) (x + 2);
            c = (short) (c + 1);
        }
        System.out.println("Valor de pi obtenido: " + val_pi);
    }
}
