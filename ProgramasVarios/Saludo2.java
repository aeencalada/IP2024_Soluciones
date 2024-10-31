import java.util.Scanner; 
public class Saludo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Hola " + nombre); System.out.println(", encantado de conocerte!");
	}
}