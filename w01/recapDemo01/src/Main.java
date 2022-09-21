public class Main {
    public static void main(String[] args) {

        int number1 = 19;
        int number2 = 13;
        int number3 = 20;
        int bgNum = number1;

        if (bgNum < number2){
            bgNum = number2;
        } else if (bgNum < number3) {
            bgNum = number3;
        }

        System.out.println("The biggest number is : "+bgNum);
    }
}