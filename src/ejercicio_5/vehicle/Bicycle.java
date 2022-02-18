package ejercicio_5.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se crea la clase Bicycle que extiende de Vehicle con el objetivo de definir el modelo de una bicicleta.
 *
 *    Bicycle bicycle = new Bicycle();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public class Bicycle extends Vehicle {

    /**
     * Se crea un atributo para diferenciar del resto de vehiculos.
     */
    private int rimSize;

    /**
     * Instancia de una nueva Bicycle.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberWheels     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     * @param rimSize          the rim size
     */
    public Bicycle(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, int rimSize) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.rimSize = rimSize;
    }

    public Bicycle() {
    }

    /**
     * Se crea el metodo createBicycles con el objetivo de pedir por consola los atributos de la clase bicicleta y
     * agregarlos a la lista.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createBicycles() {

        List<Bicycle> listBicycles =  new ArrayList<>();
        Bicycle bicycle = new Bicycle();

        while (listBicycles.toArray().length < 1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nHay tripulacion [si/no]: ");
            bicycle.setHasCrew(sc.next());
            System.out.print("Ingrese numero de pasajeros: ");
            bicycle.setNumberPassengers(sc.nextInt());
            System.out.print("Ingrese el numero del rin: ");
            bicycle.setRimSize(sc.nextInt());
            System.out.println("Numero de llantas: 2");
            bicycle.setNumberTires(2);
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            bicycle.setDateEnrollment(sc.next());
            System.out.println("Medio de desplazamiento: Tierra ");
            bicycle.setMediumWhereUsed("Tierra");
            listBicycles.add(bicycle);
        }
        bicycle.showData();
    }

    /**
     * Se sobre escribe el metodo showData con el objetivo de amoldarlo a los atributos de la clase Bicycle.
     */
    @Override
    public void showData() {
        System.out.println(" ");
        super.showData();
        System.out.println("Tamaño del rin: " + rimSize);
        System.out.println(" ");
    }

    /**
     * Se crea el metodo Get del atributo rim size.
     *
     * @return the rim size
     */
    public int getRimSize() {
        return rimSize;
    }

    /**
     * Se crea el metodo Set del atributo rim size.
     *
     * @param rimSize the rim size
     */
    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }
}
