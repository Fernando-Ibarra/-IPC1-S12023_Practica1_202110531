package Menus;
import Options.Sale;

import java.util.Scanner;

import static Menus.MenuP.showMenu;
import static Menus.Utils.*;
import static Options.Product.listProducts;
import static Options.Report.listProductReport;
import static Options.SalesProduct.listSaleProduct;
import static Options.Ticket.*;

public class Sales {
    static Scanner sc = new Scanner(System.in);

    public static void Sale(){
        String nameC;
        String nitC;

        sc.skip("\n");
        System.out.println("                                ");
        System.out.println(" ----------- REALIZA LA VENTA ----------- ");
        System.out.println("    NOMBRE CLIENTE ");
        nameC = sc.nextLine();
        System.out.println("    NIT DEL CLIENTE");
        nitC = sc.nextLine();
        nitC = validationNit(nitC);
        Sale mySale = new Sale(nameC, nitC);
        listProductToSale(listProducts);
        int menuProductOption;
        do {
            System.out.println("                                            ");
            System.out.println(" DESEAS AGREGAR UN PRODUCTO A LA LISTA ");
            System.out.println("[1] SÍ     [2] TERMINAR     [3] MOSTRAR PRODUCTOS OTRA VEZ     [0] SALIR");
            System.out.println();
            menuProductOption = sc.nextInt();
            switch (menuProductOption) {
                case 1:
                    System.out.println("                                                    ");
                    System.out.println(" ¿QUÉ PRODUCTO DESEA AGREGAR? SELECCIONE EL NÚMERO ");
                    int n = sc.nextInt();
                    System.out.println(" ¿CUÁNTOS DESEA AGREGAR? ");
                    int quality = sc.nextInt();
                    saleProduct(listProducts[n], listSaleProduct, quality);
                    toBurbuja(listProducts[n], listProductReport, quality);
                    break;
                case 2:
                    SalesU(mySale, listSaleProduct, listTickest);
                    break;
                case 3:
                    listProductToSale(listProducts);
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("POR FAVOR, SELECCIONE UNA OPCIÓN CORRECTA");
            }
        } while (menuProductOption!=0);

    }


}
