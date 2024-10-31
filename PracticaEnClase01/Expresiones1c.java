public class Expresiones1c {
	public static void main (String[] args) {
		byte a = 4, b = 3, c = 5;

		boolean resultado;

		resultado = (a > b + 2) && !(c + a == b * c);

		System.out.println("Dados a = " + a + ", b = " + b + ", y c = " + c);
		System.out.println("Y la expresión (a > b + 2) and not(c + a = b * c)");
		System.out.println("El resultado es: " + resultado);
	}
}

