import java.util.Scanner;

public class DiasMes1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte mes;
        System.out.println("Consultar dias del mes");
        System.out.println("----------------------\n");
        System.out.print("Ingrese un mes (1-12): ");
        mes = sc.nextByte();
        if (mes < 1 || mes > 12) {
            System.out.println("\nNúmero de mes incorrecto");
        } else if (mes == 2) {
            System.out.println("\nEl mes " + mes + " tiene 28 días");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("\nEl mes " + mes + " tiene 30 días");
        } else {
            System.out.println("\nEl mes " + mes + " tiene 31 días");
        }
    }
}
