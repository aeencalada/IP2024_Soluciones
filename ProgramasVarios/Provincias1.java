package provincias1;

import java.util.Scanner;

public class Provincias1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        String provincia;
        
        System.out.print("¿Cuántas provincias va a ingresar? ");
        n = sc.nextByte();
        sc.nextLine();
        
        for (byte c = 1; c <= n; c++) {
            System.out.print("Ingrese la provincia " + c + ": ");
            provincia = sc.nextLine();
            System.out.println("Viva " + provincia + "!");
        }
    }
}