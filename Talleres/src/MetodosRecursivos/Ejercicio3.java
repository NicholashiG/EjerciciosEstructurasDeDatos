package MetodosRecursivos;

import Utilidades.Utils;

public class Ejercicio3 {

    /*
     * Enunciado:
     * Cree un método que lea la un número y luego lea la potencia a la cual desea elevarla e imprima el resultado
     *
     * Lógica:
     * Se hará por medio de multiplicaciones recursivas y se le irá restando uno a las veces que se requiera
     */

    public static void main(String[] args) {
        int base = Utils.pedirEntero("Ingrese la base");
        int potencia = Utils.pedirEntero("Ingrese el exponente a elevar la base " + base);
        int resultado = potencia(base, potencia);
        Utils.mostrarMensaje(base+"^"+potencia+"="+resultado);
    }

    public static int potencia(int base, int potencia) {
        int resultado = 1;
        if (potencia > 0) {
            return base * potencia(base, potencia - 1);
        } else {
            return resultado;

        }
    }

}
