package Menus;

import Options.*;

import java.util.Date;
import java.util.Scanner;

import static Options.Product.listProducts;
import static Options.Ticket.listTickest;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static String validationNameProduct(String name){
        for (Product listProduct : listProducts) {
            if (listProduct != null) {
                if (listProduct.getName().equals(name)) {
                    System.out.println(" ESTE PRODUCTO YA SE ENCUENTRA REGISTRADO ");
                    System.out.println(" COLOCAR OTRA NOMBRE ");
                    System.out.println("                                ");
                    System.out.println("    NOMBRE PRODUCTO ");
                    name = sc.nextLine();
                    return name;
                }
                break;
            }

            return name;
        }
        return name;
    }

    // PRODUCTS
    public static double validationPriceProduct(double valor){
        if (valor <1){
            System.out.println(" EL VALOR DEL PRODUCTO DEBE SER MAYOR A 0");
            System.out.println(" INGRESA UN VALOR CORRECTO");
            System.out.println("                                ");
            System.out.println("    PRECIO DEL PRODUCTO " );
            valor = sc.nextDouble();
            return valor;
        }
        return valor;
    }

    public static void listProductToSale(Product[] listProducts){
        System.out.println("                                                    ");
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
        if (valor <= 0 || valor >= 100) {
            System.out.println(" EL VALOR DEL CUPÓN DEBE SER MAYOR A 0 Y MENOR A 100");
            System.out.println(" INGRESA UN VALOR CORRECTO");
            System.out.println("                                ");
            System.out.println("    VALOR DEL CUPÓN (%) ");
            valor = sc.nextInt();
            validationValueTickets(valor);
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
            validationNameTicket(name);
            return name;
        }
        return name;
    }

    public static String validationNameTickets(String name){
        for (Ticket listTickest : listTickest) {
            if (listTickest != null) {
                if (listTickest.getName().equals(name)) {
                    System.out.println(" ESTE CUPÓN YA SE ENCUENTRA REGISTRADO ");
                    System.out.println(" COLOCAR OTRA NOMBRE ");
                    System.out.println("                                ");
                    System.out.println("    NOMBRE CUPÓN ");
                    name = sc.nextLine();
                    validationNameTickets(name);
                    return name;
                }
                break;
            }

            return name;
        }
        return name;
    }

    // SALES
    public static String validationNit(String nit){
        if (nit.length()>0){
            return nit;
        } else {
            return "C/F";
        }
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
        System.out.println("                                                            ");
        System.out.println(" ------------------------- TOTAL ------------------------- ");
        System.out.println("                    SUS PRODUCTOS SON  ");
        System.out.println("    NOMBRE           PRECIO         CANTIDAD        TOTAL");
        double totalF = 0;
        for (SalesProduct salesProduct : sale) {
            if (salesProduct != null) {
                double totalP = salesProduct.getProduct().getPrecio() * salesProduct.getQuantity();
                System.out.println("    " + salesProduct.getProduct().getName() + "           " + salesProduct.getProduct().getPrecio() + "                 " + salesProduct.getQuantity() + "              " + totalP);
                totalF += totalP;
            } else {
                break;
            }
        }
        AllSales Sale = new AllSales(person, sale);
        System.out.println("                       ");
        System.out.println(" DESEA GREGAR UN CUPÓN");
        System.out.println("  [1] SÍ        [2] NO  ");
        int res =  sc.nextInt();
        if (res==1){
            sc.skip("\n");
            System.out.println(" ESCRIBA EL CUPÓN ");
            String cupon = sc.nextLine();
            for (Ticket ticket : listTickest) {
                if (ticket != null) {
                    if (ticket.getName().equals(cupon)) {
                        double por = ticket.getValue();
                        double des = totalF * (por / 100);
                        double totalN = totalF - des;
                        printF(person, sale, ticket.getValue(), totalN, true);
                    }
                } else {
                    break;
                }
            }
        } else {
            printF(person, sale, 0, totalF, false);
        }
    }

    public static void printF(Sale person, SalesProduct[] sale, double valueCu, double totalF, boolean desc){
        System.out.println("                                                    ");
        System.out.println(" ----------------------- FACTURA ----------------------- ");
        System.out.println(" NOMBRE CLIENTE: " + person.getName());
        System.out.println(" NIT: " + person.getNit());
        System.out.println(" NOMBRE CAJERO: ENRIQUE FERNANDO GAITÁN IBARRA");
        System.out.println(" FECHA: " + new Date());
        double totalFa = 0;
        System.out.println("    NOMBRE           PRECIO         CANTIDAD        TOTAL");
        for (SalesProduct salesProduct : sale) {
            if (salesProduct != null) {
                double totalP = salesProduct.getProduct().getPrecio() * salesProduct.getQuantity();
                System.out.println(salesProduct.getProduct().getName() + "           " + salesProduct.getProduct().getPrecio() + "         " + salesProduct.getQuantity() + "        " + totalP);
                totalFa += totalP;
            } else {
                break;
            }
        }
        System.out.println(" SUBTOTAL: " + totalFa);
        if(desc){
            System.out.println(" PORCENTAJE DE DESCUENTO: "+ valueCu+"%");
            System.out.println(" TOTAL A PAGAR: Q "+totalF);
        } else {
            System.out.println(" TOTAL A PAGAR: Q "+totalF);
        }
    }

    // REPORT
    public static void toBurbuja(Product products, Report[] listProductReport, int quality){
        for (int i = 0; i < listProductReport.length; i++) {
            Report myProductoReport = new Report(products, quality);
            if(listProductReport[i] != null){
                if (listProductReport[i].getProduct().getName().equals(myProductoReport.getProduct().getName())){
                    int cant = listProductReport[i].getQuantity() + myProductoReport.getQuantity();
                    listProductReport[i].setQuantity(cant);
                    break;
                }
            } else {
                listProductReport[i] = myProductoReport;
                break;
            }
        }
    }

    public static void burbuja(Report[] listProductReport) {
        for (int i = 0; i < listProductReport.length; i++) {
            for (int j = 0; j < listProductReport.length - 1; j++) {
                if (listProductReport[j+1] != null) {
                    if (listProductReport[j].getQuantity() < listProductReport[j + 1].getQuantity()) {
                        Report temp = listProductReport[j];
                        listProductReport[j] = listProductReport[j + 1];
                        listProductReport[j + 1] = temp;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
