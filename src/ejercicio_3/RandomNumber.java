package ejercicio_3;

import java.util.Random;

/**
 * Se crea la clase RandomNumber con el objetivo de crear un numero random.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 1.00.000 2022-02-15
 */
public class RandomNumber {

    /**
     * Se crea un array de tipo entero de numeros.
     */
    static int[] numbers = new int[5];
    /**
     * The Left.
     */
    static int left = 0;
    /**
     * The Right.
     */
    static int right = 0;

    /**
     * Se crea el metodo createArrayWithRandomNumbers con el objetivo de crear un array con numeros random.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    public static void createArrayWithRandomNumbers() {

        System.out.println("::Arreglo creado con numeros random::");
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    /**
     * Se crea el metodo sortByBubble con el objetivo de ordenar el array de numeros con el metodo de la burbuja.
     *
     *    RandomNumber.sortByBubble();
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    public static void sortByBubble() {

        System.out.println("::Arreglo ordenado con el metodo de la Burbuja::");
        int auxiliary = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    auxiliary = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = auxiliary;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    /**
     * Se crea el metodo sortByQuickSort con el objetivo de ordenar el array de numeros con el metodo QuickSort.
     *
     *    RandomNumber.sortByQuickSort(RandomNumber.numbers, izquierda, derecha);
     *
     * @param numbers int[] se pide un array de numeros.
     * @param left int se pide un numero izquierdo.
     * @param right int se pide un numero derecho.
     *
     * @author Santiago Ospina Osorio - santiago.m200@outlook.es
     *
     * @since 1.00.000 2022-02-15
     */
    public static void sortByQuickSort(int[] numbers, int left, int right) {

        System.out.println("::Arreglo ordenado con el metodo Quick Sort::");
        int pivot = numbers[left];
        int i = left;
        int j = right;
        int auxiliary;

        while (i < j) {
            while (numbers[i] <= pivot && i < j) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i < j) {
                auxiliary = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = auxiliary;
            }
        }
        numbers[left] = numbers[j];
        numbers[j] = pivot;

        if (left < j - 1) {
            sortByQuickSort(numbers, left, j - 1);
        }
        if (j + 1 < right) {
            sortByQuickSort(numbers, j + 1, right);
        }

        for (int m = 0; m < numbers.length; m++) {
            System.out.print(numbers[m] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
