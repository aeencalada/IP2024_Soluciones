// Función que determina si un número es primo
public static boolean primo(int num) {
    boolean esPrimo;
    if (num < 2) {
        esPrimo = false;
    } else {
        int c = num / 2;
        while (num % c != 0) {
            c--;
        }
        esPrimo = c == 1; 
    }
    return esPrimo;
}
