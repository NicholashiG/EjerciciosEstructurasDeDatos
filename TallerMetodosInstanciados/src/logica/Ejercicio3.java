package logica;

public class Ejercicio3 {
    /*
    *
    * Enunciado:
    * 3. Elabore un programa que nos pida un número por teclado y con un método se lo pasamos por parámetro para que nos
    * indique si es o no un número primo, debe devolver true si es primo, si no retorne false. Informe por pantalla.
    * En matemáticas, un número primo es un número natural mayor que 1 que tiene únicamente dos divisores distintos: él mismo y el 1.
    *       Operador	Descripción		Ejemplo
    * %		Operador de Resto  	resto = 5 % 3;   (1.2)  Retorna 2
    *
     */

    public static void main(String[] args) {

        int numero = Utils.pedirEntero("Ingrese el número para saber si es primo:");
        boolean isPrimo = isPrimo(numero);
        if(isPrimo){
            Utils.mostrarMensaje("El número "+numero+" es primo");
        }
        else {
            Utils.mostrarMensaje("El número "+numero+" no es primo");
        }

    }

    public static boolean isPrimo(int numero){
        boolean isPrimo = true;
        int divisores = 0;
        for (int i = 1; i<numero+1; i++){
            if (numero%i==0){
                divisores++;
            }
            if (divisores>2){
                isPrimo=false;
                break;
            }
        }
        return isPrimo;
    }
}
