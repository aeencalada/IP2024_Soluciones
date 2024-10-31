import java.util.Scanner;

public class Venta1a {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float precio1, precio2, precio3, subtotal, iva, total;

		System.out.println("COMPRA DE ARTICULOS");
		System.out.println("===================");
		System.out.println();
		System.out.print("Ingrese el precio del artículo 1: ");
		precio1 = sc.nextFloat();
		System.out.print("Ingrese el precio del artículo 2: ");
		precio2 = sc.nextFloat();
		System.out.print("Ingrese el precio del artículo 3: ");
		precio3 = sc.nextFloat();

		subtotal = precio1 + precio2 + precio3;
		iva = subtotal * (float) 0.15;
		total = subtotal + iva;

		System.out.println("\nGracias por su compra!");
		System.out.println("El total a pagar incluido iva es: USD " + total);

	}
}

