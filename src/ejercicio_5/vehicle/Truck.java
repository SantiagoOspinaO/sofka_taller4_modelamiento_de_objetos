package ejercicio_5.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se crea la clase Truck que extiende de Vehicle con el objetivo de definir el modelo de un camion.
 *
 *    Truck truck = new Truck();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public class Truck extends Vehicle {


    /**
     * Se crea un atributo para diferenciar del resto de vehiculos.
     */
    private int numberOfAxles;

    /**
     * Instancia de un nuevo Truck.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberWheels     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     * @param numberOfAxles    the number of axles
     */
    public Truck(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, int numberOfAxles) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    /**
     * Se crea el metodo createBicycles con el objetivo de pedir por consola los atributos de la clase bicicleta y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createTrucks() {

        List<Truck> listTrucks =  new ArrayList<>();
        Truck truck = new Truck();

        while (listTrucks.toArray().length < 1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nHay tripulacion [si/no]: ");
            truck.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            truck.setNumberPassengers(sc.nextInt());
            System.out.print("Ingrese el numero de ejes: ");
            truck.setNumberOfAxles(sc.nextInt());
            System.out.println("Ingrese el numero de llantas: ");
            truck.setNumberTires(sc.nextInt());
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            truck.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Tierra ");
            truck.setMediumWhereUsed("Tierra");
            listTrucks.add(truck);
        }
        truck.showData();
    }

    /**
     * Se sobre escribe el metodo showData con el objetivo de amoldarlo a los atributos de la clase Truck.
     */
    @Override
    public void showData() {
        System.out.println(" ");
        super.showData();
        System.out.println("Numero de ejes: " + numberOfAxles);
        System.out.println(" ");
    }

    /**
     * Se crea el metodo Get del atributo number of axles.
     *
     * @return the number of axles
     */
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Se crea el metodo Set del atributo number of axles.
     *
     * @param numberOfAxles the number of axles
     */
    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
