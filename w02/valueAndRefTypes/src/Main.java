public class Main {
    public static void main(String[] args) {

        // primitives are value type
        int speed = 23;
        int boost = 50;
        boost = speed;
        speed=30;
        System.out.println(boost);

        // arrays are reference type
        int[] value = new int[]{26,82,91};
        int[] risen = new int[]{3,9,7};
        risen = value;
        value[0]=90;
        System.out.println(risen[0]);




    }
}