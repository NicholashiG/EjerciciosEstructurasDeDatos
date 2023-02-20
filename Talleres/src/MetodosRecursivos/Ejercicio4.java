package MetodosRecursivos;

public class Ejercicio4 {

    /*
     * Enunciado:
     * Cree un método que permita recorrer y mostrar un array ingresado
     */

    public static void main(String[] args) {

        int[] arreglo = {32, 10, 20, 1342, 30, 10, 45, 0};
        System.out.print("[");
        imprimirArreglo(arreglo, 0);
        System.out.println("]");

    }

    public static int imprimirArreglo(int[] arr, int n) {
        if (arr != null) {
            if (arr.length != 0) {
                if (n <= arr.length - 1) {
                    System.out.print(arr[n] + " ");
                    return imprimirArreglo(arr, n + 1);
                }
            }
        }
        return 0;
    }

}
