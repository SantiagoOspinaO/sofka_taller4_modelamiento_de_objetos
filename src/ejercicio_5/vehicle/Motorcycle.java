package ejercicio_5.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se crea la clase Motorcycle que extiende de Vehicle con el objetivo de definir el modelo de una moto.
 *
 *    Motorcycle motorcycle = new Motorcycle();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public class Motorcycle extends Vehicle {

    /**
     * Se crea un atributo para diferenciar del resto de vehiculos.
     */
    private int cylinderCapacity;

    /**
     * Instancia de una nueva Motorcycle.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberWheels     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     * @param cylinderCapacity the cylinder capacity
     */
    public Motorcycle(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, int cylinderCapacity) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.cylinderCapacity = cylinderCapacity;
    }

    public Motorcycle() {
    }

    /**
     * Se crea el metodo createMotorcycles con el objetivo de pedir por consola los atributos de la clase moto y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createMotorcycles() {

        List<Motorcycle> listMotorcycles =  new ArrayList<>();
        Motorcycle motorcycle = new Motorcycle();

        while (listMotorcycles.toArray().length < 1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nHay tripulacion [si/no]: ");
            motorcycle.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            motorcycle.setNumberPassengers(sc.nextInt());
            System.out.print("Ingrese el cilindraje: ");
            motorcycle.setCylinderCapacity(sc.nextInt());
            System.out.println("Numero de llantas: 2");
            motorcycle.setNumberTires(2);
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            motorcycle.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Tierra ");
            motorcycle.setMediumWhereUsed("Tierra");
            listMotorcycles.add(motorcycle);
        }
        motorcycle.showData();
    }

    /**
     * Se sobre escribe el metodo showData con el objetivo de amoldarlo a los atributos de la clase Motorcycle.
     */
    @Override
    public void showData() {
        System.out.println(" ");
        super.showData();
        System.out.println("El cilindraje de la moto es: " + cylinderCapacity);
        System.out.println(" ");
    }

    /**
     * Se crea el metodo Get del atributo cylinder capacity.
     *
     * @return the cylinder capacity
     */
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Se crea el metodo Set del atributo cylinder capacity.
     *
     * @param cylinderCapacity the cylinder capacity
     */
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
}
