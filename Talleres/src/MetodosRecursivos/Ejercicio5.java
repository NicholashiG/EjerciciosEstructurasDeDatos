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

        int[] arreglo = {1, 6, 0, 3, 6, 8, 2};
        int[] arrMayorMenor = {0, 0};
        arrMayorMenor = encontrarMayorMenorArreglo(arreglo, 0, arrMayorMenor);
        System.out.println(arrMayorMenor[0]);
        System.out.println(arrMayorMenor[1]);

    }
    public static int[] encontrarMayorMenorArreglo(int[] arreglo, int i, int[] arrMayMen){
        int[] arregloMayorMenor=arrMayMen;
        if (i<arreglo.length-1){
            arregloMayorMenor = encontrarMayorMenorArreglo(arreglo, i+1, arregloMayorMenor);
            if (arreglo[i]>arregloMayorMenor[0]){
                arregloMayorMenor[0]=arreglo[i];
            }
            if (arreglo[i]<arregloMayorMenor[1]){
                arregloMayorMenor[1]=arreglo[i];
            }
            return encontrarMayorMenorArreglo(arreglo, i+1, arregloMayorMenor);
        }
        else {
            arregloMayorMenor[0]=arreglo[i];
            arregloMayorMenor[1]=arreglo[i];
            return arregloMayorMenor;
        }
    }

}
