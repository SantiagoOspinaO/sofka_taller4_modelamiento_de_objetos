package ejercicio_5.vehicle;

/**
 * Se crea la clase Vehicle con el objetivo de definir el modelo de un vehiculo.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-15
 */
public abstract class Vehicle {

    private int numberPassengers;
    private String hasCrew;
    private int numberTires;
    private String dateEnrollment;
    private String mediumWhereUsed;

    /**
     * Instancia de un nuevo Vehicle.
     *
     * @param numberPassengers the number passengers
     * @param hasCrew          the has crew
     * @param numberTires     the number wheels
     * @param dateEnrollment   the date enrollment
     * @param mediumWhereUsed  the medium where used
     */
    public Vehicle(int numberPassengers, String hasCrew, int numberTires, String dateEnrollment, String mediumWhereUsed) {
        this.numberPassengers = numberPassengers;
        this.hasCrew = hasCrew;
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
     * Se crea el  metodo showData con el objetivo de mostrar la informacion del vehiculo.
     *
     *    showData();
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public void showData() {
        System.out.println( "Hay tripulacion: " + hasCrew +
                ", numero de pasajeros: " + numberPassengers +
                ", numero de ruedas: " + numberTires +
                "\nFecha de la matricula: " + dateEnrollment +
                "\nMedio por el que se desplaza: " + mediumWhereUsed);
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
     * Se crea el metodo Get del atributo number tires.
     *
     * @return the number tires
     */
    public int getNumberTires() {
        return numberTires;
    }

    public void setNumberTires(int numberTires) {
        this.numberTires = numberTires;
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

    public void setMediumWhereUsed(String mediumWhereUsed) {
        this.mediumWhereUsed = mediumWhereUsed;
    }
}
