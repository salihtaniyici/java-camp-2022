public class Main {
    public static void main(String[] args) {
        GamerManager gamerManager = new GamerManager();
        GamerManager gamerManager2 = new GamerManager();
        gamerManager = gamerManager2;

        gamerManager.add();
        gamerManager.update();
        gamerManager.remove();
    }
}