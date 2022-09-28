public class Main {
    public static void main(String[] args) {
        prime(24);
    }

    public static void prime(int number){

        boolean isPrime = true;

        if (number < 2){
            System.out.println("Value entered is invalid!");
            return;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Number is a prime.");
        }else {
            System.out.println("Number isn't a prime.");
        }
    }
}