public class ConversionDeTipos2 {
  public static void main(String[] args) {
    byte x = 2;
    float y = 5;
    short z = 3;
    float resultado;

    resultado = y / x * z;
  
    System.out.println("Dados x = 2 ; y = 5 ; z = 3");
    System.out.println("\nEl resultado de ( y / x * z ) es " + resultado);
  }
}