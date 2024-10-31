public class PrecioTV1c {
	public static void main (String[] args) {
		float precio, iva, total;

		precio = 837;
		iva = (float)(precio * 0.15);
		total = precio + iva;

		System.out.println("El precio del TV con iva es: " + total + " USD");
	}
}

