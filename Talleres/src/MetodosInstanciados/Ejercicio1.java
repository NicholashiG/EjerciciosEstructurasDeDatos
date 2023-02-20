package MetodosInstanciados;

import Utilidades.Utils;

public class Ejercicio1 {

	/*
	 * Enunciado: Elabore un programa que nos genere una cantidad de números enteros
	 * entre dos rangos que ud ingresará. Escriba un método donde pasamos como
	 * parámetros los rangos ingresados, este método devolvera el valor de la suma
	 * de los números comprendidos entre este rango. Muestre los números por
	 * pantalla y el resultado.
	 * 
	 * Lógica: Se recibirán dos números, uno, el número más bajo y otro, el número
	 * más alto con estos números, se irán sumando cada uno de los números enteros
	 * entre estos dos. EL resultado y los números ingresados se deben mostrar en
	 * pantalla
	 * 
	 */

	public static void main(String[] args) {
		int inicio = Utils.pedirEntero("Ingrese el número de inicio");
		int fin = Utils.pedirEntero("Ingrese el número final");
		int suma = sumaRango(inicio, fin);
		Utils.mostrarMensaje("La suma de los números que están entre " + inicio + " y " + fin + " es de: " + suma);

	}

	public static int sumaRango(int inicio, int fin) {
		int suma = 0;
		for (int i = inicio + 1; i < fin; i++) {
			suma += i;
		}
		return suma;
	}

}
