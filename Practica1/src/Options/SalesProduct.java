package Options;

public class SalesProduct extends ProductUse {

    public SalesProduct(Product product, int quantity){
        super(product, quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static SalesProduct[] getListSaleProduct() {
        return listSaleProduct;
    }

    public static void setListSaleProduct(SalesProduct[] listSaleProduct) {
        SalesProduct.listSaleProduct = listSaleProduct;
    }

    public static SalesProduct[] listSaleProduct = new SalesProduct[20];

}
