import java.util.Scanner;

public class CompraElectrodomestico1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio, iva, envio, total;
        short peso, distancia;

        System.out.println("Facturación de electrodoméstico");
        System.out.println("-------------------------------\n");
        System.out.print("Ingrese el precio del electrodoméstico: ");
        precio = sc.nextFloat();
        System.out.print("Ingrese el peso en libras: ");
        peso = sc.nextShort();
        System.out.print("Ingrese la distancia al domicilio en Km: ");
        distancia = sc.nextShort();
        
        iva = (float) (precio * 0.12);
        envio = (float) (0.01 * peso * distancia);
        total = (float) (precio + iva + envio);
        
        System.out.println("\nTotal a pagar con IVA y entrega a domicilio: "
                + total + " USD");
    }

}
