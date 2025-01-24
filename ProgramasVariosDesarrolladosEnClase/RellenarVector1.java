package rellenarvector1;

public class RellenarVector1 {

    public static void main(String[] args) {
        int[] vector;
        vector = vectorAleatorio(10, -2, 21);
        System.out.print("Contenido del vector: [ ");
        mostrarVector(vector);
    }

    // Función para generar un vector con números aleatorios
    public static int[] vectorAleatorio(int tamano, int desde, int hasta) {
        int[] arreglo = new int[tamano];
        for (int i = 0; i <= tamano - 1; i++) {
            arreglo[i] = aleatorio(desde, hasta);
        }
        return arreglo;
    }

    // Función para generar número aleatorio entre min y max
    public static int aleatorio(int min, int max) {
        return (int) (Math.round(Math.random() * (max - min)) + min);
    }

    //Procedimiento que muestra el contenido de un vector
    public static void mostrarVector(int[] x) {
        System.out.print("[");
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]\n");
    }
}
