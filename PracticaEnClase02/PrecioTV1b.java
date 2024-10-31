public class PrecioTV1b {
	public static void main (String[] args) {
		float precio, iva, total;

		precio = 837;
		iva = precio * (float) 0.15;
		total = precio + iva;

		System.out.println("El precio del TV con iva es: " + total + " USD");
	}
}

