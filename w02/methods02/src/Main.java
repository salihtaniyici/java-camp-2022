public class Main {
    public static void main(String[] args) {
        Add();
        System.out.println(message("Hello World!"));
        System.out.println(insert(23,24));

    }
    public static void Add(){
        System.out.println("Added!");
    }
    public static String message(String msg){
        return msg;
    }

    public static int insert(int n1,int n2){
        return n1+n2;
    }
}