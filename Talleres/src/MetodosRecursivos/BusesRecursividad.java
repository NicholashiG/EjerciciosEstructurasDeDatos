package MetodosRecursivos;

import Utilidades.Utils;

public class BusesRecursividad {
    static int[][] buses;


    static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

    public static void main(String[] args) {
        buses = inicializarMatriz();
        llenarMatriz();
        imprimir();
        buscarPasajerosBusRecursivo(0, 1, 0, 1);
        buscarBusMayorPasajerosRecursivo(1, 0, 0, 0);
    }

    public static int[][] inicializarMatriz() {
        int cantidadBuses = Utils.pedirEntero("Digite la cantidad de buses que tiene");
        int cantidadDias = 0;
        boolean condicion = false;
        while (condicion == false) {
            cantidadDias = Utils.pedirEntero("Digite la cantidad de días de la semana que estuvieron en funcionamiento los buses");
            if (cantidadDias <= 5 && cantidadDias > 0) {
                condicion = true;
            } else {
                Utils.mostrarMensaje("La cantidad de días debe ser mayor que 0 y menor o igual a 5");

            }
        }
        int[][] matriz = new int[cantidadDias + 1][cantidadBuses];
        return matriz;
    }

    public static void llenarMatriz() {
        for (int i = 0; i < buses[0].length; i++) {
            buses[0][i] = Utils.pedirEntero("Digite el código del bus # " + (i + 1));
            for (int j = 1; j < buses.length; j++) {
                if (j + 1 <= buses.length) {
                    buses[j][i] = Utils.pedirEntero("Digite la cantidad de pasajeros que el bus recogió el día " + dias[j - 1].toLowerCase());
                }
            }
        }
    }

    public static void buscarPasajerosBusRecursivo(int i, int j, int mayor, int filaMayor) {
        if (i < buses[0].length) {
            if (j + 1 == buses.length) {
                if (mayor < buses[j][i]) {
                    filaMayor = j;
                }
                Utils.mostrarMensaje("El bus con código " + buses[0][i] + " el dia que recogió mas pasajeros fue: " + dias[filaMayor - 1]);
                buscarPasajerosBusRecursivo(i + 1, 1, 0, 1);
            } else {
                if (mayor < buses[j][i]) {
                    mayor = buses[j][i];
                    filaMayor = j;
                }
                buscarPasajerosBusRecursivo(i, j + 1, mayor, filaMayor);
            }
        }
    }

    public static void buscarBusMayorPasajerosRecursivo(int i, int j, int mayor, int columnaMayor) {
        if (i < buses.length) {
            if (j + 1 == buses[0].length) {
                if (mayor < buses[i][j]) {
                    columnaMayor = j;
                }
                Utils.mostrarMensaje("El dia " + dias[i - 1].toLowerCase() + " el bus que más pasajeros transportó fue el bus con código "+ buses[0][columnaMayor]);
                buscarBusMayorPasajerosRecursivo(i + 1, 0, 0, 0);
            } else {
                if (mayor < buses[i][j]) {
                    mayor = buses[i][j];
                    columnaMayor = j;
                }
                buscarBusMayorPasajerosRecursivo(i, j + 1, mayor, columnaMayor);
            }
        }
    }

    public static void imprimir() {
        for (int i = 0; i < buses.length; i++) {
            for (int j = 0; j < buses[i].length; j++) {
                System.out.print(buses[i][j] + " ");
            }
            System.out.println();
        }
    }
}
