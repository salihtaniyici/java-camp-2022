public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id=1;
        product.name="ASUS TUF Gaming";
        product.description="FX505DT-BQ108T";
        product.stockAmount=3;
        product.price=4800;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}