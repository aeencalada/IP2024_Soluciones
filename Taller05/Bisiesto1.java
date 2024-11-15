import java.util.Scanner;

public class Bisiesto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short year;
        String esBisiesto;

        System.out.println("Validar año bisiesto");
        System.out.println("====================\n");
        System.out.print("Ingrese el año a validar: ");
        year = sc.nextShort();

        esBisiesto = "NO";
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            esBisiesto = "SI";
        }

        System.out.println("\nEl año " + year + " " + esBisiesto
                + " es bisiesto");
    }

}
