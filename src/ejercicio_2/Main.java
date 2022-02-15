package ejercicio_2;

/**
 * Se crea la clase Main.
 */
public class Main {

    /**
     * Se crea el primer Main utilizando la sobrecarga de metodos.
     *
     * @param i int se pide un numero entero
     */
    public static void main(int i) {
        System.out.println("Main: " + i);
    }

    /**
     * Se crea el segundo Main utilizando la sobrecarga de metodos.
     *
     * @param s String se pide un string
     */
    public static void main(String s) {
        System.out.println(s);
    }

    /**
     * Se crea el Main de entrada a la aplicacion.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        main(1);
        main("Se prueba el segundo Main");
    }
}

