public class ProductValidator {

    static {
        System.out.println("Static constructor!");
    }
    public static boolean isValid(Product product){
         if ( product.stockAmount > 0 && !product.name.isEmpty()){
             return true;
         }else {
             return false;
         }
    }
}
