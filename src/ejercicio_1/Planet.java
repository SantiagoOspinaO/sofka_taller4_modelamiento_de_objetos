package ejercicio_1;

/**
 * Se crea la clase Planet que extiende de la clase CelestialObject e implementa la interfaz IGravitationalForce con el
 * objetivo de crear un objeto celeste y calcular su fuerza gravitatoria en referencia a otro objeto.
 *
 *    Planet plante = new Planet();
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class Planet extends CelestialObject implements IGravitationalForce {

    /**
     * Se crea la constante de Cavendish.
     */
    public final double constantCavendish = 6.66704810E-11;

    /**
     * Instantiates a new Planet.
     *
     * @param id            the id
     * @param name          the name
     * @param mass          the mass
     * @param density       the density
     * @param diameter      the diameter
     * @param distanceToSun the distance to sun
     */
    public Planet(int id, String name, double mass, double density, double diameter, double distanceToSun) {
        super(id, name, mass, density, diameter, distanceToSun);
    }

    /**
     * Se sobre escribe el metodo calculateGravitationalAttraction de la interfaz IGravitationalForce y se implemnta.
     *
     *    Planet planet = new Planet();
     *    planet.calculateGravitationalAttraction();
     *
     * @param mass1 double se pide la masa del primer cuerpo celeste.
     * @param mass2 double se pide la masa del segundo cuerpo celeste.
     * @param distanceBetweenBodies double se pide la distancia entre los cuerpos.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    @Override
    public void calculateGravitationalAttraction(double mass1, double mass2, double distanceBetweenBodies) {

        double forceGravitationalAttraction = (constantCavendish * mass1 * mass2) / Math.pow(distanceBetweenBodies, 2);
        System.out.println("Fg = " + forceGravitationalAttraction + " N");
        System.out.println(" ");
    }
}
