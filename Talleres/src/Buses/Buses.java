package Buses;

public class Buses {

    private static String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

    /*
    @authors Juan Manuel Tunubala - Nicolás Jurado
     */

    public static void main(String[] args) {
        int[][] buses = {{100, 101, 102, 103, 104},  // Buses
                          {20,  40,  15,  18,  32},  // Lunes
                          {43,  12,  32,  52,  23},  // Martes
                          {14,  77,  23,  16,  18},  // Miércoles
                          {54,  19,  34,  42,  17},  // Jueves
                          {61,  23,  41,  25,  76}}; // Viernes
        hallarMayorSemana(buses);
        hallarMayorPorDia(buses);
        hallarMayorPorBus(buses);
    }


    public static void hallarMayorSemana(int[][] buses) {

        System.out.println("-------------Programa de buses----------------");

        int mayor = 0;
        int busMayor = 0;
        int dia = 0;
        for (int i = 0; i < buses[0].length; i++) {
            for (int j = 1; j < buses.length; j++) {
                if (buses[j][i] > mayor) {
                    mayor = buses[j][i];
                    busMayor = buses[0][i];
                    dia = j;

                }
            }
        }
        System.out.println("El día en el que se transportaron más personas fue el " + diasSemana[dia - 1] + " por el bus " + busMayor + " con una cantidad de pasajeros de " + mayor);
    }

    public static void hallarMayorPorDia(int[][] buses) {

        System.out.println("------------------------------");

        int mayor = 0;
        int busMayor = 0;
        for (int i = 1; i < buses.length; i++) {

            mayor = 0;
            busMayor = 0;

            for (int j = 0; j < buses[0].length; j++) {
                if (buses[i][j] > mayor) {
                    mayor = buses[i][j];
                    busMayor = buses[0][j];
                }
            }

            System.out.println("El día " + diasSemana[i - 1] + " el bus " + busMayor + " fue el que más pasajeros transportó, con " + mayor);

        }

    }

    private static void hallarMayorPorBus(int[][] buses) {

        System.out.println("------------------------------");

        int mayor = 0;
        int busMayor = 0;
        int dia = 0;
        for (int i = 0; i < buses[0].length; i++) {
            mayor = 0;
            busMayor = 0;
            for (int j = 1; j < buses.length; j++) {
                if (buses[j][i] > mayor) {
                    mayor = buses[j][i];
                    busMayor = buses[0][i];
                    dia = j;

                }
            }
            System.out.println("El bus " + busMayor + " llevó más pasajeros el día " + diasSemana[i] + " con un total de pasajeros de " + mayor);
        }
    }
}