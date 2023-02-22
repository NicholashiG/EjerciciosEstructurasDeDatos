package MetodosRecursivosFinal;

import Utilidades.Utils;

public class Ejercicio5 {

    /*
     * Enunciado:
     * Hallar recursivamente el promedio de los elementos de la diagonal de una matriz cuadrada.
     *
     * Lógica:
     * Se deben sumar los elementos de la diagonal principal y luego, dividirlos por la cantidad
     * En este caso, como la matriz debe de ser cuadrada, la cantidad de división es el alto o ancho de la matriz
     */

    public static void main(String[] args) {

        int[][] matriz = { { 4, 1,  2,  2 },
                           { 5, 1,  9,  1 },
                           { 1, 25, 88, 9 },
                           { 5, 12, 6,  9 } };

        Utils.mostrarMensaje("El promedio de la diagonal de la matriz es de "+promedioMatriz(matriz, 0, 0));
    }

    public static int sumaDiagonalMatriz(int[][] matriz, int i, int j) {
        if (i < matriz.length && j < matriz.length) {
            if (i == j) {
                return matriz[i][j] + sumaDiagonalMatriz(matriz, i + 1, j + 1);
            }
        }
        return 0;
    }

    // Ya con la suma obtenida en sumaMatriz, se promedia por la cantidad de valores
    // que tiene la matriz, en este caso, como debe ser cuadrada,
    // el promedio es la altura o anchura del cuadrado
    // es decir, base o altura, teniendo, en este caso, 4 posiciones
    public static double promedioMatriz(int[][] matriz, int i, int j) {
        return (sumaDiagonalMatriz(matriz, i, j) / (matriz.length + 0.0));
    }

}
