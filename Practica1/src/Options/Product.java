package Options;

public class Product {
    private String name;
    private int precio;

    static Product[] listProducts = new Product[20];
    public Product(String name, int precio){
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static Product[] getListProducts() {
        return listProducts;
    }

    public static void setListProducts(Product[] listProducts) {
        Product.listProducts = listProducts;
    }

    public static void showListProducts(){
        System.out.println(" #    PRODUCTO                   VALOR");
        for (int i=0; i<=listProducts.length; i++){
            System.out.println(i + "    " + listProducts[i].name + "       " + listProducts[i].precio);
        };
    }

    public static void addProductToArray(Product myProduct){
        for (int i=0; i<= listProducts.length;  i++){
            if (listProducts[i] != null){
                if (listProducts[i].name.equals(myProduct.name)){
                    System.out.println(" ESE PRODUCTO YA EXISTE");
                    System.out.println(" INGRESA OTRO NOMBRE");
                    break;
                }

                if (myProduct.precio<1){
                    System.out.println(" EL VALOR DEL PRODUCTO DEBE SER MAYOR A 0");
                    System.out.println(" INGRESA UN VALOR CORRECTO");
                    break;
                }
            }

            if (listProducts[i] == null){
                listProducts[i] = myProduct;
                break;
            }
        }
    }

}
