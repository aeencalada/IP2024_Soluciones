import java.util.Scanner;

public class TipologiaPeliculas3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short duracion;

    System.out.print("Ingrese la duración de la película en minutos: ");
    duracion = sc.nextShort();

    if (duracion <= 0 || duracion > 1000) {
        System.out.println("\nEl dato ingresado es incorrecto!");
    } else if (duracion < 30) {
        System.out.println("\nLa película que vió es un CORTOMETRAJE");
    } else if (duracion < 60) {
        System.out.println("\nLa película que vió es un MEDIOMETRAJE");
    } else {
        System.out.println("\nLa película que vió es un LARGOMETRAJE");
    }
  }
}