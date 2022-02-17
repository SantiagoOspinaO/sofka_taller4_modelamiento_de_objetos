package ejercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se crea la clase CreateVehicle que extiende de Vehicle con el objetivo de crear una lista de vehiculos.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class CreateVehicle extends Vehicle {

    /**
     * Se crea un lista de vehiculos.
     */
    public static ArrayList<Vehicle> listVehicles = new ArrayList<>();

    static Vehicle vehicle = new Vehicle();

    /**
     * Se crea el constructor por defecto.
     */
    public CreateVehicle() {
    }

    /**
     * Se crea el metodo createVehicles con el objetivo de pedir por consola los atributos de la clase vehiculo y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createVehicles() {

        System.out.println("-----------------------------------------------------------");
        System.out.println("|                        ¡WELCOME!                        |");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("::Se tiene capacidad para 10 vehiculos::");

        int contador = 1;
        while (listVehicles.toArray().length <= 10) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\nVehiculo numero: " + contador);

            System.out.print("Hay tripulacion [si/no]: ");
            vehicle.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            vehicle.setNumberPassengers(sc.nextInt());
            System.out.println("Numero de llantas: 4");
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            vehicle.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Tierra ");
            System.out.println(" ");
            contador++;

            listVehicles.add(vehicle);
            for (int i = 0; i < listVehicles.toArray().length ; i++) {
                System.out.print(listVehicles.get(i));
                System.out.println(" ");
            }
        }
    }
}
