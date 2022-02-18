package ejercicio_5.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se crea la clase Car que extiende de Vehicle con el objetivo de definir el modelo de un carro.
 *
 *    Car car = new Car();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public class Car extends Vehicle {

    /**
     * Se crea un atributo para diferenciar del resto de vehiculos.
     */
    private int numberDoors;

    /**
     * Instancia de un nuevo Car.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberWheels     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     * @param numberDoors      the number doors
     */
    public Car(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, int numberDoors) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.numberDoors = numberDoors;
    }

    public Car() {

    }

    /**
     * Se crea el metodo createVehicles con el objetivo de pedir por consola los atributos de la clase carro y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createCars() {

        List<Car> listCars =  new ArrayList<>();
        Car car = new Car();

        while (listCars.toArray().length < 1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nHay tripulacion [si/no]: ");
            car.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            car.setNumberPassengers(sc.nextInt());
            System.out.print("Ingrese el numero de puertas: ");
            car.setNumberDoors(sc.nextInt());
            System.out.println("Numero de llantas: 4");
            car.setNumberTires(4);
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            car.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Tierra ");
            car.setMediumWhereUsed("Tierra");
            listCars.add(car);
        }
        car.showData();
    }

    /**
     * Se sobre escribe el metodo showData con el objetivo de amoldarlo a los atributos de la clase Car.
     */
    @Override
    public void showData() {
        System.out.println(" ");
        super.showData();
        System.out.print("Numero de puertas: " + numberDoors);
        System.out.println(" ");
    }

    /**
     * Se crea el metodo Get del atributo number doors.
     *
     * @return the number doors
     */
    public int getNumberDoors() {
        return numberDoors;
    }

    /**
     * Se crea el metodo Set del atributo number doors.
     *
     * @param numberDoors the number doors
     */
    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
}
