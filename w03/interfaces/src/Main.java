public class Main {
    public static void main(String[] args) {
        /*ICustomerDal iCustomerDal = new ICustomerDal() {
            @Override
            public void Add() {

            }
        }*/
        // ICustomerDal iCustomerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        //customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
    }
}