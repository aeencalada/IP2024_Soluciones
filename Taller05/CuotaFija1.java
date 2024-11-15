import java.util.Scanner;

public class CuotaFija1 {
    public static void main(String[] args) {
        // Variables
  	    Scanner sc = new Scanner(System.in);
        byte plazo; // Plazo en meses
        float monto, interes_anual, interes_mensual;
        float cuota_parcial, seguro_des, cuota_final;

  	    // Ingreso de datos del préstamo
  	    System.out.print("Ingrese monto total del préstamo: ");
        monto = sc.nextFloat();
        System.out.print("Ingrese plazo para pago de préstamo (en meses): ");
        plazo = sc.nextByte();
        System.out.print("Ingrese eñ % de la tasa de interés anual: ");
        interes_anual = sc.nextFloat();

        // Validar plazo mínimo
        if (plazo < 3) {
    	    System.out.println("Error, el plazo no puede ser inferior a 3");
        } else if (plazo > 36 && monto < 20000) {
			System.out.println("Error, el plazo no puede ser mayor a 36 en prestamos " +
			                   "inferiores a USD 20000");
	    } else {
    		// Calculo de la cuota
		    interes_mensual = interes_anual / 12 / 100;
		    cuota_parcial = (float) (monto * ((interes_mensual * Math.pow((1 + interes_mensual),plazo)) / 
                                              (Math.pow((1 + interes_mensual), plazo) - 1)));
		    seguro_des = (float) (cuota_parcial * 0.05 / 100);
		    cuota_final = (float) (cuota_parcial + seguro_des);
		    System.out.println("\nLA CUOTA MENSUAL A PAGAR ASCIENDE A: " + cuota_final);
	    }	
    }
}
