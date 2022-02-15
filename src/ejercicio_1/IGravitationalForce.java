package ejercicio_1;

/**
 * Se crea la interfaz IGravitationalForce con el objetivo de definir como obligatorio el metodo calculateGravitationalAttraction.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public interface IGravitationalForce {

    /**
     * Calculate gravitational attraction.
     *
     * @param mass1 double se pide la masa del primer cuerpo celeste.
     * @param mass2 double se pide la masa del segundo cuerpo celeste.
     * @param distanceBetweenBodies double se pide la distancia entre los cuerpos.
     */
     void calculateGravitationalAttraction(double mass1, double mass2, double distanceBetweenBodies);
}
