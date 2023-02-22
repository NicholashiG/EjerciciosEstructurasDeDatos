package MetodosRecursivosFinal;

import Utilidades.Utils;

public class Ejercicio4 {
    
    // Nota: revisarlo >w<

    /*
     * Enunciado:
     * Escribir un método recursivo que implemente el algoritmo para determinar si una palabra o frase es palíndroma o no.
     * El método debe ignorar espacios y puntuación en la cadena.
     */
    public static void main(String[] args) {
        String palabra = Utils.pedirTexto("Ingrese la palabra o frase para saber si es palíndroma");
        Utils.mostrarMensaje("¿La palabra o frase '" + palabra + "' es palíndroma?: " + isPalindroma(palabra));
    }

    public static String invertirPalabra(String palabra, int i) {
        if (i >= 0)  {
            if (palabra.charAt(i) != ' ' || palabra.charAt(i) != '.' || palabra.charAt(i) != ','){
                return "" + palabra.charAt(i) + invertirPalabra(palabra, i - 1);
            }
            else{
                return invertirPalabra(palabra, i - 1);
            }
        }
        return "";
    }

    public static int cantSignos(String palabra, int i ){
        if (i >= 0) {
            if (palabra.charAt(i) == ' ' || palabra.charAt(i) == '.' || palabra.charAt(i) == ','){
                return 1 + cantSignos(palabra, i - 1);
            }
            else{
                return cantSignos(palabra, i - 1);
            }
        }
        return 0;
    }

    public static boolean isPalindroma(String palabra) {
        int cantidadSignos = cantSignos(palabra, palabra.length()-1);
        System.out.println(cantidadSignos);
        String palabraInvertida = invertirPalabra(palabra.toLowerCase(), palabra.length()-1 - cantidadSignos);
        System.out.println(palabraInvertida);
        if (palabra.toLowerCase().equals(palabraInvertida)) {
            return true;
        } else {
            return false;
        }
    }

}
