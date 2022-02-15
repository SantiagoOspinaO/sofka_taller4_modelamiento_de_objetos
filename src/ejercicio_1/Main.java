package ejercicio_1;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Planet earth = new Planet(1, "Earth", 5.972E24, 	5.515, 12.756, 1.5E8);
        Planet jupiter = new Planet(2, "Jupiter", 1.898E27, 1.33, 142.984, 7.5E8);

        System.out.println("Fuerza de atraccion entre " + earth.getName() + " y " + jupiter.getName());
        earth.calculateGravitationalAttraction(earth.getMass(), jupiter.getMass(),9.276E12);

        earth.showInfo();
        jupiter.showInfo();
    }
}
