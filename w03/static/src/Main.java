public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id =1;
        product.name="All about history";
        product.stockAmount=10;
        product.price=24.9;

        productManager.add(product);

        DatabaseHelper.Connection.connect();
        DatabaseHelper.Crud.update();
    }
}