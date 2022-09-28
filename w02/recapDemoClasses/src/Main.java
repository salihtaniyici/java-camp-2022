public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.addition(23,24);
        System.out.println(result);
        result = calculator.extraction(23,24);
        System.out.println(result);
        result = calculator.multiplication(23,24);
        System.out.println(result);
        result = calculator.divide(23,24);
        System.out.println(result);

    }
}