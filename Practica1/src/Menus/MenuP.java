package Menus;

import java.util.Scanner;

import static Menus.Products.addProduct;
import static Menus.Tickets.addTickets;

public class MenuP {
    static Scanner sc = new Scanner(System.in);
    public static void validation(String userU, String passwordU){

        String user;
        String password;

        System.out.println("             $$$$$$\\  $$\\   $$\\ $$$$$$$\\  $$$$$$$$\\ $$$$$$$\\                       $$$$$$\\  $$$$$$$\\  \n" +
                "            $$  __$$\\ $$ |  $$ |$$  __$$\\ $$  _____|$$  __$$\\                     $$  __$$\\ $$  ____| \n" +
                "            $$ /  \\__|$$ |  $$ |$$ |  $$ |$$ |      $$ |  $$ |                    \\__/  $$ |$$ |      \n" +
                "            \\$$$$$$\\  $$ |  $$ |$$$$$$$  |$$$$$\\    $$$$$$$  |      $$$$$$\\        $$$$$$  |$$$$$$$\\  \n" +
                "             \\____$$\\ $$ |  $$ |$$  ____/ $$  __|   $$  __$$<       \\______|      $$  ____/ \\_____$$\\ \n" +
                "            $$\\   $$ |$$ |  $$ |$$ |      $$ |      $$ |  $$ |                    $$ |      $$\\   $$ |\n" +
                "            \\$$$$$$  |\\$$$$$$  |$$ |      $$$$$$$$\\ $$ |  $$ |                    $$$$$$$$\\ \\$$$$$$  |\n" +
                "             \\______/  \\______/ \\__|      \\________|\\__|  \\__|                    \\________| \\______/ ");
        System.out.println(" ------------------------------------------------------------------------------------------------- ");
        System.out.println("                                                                                                   ");
        System.out.println("    Ingresa tu usuario");
        user = sc.nextLine();
        System.out.println("    Ingresa tu contraseña ");
        password = sc.nextLine();

        if (userU.equals(user) && passwordU.equals(password)){
            System.out.println("Usuario y contraseña correcta");
            showMenu();
        } else {
            System.out.println("Usuario o contraseña incorrecta");
            System.out.println("Vuelve a intentarlo");
            validation(userU, passwordU);
        }

    }

    public static void showMenu(){
        int menuOption = 0;
        do {
            System.out.println("Selecciona la opción deseada");
            System.out.println("[1] Agregar nuevos productos");
            System.out.println("[2] Agregar cupones de descuento");
            System.out.println("[3] Realizar venta");
            System.out.println("[4] Realizar reporte");

            menuOption = sc.nextInt();

            switch (menuOption) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    addTickets();
                    break;
                case 3:
                    System.out.println("Realizar venta");
                    break;
                case 4:
                    System.out.println("Realizar reporte");
                    break;
                default:
                    System.out.println("Please, select a correct answer");
            }
        } while (menuOption!=0);

    }
}
