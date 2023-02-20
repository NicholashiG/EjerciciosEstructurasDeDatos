package MetodosRecursivos;
import Utilidades.Utils;
public class Ejercicio1 {


    /*
     * Enunciado:
     * Construya una función para sumar los números naturales hasta N de forma recursiva.  EL dato N pasará como parámetro.
     *
     * Lógica:
     * Por parámetro se recibe n, o sea el límite de la recursión; unicamente se retorna n + la función de n-1
     */

    public static void main(String[] args) {
        int n = Utils.pedirEntero("Ingrese el número para hacer la suma");
        int suma = suma(n);
        Utils.mostrarMensaje("El resultado de la suma es "+suma);
    }

    public static int suma(int n) {
        int suma = 0;
        if (n > 0) {
            return n + suma(n - 1);
        }
        return suma;
    }

}
