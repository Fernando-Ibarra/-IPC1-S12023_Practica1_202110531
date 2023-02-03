package Options;

public class Product {
    private String name;
    private double precio;

    public Product(String name, double precio){
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio<1){
            System.out.println(" EL VALOR DEL PRODUCTO DEBE SER MAYOR A 0");
            System.out.println(" INGRESA UN VALOR CORRECTO");
        } else {
            this.precio = precio;
        }
    }

    public static Product[] listProducts = new Product[20];
    public static Product[] getListProducts() {
        return listProducts;
    }

    public static void setListProducts(Product[] listProducts) {
        Product.listProducts = listProducts;
    }


    public static void validationNameProduct(Product listProducts, Product myProduct){
        if (listProducts.name.equals(myProduct.name)){
            System.out.println(" ESE PRODUCTO YA EXISTE");
            System.out.println(" INGRESA OTRO NOMBRE");
        }
    }

    public static void addProductToArray(Product myProduct){
        for (int i=0; i<= listProducts.length;  i++){
            if (listProducts[i] != null){
                validationNameProduct(listProducts[i], myProduct);
            }

            if (listProducts[i] == null){
                listProducts[i] = myProduct;
                break;
            }
        }
    }

}
