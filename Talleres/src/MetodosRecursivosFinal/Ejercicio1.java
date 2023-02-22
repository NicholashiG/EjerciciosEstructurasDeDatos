package MetodosRecursivosFinal;

import Utilidades.Utils;

public class Ejercicio1 {

    /*
     * Enunciado:
     * Escribir un método recursivo, para calcular el número de vocales de una cadena.
     *
     * Lógica:
     * Como una cadena se comporta como un arreglo, únicamente se compara cada una de las posiciones
     * y se le suma en caso de que sea vocal
     */

    public static void main(String[] args) {
        String cadena = Utils.pedirTexto("Ingrese la palabra para saber la cantidad de vocales");
        String cadenaMinusculas = cadena.toLowerCase();
        int cantidadCaracteres = cadenaMinusculas.length() - 1;
        int cantidadVocales = cantVocales(cadenaMinusculas, cantidadCaracteres);
        Utils.mostrarMensaje("La cantidad de vocales de '" + cadena + "' es de " + cantidadVocales);
    }

    public static int cantVocales(String cadena, int i) {
        if (i >= 0) {
            char caracter = cadena.charAt(i);
            if (isVocal(caracter)) {
                return 1 + cantVocales(cadena, i - 1);
            } else {
                return cantVocales(cadena, i - 1);
            }
        }
        return 0;
    }

    public static boolean isVocal(char caracter) {
        boolean isVocal = false;
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            isVocal = true;
        }
        return isVocal;
    }

}
