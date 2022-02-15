package ejercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se crea la clase VehicleController que extiende de Vehicle con el objetivo de crear una lista de vehiculos.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class VehicleController extends Vehicle {

    /**
     * Se crea un lista de vehiculos.
     */
    public static ArrayList<Vehicle> listVehicles = new ArrayList<>();

    /**
     * Se crea el constructor por defecto.
     */
    public VehicleController() {
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

         while (listVehicles.toArray().length < 10) {

             Scanner sc = new Scanner(System.in);
             System.out.print("\nIngrese numero de pasajeros: ");
             int numberPassengers = sc.nextInt();
             System.out.print("Hay tripulacion: ");
             String hasCrew = sc.next();
             System.out.print("Ingrese el numero de ruedas: ");
             int numberWheels = sc.nextInt();
             System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
             String dateEnrollment = sc.next();
             System.out.print("Ingrese el medio de desplazamiento: ");
             String mediumWhereUsed = sc.next();

             Vehicle vehicle = new Vehicle(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
             listVehicles.add(vehicle);
             for (int i = 0; i < listVehicles.toArray().length ; i++) {
                 System.out.print(listVehicles.get(i));
                 System.out.println(" ");
             }
         }
    }
}
