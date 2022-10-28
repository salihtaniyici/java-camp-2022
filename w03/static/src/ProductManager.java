public class ProductManager {
    public void add(Product product){
        //ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product)){
            System.out.println(product.name + " added!");
        }else{
            System.out.println("Product information is invalid!!");
        }

    }
}
