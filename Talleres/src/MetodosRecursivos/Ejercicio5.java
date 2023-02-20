package MetodosRecursivos;

public class Ejercicio5 {

    /*
     *
     * Enunciado: Cree un método que permita encontrar el mayor n el menor de
     * un arreglo de forma recursiva
     *
     * Lógica: para crear este algoritmo, necesitamos primero el caso base, el cual empezará
     * a retornar, en este caso, es cuando el índice llegue al tamaño del arreglo - 1
     * ya, el caso recursivo será llamar la función de recorrer el arreglo aumentando el
     * valor del índice en uno; ya cuando esté comenzando a devolver, se debe ir comparando el mayor
     * y el menor de la totalidad del arreglo
     *
     */
    public static void main(String[] args) {

        int[] arreglo = {-2, 6, 10, 3, 6, 8, 22};
        int[] arrMayorMenor = {arreglo[0], arreglo[0]};
        arrMayorMenor = encontrarMayMen(arreglo, 0, arrMayorMenor);
        System.out.println("El menor del arreglo es: " + arrMayorMenor[0]);
        System.out.println("El mayor del arreglo es: " + arrMayorMenor[1]);

    }

    public static int[] encontrarMayMen(int[] arr, int i, int[] arrMayMen) {
        int[] arregloMayorMenor = arrMayMen;
        if (arr != null) {
            if (arr.length != 0) {
                if (i <= arr.length - 1) {
                    if (arr[i] > arrMayMen[1]) { // Comparamos si el arreglo en la posición i es mayor al arregloMayMen en la posición 1, es decir en la del mayor
                        arregloMayorMenor[1] = arr[i]; // Si es así, se asigna en el arregloMayMen ese valor
                        return (encontrarMayMen(arr, i + 1, arregloMayorMenor)); // Aquí retornamos la función para que revise el siguiente en el arreglo
                    } else { // Si la condición de la línea 32 no se cumple, saltamos aquí
                        if (arr[i] < arrMayMen[0]) { // Comparamos si el arreglo en la posición i es menor al arregloMayMen en la posición 0, es decir en la del menor
                            arregloMayorMenor[0] = arr[i]; // Si es así, se asigna en el arregloMayMen ese valor
                            return (encontrarMayMen(arr, i + 1, arregloMayorMenor)); // Aquí retornamos la función para que revise el siguiente en el arreglo
                        } else {
                            return encontrarMayMen(arr, i + 1, arregloMayorMenor); // Si no es ni mayor ni menor, se revisa el siguiente
                        }

                    }
                }
            }
        }
        return arregloMayorMenor; // Al final de esto, retornamos el arreglo con los valores de menor y mayor en la posición 0 y 1 respectivamente
    }


}
