public class Expresiones1a {
	public static void main (String[] args) {
		byte a;
		byte b;
		byte c;

		boolean resultado
		
		a = 4;
		b = 3;
		c = 5;

		resultado = (a > b + 2) && !(c + a == b * c);

		System.out.println("Dados a = 4, b= 3, y c = 5");
		System.out.println("Y la expresión (a > b + 2) and not(c + a = b * c)");
		System.out.println("El resultado es: " + resultado);
	}
}

