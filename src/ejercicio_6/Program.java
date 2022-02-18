package ejercicio_6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Se crea la clase abstracta Program con el objetivo de implementar un programa que detecte si se ingresa dos numeros seguidos
 * por consola.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class Program {

    /**
     * Se crea el metodo equalNumber con el objetivo de identificar si se ingresan dos numeros iguales por consola utilizando
     * la clase Vector de Java.
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-15
     */
    public static void equalNumber(){

        Vector<Integer> vector = new Vector<>();
        int number;

        try {
            do {
                Scanner response = new Scanner(System.in);
                System.out.print("Ingresa un numero: ");
                number = response.nextInt();

                if (!vector.contains(number)) {

                    vector.add(number);

                } else if (number == vector.lastElement()){

                    System.out.println("¡Numero repetido!");
                    System.out.println(vector);
                    break;
                }

            } while (number >= 0);

        } catch (InputMismatchException e) {
            System.out.println("Error!, ingreso un caracter inválido.");
        }
    }
}
