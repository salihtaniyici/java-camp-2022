public class CustomerManager {

    // ICustomerDal customerDal;
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        // Business Codes
        customerDal.add();
    }
}
