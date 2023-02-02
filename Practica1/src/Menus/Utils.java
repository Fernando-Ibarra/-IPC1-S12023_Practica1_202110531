package Menus;

import Options.*;

import java.util.Date;
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

    public static void listProductToSale(Product[] listProducts){
        System.out.println("            #               NOMBRE              VALOR   ");
        for (int i = 0; i <listProducts.length; i++) {
            if (listProducts[i]!=null){
                System.out.println("            ["+i+"]               " +listProducts[i].getName()+"              "+listProducts[i].getPrecio());
            } else {
                break;
            }

        }
    }

    // TICKETS
    public static int validationValueTickets(int valor){
        if (valor >0 && valor<100){
            return valor;
        } else{
            System.out.println(" EL VALOR DEL CUPÓN DEBE SER MAYOR A 0 Y MENOR A 100");
            System.out.println(" INGRESA UN VALOR CORRECTO");
            System.out.println("                                ");
            System.out.println("    VALOR DEL CUPÓN (%) " );
            valor = sc.nextInt();
            return valor;
        }
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

    // SALES
    public static String validationNit(String nit){
        if (nit == null){
            return "C/F";
        }
        return nit;
    }

    public static Product getProducToSale(Product[] listProducts, int n){
        for (int i = 0; i < listProducts.length; i++) {
            if(listProducts[i] == listProducts[n]){
                return listProducts[i];
            }
            break;
        }
        return listProducts[n];
    }

    public static void saleProduct(Product products, SalesProduct[] listSaleProduct, int quality){
        for (int i = 0; i < listSaleProduct.length; i++) {
            if (listSaleProduct[i] == null){
                SalesProduct mySaleProducto = new SalesProduct(products, quality);
                listSaleProduct[i] = mySaleProducto;
                break;
            }
        }
    }

    public static void SalesU(Sale person, SalesProduct[] sale, Ticket[] listTickest){
        System.out.println(" -------------------- TOTAL -------------------- ");
        System.out.println("     SUS PRODUCTOS SON");
        System.out.println("    NOMBRE           PRECIO         CANTIDAD        TOTAL");
        double totalF = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] != null) {
                double totalP = sale[i].getProduct().getPrecio()*sale[i].getQuantity();
                System.out.println("    "+sale[i].getProduct().getName() + "           " + sale[i].getProduct().getPrecio() + "                 "+ sale[i].getQuantity() + "              " +totalP);
                totalF +=totalP;
            } else {
                break;
            }

        }
        AllSales Sale = new AllSales(person, sale);
        System.out.println(" DESEA GREGAR UN CUPÓN");
        System.out.println("  [1] SÍ        [2] NO  ");
        int res =  sc.nextInt();
        if (res==1){
            System.out.println(" ESCRIBA EL CUPÓN ");
            String cupon = sc.nextLine();
            for (int i = 0; i < listTickest.length; i++) {
                if(listTickest[i].getName().equals(cupon)){
                    double des = totalF * (listTickest[i].getValue() / 100);
                    totalF = totalF - des;
                    printF(person, sale, listTickest[i].getValue(), totalF, true);
                    break;
                }
            }
        } else {
            printF(person, sale, 0, totalF, false);
        }
    }

    public static void printF(Sale person, SalesProduct[] sale, double valueCu, double totalF, boolean desc){
        System.out.println(" ----------------------- FACTURA ----------------------- ");
        System.out.println(" NOMBRE CLIENTE: " + person.getName());
        System.out.println(" NIT: " + person.getNit());
        System.out.println(" NOMBRE CAJERO: ENRIQUE FERNANDO GAITÁN IBARRA");
        System.out.println(" FECHA: " + new Date());
        double totalFa = 0;
        for (int i = 0; i < sale.length; i++) {
            double totalP = sale[i].getProduct().getPrecio()*sale[i].getQuantity();
            System.out.println(sale[i].getProduct().getName() + "           " + sale[i].getProduct().getPrecio() + "         "+ sale[i].getQuantity() + "        " +totalP);
            totalFa +=totalP;
        }
        System.out.println(" SUBTOTAL: " + totalFa);
        if(desc == true){
            System.out.println(" PORCENTAJE DE DESCUENTO: "+ valueCu+"%");
            System.out.println(" TOTAL A PAGAR: Q "+totalF);
        } else {
            System.out.println(" TOTAL A PAGAR: Q "+totalF);
        }
    }
}
