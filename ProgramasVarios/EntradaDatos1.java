import java.util.Scanner;

public class EntradaDatos1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombres, apellidos;
    byte edad;
    int km_viajados;
    float estatura;

    System.out.print("Cu�les son sus nombres? ");
    nombres = sc.nextLine();
    System.out.print("Cu�les son sus apellidos? ");
    apellidos = sc.nextLine();
    System.out.print("Cu�ntos a�os tiene?: ");
    edad = sc.nextByte();
    System.out.print("Cu�ntos Km ha viajado?: ");
    km_viajados = sc.nextInt();
    System.out.print("Cu�l es su estatura en metros?: ");
    estatura = sc.nextFloat();

    System.out.println("\nAgradecemos sus respuestas\n");
    System.out.print("Su nombre es " + nombres + " " + apellidos + ", ");
    System.out.print("tiene " + edad + " a�os, mide " + estatura + "m ");
    System.out.println("y ha viajado " + km_viajados + "Km.");
  }
}

