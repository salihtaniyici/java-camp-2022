public class Main {
    public static void main(String[] args) {

        int rocketSpeed = 5900;

        switch (rocketSpeed) {

            case 2500:
                System.out.println("Roket speed set to 2500 m/s");
                break;
            case 3000:
                System.out.println("Roket speed set to 3000 m/s");
                break;
            case 3500:
                System.out.println("Roket speed set to 3500 m/s");
                break;
            case 4000:
                System.out.println("Roket speed set to 4000 m/s");
                break;
            case 4500:
                System.out.println("Roket speed set to 4500 m/s");
                break;
            case 5000:
                System.out.println("Roket speed set to 5000 m/s");
                break;
            case 5500:
                System.out.println("Roket speed set to 5000 m/s");
                break;
            default:
                System.out.println("Warning ! Rocket overload detected..!");
                break;
        }

    }
}