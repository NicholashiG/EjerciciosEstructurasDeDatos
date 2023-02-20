package MetodosRecursivos;

import Utilidades.Utils;

public class Ejercicio2 {

    /*
     * Enunciado:
     * Crear una función que imprima los dígitos desde N hasta 1. Se debe pasar como parámetro el número N
     *
     * Lógica:
     * Es igual al ejercicio 1, solo que imprime el valor actual
     */

    public static void main(String[] args) {
        int n = Utils.pedirEntero("Ingrese el número para hacer la impresión");
        imprimirN(n);
    }

    public static int imprimirN(int n) {
        int suma = 0;
        if (n > 0) {
            System.out.println(n);
            return imprimirN(n - 1);
        }
        return 0;
    }

}
