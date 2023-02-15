package logica;

public class Ejercicio4 {

    /*
     *
     * Enunciado:
     * 4.  Elabore un programa que use metodos y permita calcular la serie fibonacci.
     *
     */

    public static void main(String[] args) {

        int num = Utils.pedirEntero("Ingrese la posición de la sucesión a saber: ");
        int fibonacci = fibonacci(num);
        Utils.mostrarMensaje("El valor "+num+" en la sucesión de fibonacci es: "+fibonacci);

    }

    public static int fibonacci(int numero){
        if (numero < 2)
            return numero;
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

}
