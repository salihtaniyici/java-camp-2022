public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("A");
        product.setDescription("first letter of the alphabet");
        Product product1 = new Product(2,"B","second letter of the alphabet");

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());

        System.out.println(product1.getId());
        System.out.println(product1.getName());
        System.out.println(product1.getDescription());


    }
}