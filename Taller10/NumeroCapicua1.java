package numerocapicua1;

import java.util.Scanner;

public class NumeroCapicua1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num, num_inv, cociente, res;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Dato no válido!");
            }
        } while (num <= 0);

        num_inv = 0;
        cociente = num;

        while (cociente > 0) {
            res = cociente % 10;
            num_inv = num_inv * 10 + res;
            cociente = cociente / 10;
        }
        
        if (num == num_inv) {
            System.out.println("\nEl número " + num + " es capicúa");
        } else {
            System.out.println("\nEl número " + num + " no es capicúa");
        }
    }
    
}