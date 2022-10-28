public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] baseLoanManagers = new BaseLoanManager[]{new GeneralPurposeLoanManager(),new CarLoanManager(),new HouseLoanManager()};
        for (BaseLoanManager baseLoanManager : baseLoanManagers){
            System.out.println(baseLoanManager.calculate(2000));
        }

    }
}