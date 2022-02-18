package ejercicio_5.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se crea la clase Motorboat que extiende de Vehicle con el objetivo de definir el modelo de una lancha.
 *
 *    Motorboat motorboat = new Motorboat();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public class Motorboat extends Vehicle {

    /**
     * Se crea un atributo para diferenciar del resto de vehiculos.
     */
    private String motorLocation;

    /**
     * Instancia de una nueva Motorboat.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberWheels     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     * @param motorLocation    the motor location
     */
    public Motorboat(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, String motorLocation) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.motorLocation = motorLocation;
    }

    public Motorboat() {
    }

    /**
     * Se crea el metodo createMotorboats con el objetivo de pedir por consola los atributos de la clase lancha y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createMotorboats() {

        List<Motorboat> listMotorboats =  new ArrayList<>();
        Motorboat motorboat = new Motorboat();

        while (listMotorboats.toArray().length < 1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nHay tripulacion [si/no]: ");
            motorboat.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            motorboat.setNumberPassengers(sc.nextInt());
            System.out.print("Ingrese donde esta ubicado el motor: ");
            motorboat.setMotorLocation(sc.next());
            System.out.println("Numero de llantas: No aplica");
            motorboat.setNumberTires(Integer.parseInt("No aplica"));
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            motorboat.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Agua ");
            motorboat.setMediumWhereUsed("Agua");
            listMotorboats.add(motorboat);
        }
        motorboat.showData();
    }

    /**
     * Se sobre escribe el metodo showData con el objetivo de amoldarlo a los atributos de la clase Motorboat.
     */
    @Override
    public void showData() {
        System.out.println(" ");
        super.showData();
        System.out.println("El motor se encuentra ubicado en: ");
        System.out.println(" ");
    }

    /**
     * Se crea el metodo Get del atributo motor location.
     *
     * @return the motor location
     */
    public String getMotorLocation() {
        return motorLocation;
    }

    /**
     * Se crea el metodo Set del atributo motor location.
     *
     * @param motorLocation the motor location
     */
    public void setMotorLocation(String motorLocation) {
        this.motorLocation = motorLocation;
    }
}
