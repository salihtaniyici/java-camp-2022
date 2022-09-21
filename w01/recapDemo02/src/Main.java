public class Main {
    public static void main(String[] args) {

        double[] height = {1.50,1.67,1.73,1.80,3.49};
        double max=height[0];
        double total=0;
        System.out.println("Heights :");
        for (double hght:height){
            if (max < hght){
                max = hght;
            }
            total = total + hght;
            System.out.println(hght);
        }
        System.out.println("Max Height :"+max);
        System.out.println("Total :"+total);


    }
}