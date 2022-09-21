public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,5,7,8,9,12,23,24};
        int wanted = 25;
        boolean isFound = false;

        for (int number:numbers){
            if ( number == wanted){
                isFound = true;
            }
        }

        if (isFound){
            System.out.println("Number available in array..");
        }else {
            System.out.println("Number unavailable in array..");
        }
    }
}