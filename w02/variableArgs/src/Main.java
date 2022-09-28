public class Main {
    public static void main(String[] args) {
        int result = multip(2,3,5,6);
        System.out.println(result);
    }
    public static int multip(int... numbers){
        int result = 1;
        for (int number:numbers) {
            result *= number;
        }
        return result;
    }
}