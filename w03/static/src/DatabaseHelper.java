public class DatabaseHelper
{
    public static class Crud{ // Crud -> create , read , update , delete
        public static void update(){
            System.out.println("Database updated!");
        }
        public static void delete(){
            System.out.println("Data deleted!");
        }
    }
    public static class Connection{
        public static void connect(){
            System.out.println("Waiting for server connection..");
        }
        public static void disconnect(){
            System.out.println("Disconnecting from server...");
        }
    }
}
