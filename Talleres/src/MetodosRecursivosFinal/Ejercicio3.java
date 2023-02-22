package MetodosRecursivosFinal;

import Utilidades.Utils;
import jdk.jshell.execution.Util;

public class Ejercicio3 {

    /*
     * Enunciado:
     * Hallar la cantidad de cifras de un número entero.
     *
     * Lógica:
     * Para hallar la cantidad de cifras se va dividiendo de a 10. En caso de que
     * esa división igual a cero, se termina el algoritmo, por lo que ese sería el
     * caso base. El caso recursivo sería que siga dividiendo el número sobre 10.
     *
     * Sirve para números tanto positivos, como negativos
     *
     */
    public static void main(String[] args) {
        int numero = Utils.pedirEntero("Ingrese un número para saber sus cifras");
        int cantidad = cantidadCifrasNumero(numero);
        Utils.mostrarMensaje("La cantidad de cifras de " + numero + " es de " + cantidad);
    }

    public static int cantidadCifrasNumero(int n) {
        if (n / 10 >= 1 || n / 10 < 0) {
            return 1 + cantidadCifrasNumero(n / 10);
        }
        return 1;
    }

}
