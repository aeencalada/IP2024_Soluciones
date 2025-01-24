package listapares2;

import java.util.Scanner;

public class ListaPares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, par;
        System.out.print("Ingrese # de pares a mostrar: ");
        N = sc.nextInt();
        for (int c = 1; c <= N; c = c + 1) {
            par = c * 2;
            System.out.println(par);
	 }
    }
}
