package ejercicio_3;

import java.util.Scanner;

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

        int izquierda = 0;
        int derecha = 0;

        System.out.println("-----------------------------------------------------------");
        System.out.println("|                      ¡BIENVENIDOS!                      |");
        System.out.println("-----------------------------------------------------------");

        RandomNumber.createArrayWithRandomNumbers();

        int response = 0;
        do {
            System.out.println("::Seleccione una opcion");
            System.out.println("1. Ordenar [Burbuja]");
            System.out.println("2. Ordenar [QuickSort]");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    RandomNumber.sortByBubble();
                    break;
                case 2:
                    RandomNumber.sortByQuickSort(RandomNumber.numbers, izquierda, derecha);
                    break;
                case 0:
                    break;
            }

        } while (response != 0);
    }
}
