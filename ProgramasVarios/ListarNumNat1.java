import java.util.Scanner;

public class ListarNumNat1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, c;
    System.out.print("Ingrese el # de elementos a mostrar: ");
    n = sc.nextInt();
    c = 1;
    while (c <= n) {
        System.out.println(c);
        c = c + 1;
    }
  }
}