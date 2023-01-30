package Menus;

import java.util.Scanner;

import static Options.Product.listProducts;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static String validationNameProduct(String name){
        for (int i = 0; i <listProducts.length; i++) {
            if (listProducts[i] != null){
                if(listProducts[i].getName().equals(name)){
                    System.out.println(" ESTE PRODUCTO YA SE ENCUENTRA REGISTRADO ");
                    System.out.println(" COLOCAR OTRA NOMBRE ");
                    System.out.println("                                ");
                    System.out.println("    NOMBRE PRODUCTO ");
                    name = sc.nextLine();
                    return name;
                }
                break;
            }

            if (listProducts[i] == null){
                return name;
            }
            break;
        }
        return name;
    }

    // PRODUCTS
    public static int validationPriceProduct(int valor){
        if (valor <1){
            System.out.println(" EL VALOR DEL PRODUCTO DEBE SER MAYOR A 0");
            System.out.println(" INGRESA UN VALOR CORRECTO");
            System.out.println("                                ");
            System.out.println("    PRECIO DEL PRODUCTO " );
            valor = sc.nextInt();
            return valor;
        }
        return valor;
    }

    // TICKETS
    public static int validationValueTickets(int valor){
        if (valor <1 && valor>99){
            System.out.println(" EL VALOR DEL CUPÓN DEBE SER MAYOR A 0 Y MENOR A 100");
            System.out.println(" INGRESA UN VALOR CORRECTO");
            System.out.println("                                ");
            System.out.println("    VALOR DEL CUPÓN (%) " );
            valor = sc.nextInt();
            return valor;
        }
        return valor;
    }

    public static String validationNameTicket(String name){
        if (name.length() > 4){
            System.out.println(" EL CUPÓN DEBE SER DE 4 CARÁCTERES");
            System.out.println(" INGRESA OTRO NOMBRE ");
            System.out.println("                                ");
            System.out.println("    NOMBRE DEL CUPÓN ");
            name = sc.nextLine();
            return name;
        }
        return name;
    }
}
