public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("LOGITECH M280 KABLOSUZ MOUSE");
        product.setDescription("Ekstra konfor ve hassasiyet");
        product.setColor("Black");
        product.setStockAmount(8);
        product.setPrice(280);


        ProductManager productManager = new ProductManager();
        productManager.add(product);


        System.out.println(product.getBarcode());


    }
}