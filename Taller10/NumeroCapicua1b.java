package numerocapicua1b;

import java.util.Scanner;

public class NumeroCapicua1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, num, cociente, cant_digitos;
        boolean capicua;
        System.out.print("Ingrese un número entero positivo: ");
        num = sc.nextInt();
        // Contar dígitos
        cociente = num;
        cant_digitos = 0;
        while (cociente > 0) {
            cant_digitos++;
            cociente = cociente / 10;
        }
        byte[] digitos = new byte[cant_digitos];
        // Guardar dígitos en vector
        cociente = num;
        i = cant_digitos - 1;
        while (cociente > 0) {
            digitos[i] = (byte) (cociente % 10);
            cociente = cociente / 10;
            i--;
        }
        // Validar si es capicúa
        i = 0;
        j = cant_digitos - 1;
        capicua = true;
        while (i < j) {
            if (digitos[i] != digitos[j]) {
                capicua = false;
                i = j;
            }
            i++;
            j--;
        }
        if (capicua) {
            System.out.println("\nEl número " + num + " es capicúa");
        } else {
            System.out.println("\nEl número " + num + " no es capicúa");
        }
    }

}
