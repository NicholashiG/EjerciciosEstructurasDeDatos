package MetodosRecursivosFinal;

import Utilidades.Utils;

public class Ejercicio2 {

    /*
     * Enunciado:
     * Escribir un método recursivo que reciba un vector y un número entero b; que calcule la suma de los elementos
     * del array a mayores que b.
     *
     * Lógica:
     * Es muy parecido al anterior, solo que en vez de comparar si es vocal, se compara si el valor ahí es
     * mayor a b y se suma, de lo contrario, se pasa al siguiente
     */

    public static void main(String[] args) {
        int[] arreglo = {1, 4, 2, 5, 7, 9, 55, 7, 6}; // Mayores a 7 es 55 + 9 = 64
        int b = 7;
        int tamano = arreglo.length - 1;
        int suma = sumaMayoresB(arreglo, tamano, b);
        Utils.mostrarMensaje("La suma de los valores mayores a " + b + " es de " + suma);
    }

    public static int sumaMayoresB(int[] arreglo, int i, int b) {
        if (i < 0) {
            return 0;
        } else {
            int valor = arreglo[i];
            if (valor > b) {
                return valor + sumaMayoresB(arreglo, i - 1, b);
            } else {
                return sumaMayoresB(arreglo, i - 1, b);
            }
        }
    }

}
