package Menus;

import java.util.Scanner;

import static Menus.Products.addProduct;
import static Menus.Reports.Report;
import static Menus.Sales.Sale;
import static Menus.Tickets.addTickets;

public class MenuP {
    static Scanner sc = new Scanner(System.in);
    public static void validation(String userU, String passwordU){

        String user;
        String password;

        System.out.println("$$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\");
        System.out.println("$$\\        $$$$$$\\  $$\\   $$\\ $$$$$$$\\  $$$$$$$$\\ $$$$$$$\\         $$$$$$\\  $$$$$$$\\        $$\\ \n" +
                "$$ |      $$  __$$\\ $$ |  $$ |$$  __$$\\ $$  _____|$$  __$$\\       $$  __$$\\ $$  ____|       $$ |\n" +
                "$$ |      $$ /  \\__|$$ |  $$ |$$ |  $$ |$$ |      $$ |  $$ |      \\__/  $$ |$$ |            $$ |\n" +
                "\\__|      \\$$$$$$\\  $$ |  $$ |$$$$$$$  |$$$$$\\    $$$$$$$  |       $$$$$$  |$$$$$$$\\        \\__|\n" +
                "$$\\        \\____$$\\ $$ |  $$ |$$  ____/ $$  __|   $$  __$$<       $$  ____/ \\_____$$\\       $$\\ \n" +
                "$$ |      $$\\   $$ |$$ |  $$ |$$ |      $$ |      $$ |  $$ |      $$ |      $$\\   $$ |      $$ |\n" +
                "$$ |      \\$$$$$$  |\\$$$$$$  |$$ |      $$$$$$$$\\ $$ |  $$ |      $$$$$$$$\\ \\$$$$$$  |      $$ |\n" +
                "\\__|       \\______/  \\______/ \\__|      \\________|\\__|  \\__|      \\________| \\______/       \\__");
        System.out.println("$$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ $$$$$$\\ \n");
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
        int menuOption;
        do {
            System.out.println("SELECCIONA LA OPCIÓN DESEADA");
            System.out.println("[1] AGREGAR PRODUCTOS");
            System.out.println("[2] AGREGAR CUPONES DE DESCUENTO");
            System.out.println("[3] REALIZAR VENTA");
            System.out.println("[4] IMPRIMIR REPORTE");
            System.out.println("[5] SALIR");

            menuOption = sc.nextInt();

            switch (menuOption) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    addTickets();
                    break;
                case 3:
                    Sale();
                    break;
                case 4:
                    Report();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("POR FAVOR, SELECCIONE UNA OPCIÓN CORRECTA");
            }
        } while (menuOption!=0);

    }
}
