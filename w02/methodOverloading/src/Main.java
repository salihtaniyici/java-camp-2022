public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.addition(2,3);
        int result02 = calculator.addition(2,3,5);

        System.out.println("Result :"+result);
        System.out.println("Result :"+result02);

    }
}