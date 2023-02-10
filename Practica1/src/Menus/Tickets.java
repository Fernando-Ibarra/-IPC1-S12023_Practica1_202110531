package Menus;

import Options.Ticket;

import java.util.Scanner;

import static Menus.MenuP.showMenu;
import static Menus.Utils.*;

public class Tickets {
    static Scanner sc = new Scanner(System.in);

    public static void addTickets(){
        String nameTicket;
        int valueTicket;
        sc.skip("\n");
        System.out.println("                                ");
        System.out.println(" ----------- AGREGAR CUPÓN ----------- ");
        System.out.println("    NOMBRE DEL CUPÓN ");
        nameTicket = sc.nextLine();
        nameTicket = validationNameTicket(nameTicket);
        nameTicket = validationNameTickets(nameTicket);

        System.out.println("    VALOR DEL CUPÓN (%) " );
        valueTicket = sc.nextInt();

        valueTicket = validationValueTickets(valueTicket);

        Ticket myTicket = new Ticket(nameTicket, valueTicket);

        Ticket.addTicketToArray(myTicket);

        int menuProductOption;
        do {
            System.out.println("                                ");
            System.out.println("        DESEA AGREGAR OTRO CUPÓN ");
            System.out.println("            [1] SÍ    [2] NO    ");

            menuProductOption = sc.nextInt();

            switch (menuProductOption) {
                case 1:
                    addTickets();
                    break;
                case 2:
                    showMenu();
                    break;
                default:
                    System.out.println("POR FAVOR, SELECCIONAR UNA OPCIÓN CORRECTA");
            }
        } while (menuProductOption!=0);
    }
}
