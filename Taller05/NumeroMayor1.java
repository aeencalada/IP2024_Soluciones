import java.util.Scanner;

public class NumeroMayor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, mayor;

        System.out.println("Identificar mayor de 3 números");
        System.out.println("==============================\n");

        System.out.print("Ingrese el valor 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el valor 2: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el valor 3: ");
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        System.out.println("\nEl mayor de los 3 número es " + mayor);
    }

}
