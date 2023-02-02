package Options;

public class Sale {
    String name;
    String nit;

    public Sale(String name, String nit) {
        this.name = name;
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public static Sale[] listSale = new Sale[20];

    public static Sale[] getListSale() {
        return listSale;
    }

    public static void setListSale(Sale[] listSale) {
        Sale.listSale = listSale;
    }


}
