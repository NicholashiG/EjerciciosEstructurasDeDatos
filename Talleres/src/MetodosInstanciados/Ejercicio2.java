package MetodosInstanciados;

public class Ejercicio2 {

	/*
	 * 
	 * Enunciado: Elabore un programa que permita calcular el factorial de cualquier
	 * número usando un método que retorne dicho valor.
	 * 
	 * Logica: Se recibe un número con el cual se va a calcular el factorial para
	 * ello, se recorre desde el número y se le va restando de a uno, es decir, 4! =
	 * 4*3*2*1 = 24
	 * 
	 */

	public static void main(String[] args) {

		int numero = Utils.pedirEntero("Ingrese el número para saber su valor factorial");
		int factorial = factorial(numero);
		Utils.mostrarMensaje(numero + "! = " + factorial);

	}

	public static int factorial(int numero) {
		int fact = 1;
		for (int i = numero; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
