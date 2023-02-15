package Buses;

public class Buses {

    /*
    @authors Juan Manuel Tunubala - Nicolás Jurado
     */

    public static void main(String[] args) {
        int[][] buses = {{100, 101, 102, 103, 104},
                {20, 40, 15, 18, 32},
                {43, 12, 32, 52, 23},
                {14, 77, 23, 16, 18},
                {54, 19, 34, 42, 17},
                {61, 23, 41, 25, 76}};
        hallarMayorPorBus(buses);
    }

    public static void hallarMayorPorBus(int[][] buses){
        int mayor = 0;
        int busMayor = 0;
        int dia = 0;
        for (int i = 0; i < buses[0].length; i++) {
            for (int j = 1; j < buses.length; j++) {
                //System.out.println(buses[j][i]);
                if (buses[j][i] > mayor){
                    mayor = buses[j][i];
                    busMayor = buses[0][i];
                    dia = j;

                }
            }
        }
        System.out.println("El bus que transportó más pasajeros fue el bus: " + busMayor + " en el dia: " + dia + " con: " + mayor + " pasajeros");
    }
}