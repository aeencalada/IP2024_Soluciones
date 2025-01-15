package aleatorios1;

public class Aleatorios1 {

    public static void main(String[] args) {
        separador();
        System.out.println("Aleatorio 1: " + aleatorio());
        separador('*');
        System.out.println("Aleatorio 2: " + aleatorio(5));
        separador('+', 50);
        System.out.println("Aleatorio 3: " + aleatorio(5, 10));
        separador();
    }

    // Procedimientos para imprimir un separador en pantalla
    public static void separador() {
        System.out.println("----------------------------------------");
    }

    public static void separador(char x) {
        for (int i = 1; i <= 40; i++) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void separador(char x, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(x);
        }
        System.out.println();
    }

    // Funciones para generar número aleatorio
    public static double aleatorio() {
        return Math.random();
    }

    public static int aleatorio(int max) {
        return (int) (Math.round(Math.random() * max));
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.round(Math.random() * (max - min)) + min);
    }
}
