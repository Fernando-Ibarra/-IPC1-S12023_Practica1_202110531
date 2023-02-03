package Menus;


import Options.Report;

import static Menus.MenuP.showMenu;
import static Menus.Utils.burbuja;
import static Options.Report.listProductReport;

public class Reports {
    public static void Report() {
        burbuja(listProductReport);
        System.out.println("    PRODUCTO           CANTIDAD");
        for (Report arr : listProductReport) {
            if (arr != null){
                System.out.println("   "+ arr.getProduct().getName() + "           " + arr.getQuantity());
            } else {
                break;
            }
        }
        showMenu();
    }
}
