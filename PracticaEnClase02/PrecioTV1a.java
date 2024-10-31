public class PrecioTV1a {
	public static void main (String[] args) {
		float precio, iva, total;

		precio = 837;
		iva = precio * 15 / 100;
		total = precio + iva;

		System.out.println("El precio del TV con iva es: " + total + " USD");
	}
}

