import java.util.Scanner;

public class TrianguloRectangulo1b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		short dim1, dim2, dim3;
		String res;

		System.out.println("\nValidación de un tríangulo rectángulo");
		System.out.println("-------------------------------------\n");
		System.out.print("Ingrese dimension 1: ");
		dim1 = sc.nextShort();
		System.out.print("Ingrese dimension 2: ");
		dim2 = sc.nextShort();
		System.out.print("Ingrese dimension 3: ");
		dim3 = sc.nextShort();

		if (Math.pow(dim1,2) != Math.pow(dim2,2) + Math.pow(dim3,2) 
			&& Math.pow(dim2,2) != Math.pow(dim1,2) + Math.pow(dim3,2) 
			&& Math.pow(dim3,2) != Math.pow(dim1,2) + Math.pow(dim2,2)) {
			res = "NO";
		} else {
			res = "SI";
		}

		System.out.println("\nLos valores ingresados " + res + 
			" corresponden a los lados de un triángulo rectángulo");

	}

}