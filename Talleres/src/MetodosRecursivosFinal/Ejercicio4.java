package MetodosRecursivosFinal;

import Utilidades.Utils;

public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = Utils.pedirTexto("Inserte el texto para saber si es la palíndroma");
        String cadenaModificada = cadena.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        String cadenaVolteada = voltearCadena(cadenaModificada, 0, cadenaModificada.length());
        if (esPalindroma(cadenaModificada, cadenaVolteada, 0, 0) != cadenaVolteada.length()) {
            Utils.mostrarMensaje("La palabra " +cadena+" no es palindroma");
        } else {
            Utils.mostrarMensaje("La palabra " +cadena+" es palindroma");
        }
    }

    public static String voltearCadena(String cadenaModificada, int i, int j) {
        if (i < cadenaModificada.length() + 1 && j > 0) {
            return cadenaModificada.charAt(j - 1) + voltearCadena(cadenaModificada, i + 1, j - 1);
        }
        return "";
    }

    public static int esPalindroma(String cadenaOriginal, String cadenaVolteada, int i, int j) {
        if (i < cadenaOriginal.length()) {
            if (cadenaOriginal != " " || cadenaOriginal != "." || cadenaOriginal != ",") {
                if (cadenaOriginal.charAt(i) == cadenaVolteada.charAt(j)) {
                    return esPalindroma(cadenaOriginal, cadenaVolteada, i + 1, j + 1) + 1;
                } else {
                    return 0;
                }
            } else {
                return esPalindroma(cadenaOriginal, cadenaVolteada, i, j);
            }
        }
        return 0;
    }
}
