package ejercicio_4;

/**
 * Se crea la clase Vehicle con el objetivo de definir el modelo de un vehiculo.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class Vehicle {

    private int numberPassengers;
    private String hasCrew;
    private int numberTires = 4;
    private String dateEnrollment;
    private String mediumWhereUsed = "Tierra";

    /**
     * Instantiates a new Vehicle.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberTires     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     */
    public Vehicle(String hasCrew, int numberPassengers, int numberTires, String dateEnrollment, String mediumWhereUsed) {
        this.hasCrew = hasCrew;
        this.numberPassengers = numberPassengers;
        this.numberTires = numberTires;
        this.dateEnrollment = dateEnrollment;
        this.mediumWhereUsed = mediumWhereUsed;
    }

    /**
     * Se crea el constructor por defecto del vehiculo.
     */
    public Vehicle() {
    }

    /**
     * Se sobre escribe el metodo toString.
     *
     * @return los atributos de la clase vehiculo.
     */
    @Override
    public String toString() {
        return "Vehicle { " + "Hay tripulacion: " + getHasCrew() +
                ", numero de pasajeros: " + getNumberPassengers() +
                ", numero de llantas: " + getNumberTires() +
                ", fecha de la matricula: " + getDateEnrollment() +
                ", medio por el que se desplaza: " + getMediumWhereUsed() + "}";
    }


    /**
     * Se crea el metodo Get del atributo number passengers.
     *
     * @return the number passengers
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * Se crea el metodo Set del atributo number passengers.
     *
     * @param numberPassengers the number passengers
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * Se crea el metodo Get del atributo has crew.
     *
     * @return the has crew
     */
    public String getHasCrew() {
        return hasCrew;
    }

    /**
     * Se crea el metodo Set del atributo has crew.
     *
     * @param hasCrew the has crew
     */
    public void setHasCrew(String hasCrew) {
        this.hasCrew = hasCrew;
    }

    /**
     * Se crea el metodo Get del atributo number wheels.
     *
     * @return the number wheels
     */
    public int getNumberTires() {
        return numberTires;
    }

    /**
     * Se crea el metodo Get del atributo date enrollment.
     *
     * @return the date enrollment
     */
    public String getDateEnrollment() {
        return dateEnrollment;
    }

    /**
     * Se crea el metodo Set del atributo date enrollment.
     *
     * @param dateEnrollment the date enrollment
     */
    public void setDateEnrollment(String dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
    }

    /**
     * Se crea el metodo Get del atributo medium where used.
     *
     * @return the medium where used
     */
    public String getMediumWhereUsed() {
        return mediumWhereUsed;
    }
}
