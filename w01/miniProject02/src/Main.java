public class Main {
    public static void main(String[] args) {
        char h = 'P';

        switch (h){
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Girdiğiniz harf kalın sesli bir harf.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Girdiğiniz harf ince sesli bir harf.");
                break;
            default:
                System.out.println("Lütfen sesli bir harf giriniz!");
                break;
        }

    }
}