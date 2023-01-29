package Menus;

import Options.Product;
import java.util.Scanner;

import static Menus.MenuP.showMenu;

public class Products {
    static Scanner sc = new Scanner(System.in);

    public static void addProduct(){
        String nameP;
        int valorP;
        int menuProductOption = 0;
        System.out.println(" ----------- AGREGAR PRODUCTO ----------- ");
        System.out.println("    NOMBRE PRODUCTO ");
        nameP = sc.nextLine();
        System.out.println("    PRECIO PRODUCTO");
        valorP = sc.nextInt();

        Product myProduct = new Product(nameP, valorP);

        Product.addProductToArray(myProduct);

        do {
            System.out.println(" DESEA AGREGAR OTRO PRODUCTO ");
            System.out.println("[1] Sí");
            System.out.println("[2] No");

            menuProductOption = sc.nextInt();

            switch (menuProductOption) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showMenu();
                    break;
                default:
                    System.out.println("Please, select a correct answer");
            }
        } while (menuProductOption!=0);

    }
}
