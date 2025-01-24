package listapares1;

// Lista de N primeros números pares
import java.util.Scanner;

public class ListaPares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, par, c;
        System.out.print("Ingrese la cantidad de pares a mostrar: ");
        N = sc.nextInt();
        c = 1;
        while (c <= N) {
            par = c * 2;
            System.out.println(par);
            c = c + 1;
        }
    }
}

