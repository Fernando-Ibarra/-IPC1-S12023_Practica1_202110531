package Menus;

import Options.Product;
import java.util.Scanner;

import static Menus.MenuP.showMenu;
import static Menus.Utils.validationNameProduct;
import static Menus.Utils.validationPriceProduct;

public class Products {
    static Scanner sc = new Scanner(System.in);

    public static void addProduct(){
        String nameP;
        int valorP;
        sc.skip("\n");
        System.out.println(" ----------- AGREGAR PRODUCTO ----------- ");
        System.out.println("                                            ");
        System.out.println("    NOMBRE PRODUCTO ");
        nameP = sc.nextLine();
        validationNameProduct(nameP);
        System.out.println("                                            ");
        System.out.println("    PRECIO DEL PRODUCTO");
        valorP = sc.nextInt();
        valorP = validationPriceProduct(valorP);


        Product myProduct = new Product(nameP, valorP);

        Product.addProductToArray(myProduct);

        int menuProductOption = 0;
        do {
            System.out.println("                                ");
            System.out.println(" DESEA AGREGAR OTRO PRODUCTO ");
            System.out.println("[1] Sí");
            System.out.println("[2] No");
            System.out.println("[3] MOSTRAR PRODUCTOS ");

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
