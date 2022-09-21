public class Main {
    public static void main(String[] args) {

        // FOR
        System.out.println("Time remaining for the bomb to explode :");
        for(int i = 10; i >= 0; i--){

            System.out.println(i);
        }
        System.out.println("BOOOOOOMMMBB!!!!");

        // WHILE
        int i = 1;
        while(i<=5){
            System.out.println(i+"st customer delivery in progress");
            i++;

        }
        System.out.println("All products have been delivered.");

        // DO-WHILE
        String gameScreen ="Splash screen showing..";
        System.out.println(gameScreen);
        int timer = 3;
        do {
            System.out.println("Splash screen closes :"+timer);
            timer--;
        }while(timer > 0);
        System.out.println("Game screen showing..");
    }
}