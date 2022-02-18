package ejercicio_5.ui;

import ejercicio_5.vehicle.*;

import java.util.Scanner;

/**
 * Se crea la clase UIMenu con el objetivo de crear una interfaz para el usuario.
 *
 * @version 1.00.000 2022-02-15
 *
 * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
 *
 * @since 1.00.000 2022-02-18
 */
public class UIMenu {

    /**
     * Se crea el  metodo showMenu con el objetivo de mostrar al usuario el menu inicial.
     *
     *    showMenu();
     *
     * @author Santiago Ospina Osorio <santiago.m200@outlook.es>
     *
     * @since 1.00.000 2022-02-18
     */
    public static void showMenu() {

        System.out.println("***********************************************************");
        System.out.println("*                      ¡BIENVENIDO!                       *");
        System.out.println("***********************************************************");

        int response = 0;
        do {
            System.out.println(" ");
            System.out.println("::Se tiene la posibilidad de ingresar maximo 10 vehiculos::");
            System.out.println("::Seleccione el tipo de Vehiculo que desea crear::");
            System.out.println("1. Bicicleta");
            System.out.println("2. Carro");
            System.out.println("3. Lancha");
            System.out.println("4. Motocicleta");
            System.out.println("5. Camion");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            try {
                response = Integer.parseInt(sc.nextLine());
                if(response > 5){
                    System.out.println("Error!, seleccione una opcion valida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error!, ingreso un número y/o, letra incorrecta, seleccione una opcion valida");
            }
            int counter = 0;

            if (counter <= 10) {

                switch (response) {
                    case 1:
                        System.out.println("***********************************************************");
                        System.out.println("*                        BICICLETA                        *");
                        System.out.println("***********************************************************");
                        Bicycle.createBicycles();
                        counter++;
                        break;
                    case 2:
                        System.out.println("***********************************************************");
                        System.out.println("*                          CARRO                          *");
                        System.out.println("***********************************************************");
                        Car.createCars();
                        counter++;
                        break;
                    case 3:
                        System.out.println("***********************************************************");
                        System.out.println("*                          LANCHA                         *");
                        System.out.println("***********************************************************");
                        Motorboat.createMotorboats();
                        counter++;
                        break;
                    case 4:
                        System.out.println("***********************************************************");
                        System.out.println("*                       MOTOCICLETA                       *");
                        System.out.println("***********************************************************");
                        Motorcycle.createMotorcycles();
                        counter++;
                        break;
                    case 5:
                        System.out.println("***********************************************************");
                        System.out.println("*                          CAMION                         *");
                        System.out.println("***********************************************************");
                        Truck.createTrucks();
                        counter++;
                        break;
                    case 0:
                        System.out.println("¡¡ Vuelve pronto !!");
                        break;
                }
            } else {
                System.out.println("¡¡ Vuelve pronto !!");
                break;
            }

        } while (response != 0);

    }


}
