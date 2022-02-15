package ejercicio_1;

/**
 * Se crea la clase abstracta CelestialObject con el objetivo de definir el modelo de un cuerpo celeste.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public abstract class CelestialObject {

    private final int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;

    /**
     * Instantiates a new Celestial object.
     *
     * @param id            the id
     * @param name          the name
     * @param mass          the mass
     * @param density       the density
     * @param diameter      the diameter
     * @param distanceToSun the distance to sun
     */
    public CelestialObject(int id, String name, double mass, double density, double diameter, double distanceToSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
    }

    /**
     * Se crea el metodo showInfo con el objetivo de imprimir todos los atributos del cuerpo celeste.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    public void showInfo() {
        System.out.println("CelestialObject {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass=" + mass + " Kg" +
                ", density=" + density + " g/cm³"+
                ", diameter=" + diameter + " Km" +
                ", distanceToSun=" + distanceToSun +
                '}');
    }

    /**
     * Se crea el metodo Get del atributo id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Se crea el metodo Get del atributo name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Se crea el metodo Get del atributo mass.
     *
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * Se crea el metodo Get del atributo density.
     *
     * @return the density
     */
    public double getDensity() {
        return density;
    }

    /**
     * Se crea el metodo Get del atributo diameter.
     *
     * @return the diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Se crea el metodo Get del atributo distance to sun.
     *
     * @return the distance to sun
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }
}
